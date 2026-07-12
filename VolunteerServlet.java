package com.ngo.controller;

import java.io.IOException;
import java.sql.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import com.ngo.util.DBConnection;

@WebServlet("/volunteer")
public class VolunteerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {
        try {
            String email = (String) req.getSession().getAttribute("visitorEmail");
            String role = req.getParameter("role");
            String mobile = req.getParameter("mobile");
            String location = req.getParameter("location"); // NEW

            Connection con = DBConnection.getConnection();

            // Fetch actual visitor name from visitors table
            String name = email.split("@")[0]; // fallback
            PreparedStatement psName = con.prepareStatement(
                "SELECT name FROM visitors WHERE email=?"
            );
            psName.setString(1, email);
            ResultSet rs = psName.executeQuery();
            if (rs.next() && rs.getString("name") != null) {
                name = rs.getString("name");
            }

            // Check if already applied
            PreparedStatement psCheck = con.prepareStatement(
                "SELECT id FROM volunteers WHERE email=?"
            );
            psCheck.setString(1, email);
            ResultSet rsCheck = psCheck.executeQuery();
            if (rsCheck.next()) {
                // Already applied — update role only if rejected
                res.sendRedirect(req.getContextPath() + "/visitor.jsp?error=already");
                return;
            }

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO volunteers(name, email, role, mobile, location, status) VALUES(?,?,?,?,?,'PENDING')"
            );
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, role);
            ps.setString(4, mobile);
            ps.setString(5, location);
            ps.executeUpdate();

            res.sendRedirect(req.getContextPath() + "/visitor.jsp?success=volunteer");
        } catch (Exception e) {
            e.printStackTrace();
            res.sendRedirect(req.getContextPath() + "/visitor.jsp?error=1");
        }
    }
}
