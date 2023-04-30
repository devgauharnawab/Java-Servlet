/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package myjdbc;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mdrafi
 */
public class Loginservlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String s1 = request.getParameter("email");
            String s2 = request.getParameter("pass");
            String s5 = request.getParameter("fn");
            String s6 = request.getParameter("ln");
            String s3 = request.getParameter("dob");
            int s4 = Integer.parseInt(request.getParameter("country"));

//            out.println(s1);
//            out.println(s2);
//            out.println(s3);
//            out.println(s4);
//            out.println(s5);
//            out.println(s6);

            MyDao md = MyDao.getInstance();
           String url="jdbc:mysql://localhost:3306/myreg?useSSL=false&allowPublicKeyRetreival=true";
           String user="gauhar";
           String password="gauhar123";
           Statement st=md.getConnection(url,user,password);
           String q1="INSERT INTO login_table(email,password,status,Type)VALUES('"+s1+"','"+s2+"',0,0)";
           st.execute(q1);
           String q2="SELECT reg_id FROM ragistration ORDER BY reg_id DESC LIMIT 1";
           ResultSet rs= md.fetchData(st,q2);
          if(!rs.next()){
             String q3="INSERT INTO ragistration(reg_id,first_name,last_name,dob,country_code,email)VALUES('"+1+"','"+s5+"','"+s6+"','"+s3+"','"+s4+"','"+s1+"')";
             md.dataLoader(st,q3);
          }else{
              int rid=rs.getInt("reg_id")+1;
              String q4="INSERT INTO ragistration(reg_id,first_name,last_name,dob,country_code,email)VALUES('"+rid+"','"+s5+"','"+s6+"','"+s3+"','"+s4+"','"+s1+"')";
              st.executeUpdate(q4);
          }
                    
               out.println("<h1>Ragistration Sucessfully Inserted</h1>"); 
        } catch (SQLException ex) {
            Logger.getLogger(Loginservlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Loginservlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}