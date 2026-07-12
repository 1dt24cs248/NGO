package com.ngo.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import com.ngo.util.DBConnection;

@WebServlet("/updateHelpStatus")
public class UpdateHelpStatusServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {
        try {
            int id = Integer.parseInt(req.getParameter("id"));
            String status = req.getParameter("status");
            Connection con = DBConnection.getConnection();

            // Simple update — only status column, which always exists
            PreparedStatement ps = con.prepareStatement(
                "UPDATE help_requests SET status=? WHERE id=?"
            );
            ps.setString(1, status);
            ps.setInt(2, id);
            int rows = ps.executeUpdate();

            System.out.println("UpdateHelpStatus: updated " + rows + " row(s), id=" + id + ", status=" + status);

            res.sendRedirect(req.getContextPath() + "/admin.jsp?success=1#helpRequests");

        } catch (Exception e) {
            e.printStackTrace();
            res.sendRedirect(req.getContextPath() + "/admin.jsp?error=1");
        }
    }
}

