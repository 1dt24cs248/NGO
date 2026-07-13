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

        String name = req.getParameter("name").trim();
        String email = req.getParameter("email").trim();
        String password = req.getParameter("password");
        String mobile = req.getParameter("mobile").trim();

        if (name.isEmpty() || email.isEmpty() || password.isEmpty() || mobile.isEmpty()) {
            res.sendRedirect("register.jsp?error=empty");
            return;
        }

        if (password.length() < 6) {
            res.sendRedirect("register.jsp?error=password");
            return;
        }

        try (Connection con = DBConnection.getConnection()) {

            PreparedStatement check = con.prepareStatement(
                    "SELECT id FROM visitors WHERE email=?");
            check.setString(1, email);

            if (check.executeQuery().next()) {
                res.sendRedirect("register.jsp?error=exists");
                return;
            }

            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO visitors(name,email,password,mobile) VALUES(?,?,?,?)");

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, password);
            ps.setString(4, mobile);

            ps.executeUpdate();

            HttpSession session = req.getSession();
            session.setAttribute("visitorEmail", email);

            res.sendRedirect("login.jsp?success=1");

        } catch (Exception e) {
            e.printStackTrace();
            res.sendRedirect("register.jsp?error=1");
        }
    }
}