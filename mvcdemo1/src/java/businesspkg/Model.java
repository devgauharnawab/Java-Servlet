package businesspkg;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */


/**
 *
 * @author gauhar
 */
import jakarta.servlet.http.*;
public interface Model {
    public void requestProcessor(HttpServletRequest request,HttpServletResponse response);
}
