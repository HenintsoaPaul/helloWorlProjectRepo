/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 *
 * @author tsoa
 */
public class InitCounterServlet extends HttpServlet {
    private int count;
    
    public void init()
            throws ServletException {
        count = 6;
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        
        count ++;
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.println("Depuis son chargement, on a accede a cette servlet " + count + " fois.");
    }
}
