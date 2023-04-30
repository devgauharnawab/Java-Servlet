/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elearningpkg;

import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.Statement;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginModel implements Model {

    @Override
    public void requestProcessor(HttpServletRequest request, HttpServletResponse response) {
        try (PrintWriter out = response.getWriter()) {
            String s1 = request.getParameter("email");
            String s2 = request.getParameter("password");
            String s3 = request.getParameter("fname");
            String s4 = request.getParameter("lname");
            String s5 = request.getParameter("dob");
            String s6 = request.getParameter("gender");
            String s7 = request.getParameter("hqualification");
            String s8 = request.getParameter("user_type");

            out.println("The User name is : " + s1);
            out.println("<br>");
            out.println("The password is : " + s2);
            out.println("<br>");
            out.println("first name is : " + s3);
            out.println("<br>");
            out.println("Lname is : " + s4);
            out.println("<br>");
            out.println("dob is : " + s5);
            out.println("<br>");
            out.println("gender is : " + s6);
            out.println("<br>");
            out.println("hqualification  is" + s7);

            // Java Database Connectivity
            MyDAO md = new MyDAO(request);
            Statement st = md.getConnection();

            // Insert Data in Database;
            String q = "INSERT INTO login_table(email,password,status,user_type) VALUES ('" + s1 + "','" + s2 + "',0,'" + s8 + "')";
            md.insertData(st, q);

            String q1 = "SELECT uid FROM user_table ORDER BY uid DESC LIMIT 1";
            ResultSet rs = md.LoadData(st, q1);

            if (!rs.next()) {
                String q2 = "INSERT INTO user_table(uid,fname,lname,dob,gender,hqualification,email,password) VALUES (1,'" + s3 + "','" + s4 + "','" + s5 + "','" + s6 + "','" + s7 + "','" + s1 + "','" + s2 + "')";
                md.insertData(st, q2);
            } else {
                int sn = rs.getInt("uid") + 1;
                String q3 = "INSERT INTO user_table(uid,fname,lname,dob,gender,hqualification,email,password) VALUES ('" + sn + "','" + s3 + "','" + s4 + "','" + s5 + "','" + s6 + "','" + s7 + "','" + s1 + "','" + s2 + "')";
                md.insertData(st, q3);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
