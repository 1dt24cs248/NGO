package com.ngo.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import com.ngo.util.DBConnection;

@WebServlet("/addExpense")
public class AddExpenseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {
        try {
            String reason = req.getParameter("reason");
            int amount = Integer.parseInt(req.getParameter("amount"));

            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO expenses(reason, amount) VALUES(?, ?)"
            );
            ps.setString(1, reason);
            ps.setInt(2, amount);
            ps.executeUpdate();

            res.sendRedirect(req.getContextPath() + "/admin.jsp?success=1#fundDist");
        } catch (Exception e) {
            e.printStackTrace();
            res.sendRedirect(req.getContextPath() + "/admin.jsp");
        }
    }
}
