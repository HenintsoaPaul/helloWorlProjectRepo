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
public class UIFormServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        
        out.println("nom: " + request.getParameter("nom"));
        out.println("prenom: " + request.getParameter("prenom"));
        
        if (request.getParameterValues("radio1")[0].equals("mas")) {
            out.println("C'est un homme");
        }
        else {
            out.println("C'est une femme");
        }
        
        out.println("Voici son message: " + request.getParameter("coms"));
    }
}
