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

        String reason = req.getParameter("reason");
        String amt = req.getParameter("amount");

        if (reason == null || reason.trim().isEmpty() ||
            amt == null || amt.trim().isEmpty()) {

            res.sendRedirect(req.getContextPath() + "/admin.jsp?error=empty");
            return;
        }

        try {
            int amount = Integer.parseInt(amt);

            if (amount <= 0) {
                res.sendRedirect(req.getContextPath() + "/admin.jsp?error=amount");
                return;
            }

            try (Connection con = DBConnection.getConnection()) {

                PreparedStatement ps = con.prepareStatement(
                        "INSERT INTO expenses(reason, amount) VALUES(?, ?)");

                ps.setString(1, reason.trim());
                ps.setInt(2, amount);

                int rows = ps.executeUpdate();

                HttpSession session = req.getSession();

                if (rows > 0) {
                    session.setAttribute("msg", "Expense added successfully.");
                    res.sendRedirect(req.getContextPath()
                            + "/admin.jsp?success=1#fundDist");
                } else {
                    res.sendRedirect(req.getContextPath()
                            + "/admin.jsp?error=failed");
                }
            }

        } catch (NumberFormatException e) {
            res.sendRedirect(req.getContextPath()
                    + "/admin.jsp?error=invalidAmount");
        } catch (Exception e) {
            e.printStackTrace();
            res.sendRedirect(req.getContextPath()
                    + "/admin.jsp?error=1");
        }
    }
}