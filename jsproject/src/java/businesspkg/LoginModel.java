/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesspkg;

import jakarta.servlet.http.*;
import java.io.PrintWriter;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

/**
 *
 * @author gauhar
 */
public class LoginModel implements Model{


    @Override
    public void requestProcessor(HttpServletRequest request, HttpServletResponse response) {
         try{
           PrintWriter out = response.getWriter();
           JSONObject obj = new JSONObject();
           obj.put("name", "Mukes Ambani");
           obj.put("age", "66");
           
           JSONArray companies = new JSONArray();
           companies.add("Reliance Industries");
           companies.add("Reliance Petrolliums");
           
           obj.put("companies", companies);
           String res = obj.toJSONString();
           out.println(res);
        }catch(Exception e){
            e.printStackTrace();
        }

           
    }
    
}
