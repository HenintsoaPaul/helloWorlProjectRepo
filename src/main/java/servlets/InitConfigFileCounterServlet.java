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
public class InitConfigFileCounterServlet extends HttpServlet {
    private int count;
    
    public void init() 
            throws ServletException {
        String initial = this.getInitParameter("initial_counter_value");
        try {
            count = Integer.parseInt(initial);
        }
        catch (NumberFormatException nfe) {
            count = 0;
        }
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
