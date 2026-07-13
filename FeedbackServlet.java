package com.ngo.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import com.ngo.util.DBConnection;

@WebServlet("/feedback")
public class FeedbackServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {
        try {
            String name = req.getParameter("name");
            String message = req.getParameter("message");
            String starsParam = req.getParameter("stars");

            Connection con = DBConnection.getConnection();

            // Save feedback
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO feedback(name, message) VALUES(?,?)"
            );
            ps.setString(1, name);
            ps.setString(2, message);
            ps.executeUpdate();

            // Save rating if provided
            if (starsParam != null && !starsParam.isEmpty() && !starsParam.equals("0")) {
                int stars = Integer.parseInt(starsParam);
                PreparedStatement psR = con.prepareStatement(
                    "INSERT INTO rating(stars) VALUES(?)"
                );
                psR.setInt(1, stars);
                psR.executeUpdate();
            }

            res.sendRedirect(req.getContextPath() + "/feedback.jsp?success=1");
        } catch (Exception e) {
            e.printStackTrace();
            res.sendRedirect(req.getContextPath() + "/feedback.jsp?error=1");
        }
    }
}


package com.ngo.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.ngo.util.DBConnection;

@WebServlet("/feedback")
public class FeedbackServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO feedback(name, message) VALUES(?, ?)"
            );

            ps.setString(1, req.getParameter("name"));
            ps.setString(2, req.getParameter("message"));

            ps.executeUpdate();

            res.sendRedirect("feedback.jsp?success=1");

        } catch (Exception e) {
            System.out.println(e);
            res.sendRedirect("feedback.jsp?error=1");
        }
    }
}