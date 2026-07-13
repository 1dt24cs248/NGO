package com.ngo.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.ngo.util.DBConnection;

@WebServlet("/helpRequest")
public class HelpRequestServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        try {
            String name = req.getParameter("name");
            String location = req.getParameter("location");
            String need = req.getParameter("need");
            String mobile = req.getParameter("mobile");
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO help_requests(name, location, need,mobile) VALUES(?,?,?,?)"
            );

            ps.setString(1, name);
            ps.setString(2, location);
            ps.setString(3, need);
            ps.setString(4, mobile);


            ps.executeUpdate();

            res.sendRedirect(req.getContextPath() + "/helprequest.jsp?success=1");

        } catch (Exception e) {
            e.printStackTrace();
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

@WebServlet("/helpRequest")
public class HelpRequestServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO help_requests(name, location, need, mobile) VALUES(?,?,?,?)"
            );

            ps.setString(1, req.getParameter("name"));
            ps.setString(2, req.getParameter("location"));
            ps.setString(3, req.getParameter("need"));
            ps.setString(4, req.getParameter("mobile"));

            ps.executeUpdate();

            res.sendRedirect("helprequest.jsp?success=1");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}