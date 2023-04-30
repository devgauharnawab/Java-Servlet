/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesspkg;

import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gauhar
 */
public class LoginModel implements Model {

    @Override
    public void requestProcessor(HttpServletRequest request, HttpServletResponse response) {

        try {
            PrintWriter out = response.getWriter();
            out.println("Your username is : " + request.getParameter("username"));
            out.println("Your password is : " + request.getParameter("password"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}







































































//       try{
//           PrintWriter out = response.getWriter();
//           JSONObject obj = new JSONObject();
//           obj.put("name", "Mukes Ambani");
//           obj.put("age", "66");
//           
//           JSONArray companies = new JSONArray();
//           companies.add("Reliance Industries");
//           companies.add("Reliance Petrolliums");
//           
//           obj.put("companies", companies);
//           String res = obj.toJSONString();
//           out.println(res);
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        try{
//            HashMap<String,String> hs = new HashMap<>();
//            hs.put("first","Your user name is : " + request.getParameter("username"));
//            hs.put("second","Your Password is : " + request.getParameter("password"));
//            request.setAttribute("sendtext", hs);
//            request.getRequestDispatcher("/WEB-INF/pages/loginpages.jsp").forward(request, response);
//        }catch(Exception e){
//            e.printStackTrace();   
//        }

