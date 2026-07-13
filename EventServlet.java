package com.ngo.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.ngo.util.DBConnection;

@WebServlet("/event")
public class EventServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        try {
            String name = req.getParameter("name");
            String date = req.getParameter("date");
            String location = req.getParameter("location");

            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO events(name, date, location) VALUES(?,?,?)"
            );

            ps.setString(1, name);
            ps.setString(2, date);
            ps.setString(3, location);

            ps.executeUpdate();

            res.sendRedirect(req.getContextPath() + "/events.jsp?success=1");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.ngo.controller;

import java.io.IOException;
import java.sql.*;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.ngo.util.DBConnection;

@WebServlet("/event")
public class EventServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        try (Connection con = DBConnection.getConnection()) {

            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO events VALUES(NULL,?,?,?)");

            ps.setString(1, req.getParameter("name"));
            ps.setString(2, req.getParameter("date"));
            ps.setString(3, req.getParameter("location"));

            ps.executeUpdate();

            res.sendRedirect("events.jsp?success=1");

        } catch (Exception e) {
            e.printStackTrace();
            res.sendRedirect("events.jsp?error=1");
        }
    }
}