/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesspkg;

import jakarta.servlet.http.*;
import java.io.PrintWriter;

/**
 *
 * @author gauhar
 */
public class LoginModel implements Model{

    @Override
    public void requestProcessor(HttpServletRequest request, HttpServletResponse response) {
     //   try{
       //     HashMap<String,String> hs = new HashMap<>();
         //   hs.put("first", "your user name is " + request.getParameter("username"));
           // hs.put("second", "your password is " + request.getParameter("password"));
            //request.setAttribute("sendtext", hs);
            //ab ham direct controller par dispatch kar denge
           // request.getRequestDispatcher("WEB-INF/pages/loginpages.jsp").forward(request, response);
      //  }catch(Exception e){
        //    e.printStackTrace();
       // }
       
       try{
           PrintWriter out = response.getWriter();
           out.println("Your username is : " + request.getParameter("username"));
           out.println("Your password is : " + request.getParameter("password"));
       }catch(Exception e){
           e.printStackTrace();
       }
    }
}
