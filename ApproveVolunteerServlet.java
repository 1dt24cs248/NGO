package com.ngo.controller;
 
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import com.ngo.util.DBConnection;
 
@WebServlet("/approveVolunteer")
public class ApproveVolunteerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {
        try {
            int id = Integer.parseInt(req.getParameter("id"));
            Connection con = DBConnection.getConnection();
 
            // Get role for notification message
            String role = "Volunteer";
            PreparedStatement psGet = con.prepareStatement(
                "SELECT role FROM volunteers WHERE id=?"
            );
            psGet.setInt(1, id);
            ResultSet rs = psGet.executeQuery();
            if (rs.next()) role = rs.getString("role");
 
            String notifMsg = "🎉 Congratulations! Your volunteer application for '"
                + role + "' has been APPROVED. Welcome to the HaritSeva team!";
 
            // Try with notification column — if it fails fall back to status only
            try {
                PreparedStatement ps = con.prepareStatement(
                    "UPDATE volunteers SET status='APPROVED', notification=? WHERE id=?"
                );
                ps.setString(1, notifMsg);
                ps.setInt(2, id);
                ps.executeUpdate();
            } catch (Exception inner) {
                // notification column might not exist yet — just update status
                PreparedStatement ps2 = con.prepareStatement(
                    "UPDATE volunteers SET status='APPROVED' WHERE id=?"
                );
                ps2.setInt(1, id);
                ps2.executeUpdate();
            }
 
            res.sendRedirect(req.getContextPath() + "/admin.jsp?success=1#volunteers");
        } catch (Exception e) {
            e.printStackTrace();
            res.sendRedirect(req.getContextPath() + "/admin.jsp?error=1");
        }
    }
}