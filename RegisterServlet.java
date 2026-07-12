package com.ngo.controller;

import java.io.IOException;
import java.sql.*;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.ngo.util.DBConnection;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        try {
            Connection con = DBConnection.getConnection();

            String email = req.getParameter("email");

            PreparedStatement check = con.prepareStatement(
                "SELECT * FROM visitors WHERE email=?"
            );
            check.setString(1, email);

            ResultSet rs = check.executeQuery();

            if (rs.next()) {
                res.sendRedirect(req.getContextPath() + "/register.jsp?error=1");
                return;
            }

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO visitors(name,email,password,mobile) VALUES(?,?,?,?)"
            );

            ps.setString(1, req.getParameter("name"));
            ps.setString(2, email);
            ps.setString(3, req.getParameter("password"));
            ps.setString(4, req.getParameter("mobile"));

            ps.executeUpdate();

            res.sendRedirect(req.getContextPath() + "/login.jsp?success=1");

        } catch (Exception e) {
            e.printStackTrace();
            res.sendRedirect(req.getContextPath() + "/register.jsp?error=1");
        }
    }
}