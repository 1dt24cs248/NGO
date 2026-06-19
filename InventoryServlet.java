package com.ngo.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.ngo.util.DBConnection;

@WebServlet("/inventory")
public class InventoryServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        try {
            String item = req.getParameter("item");
            int quantity = Integer.parseInt(req.getParameter("quantity"));

            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO inventory(item_name, quantity) VALUES(?,?)"
            );

            ps.setString(1, item);
            ps.setInt(2, quantity);

            ps.executeUpdate();

            res.sendRedirect(req.getContextPath() + "/inventory.jsp?success=1");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}