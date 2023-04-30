/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elearningpkg;

import java.sql.*;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import java.io.Serializable;

public class MyDAO implements Serializable {

    ServletContext ctx = null;

    public MyDAO(HttpServletRequest req) {
        ctx = req.getServletContext();
    }

    public Statement getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(ctx.getInitParameter("jdbcdriver"));
        return DriverManager.getConnection(
                ctx.getInitParameter("url"),
                ctx.getInitParameter("username"),
                ctx.getInitParameter("password")
        ).createStatement();
    }

    public boolean insertData(Statement st, String query) throws SQLException {
        return st.execute(query);
    }

    public ResultSet LoadData(Statement st, String query) throws SQLException {
        return st.executeQuery(query);
    }
}
//datA get from webxml file