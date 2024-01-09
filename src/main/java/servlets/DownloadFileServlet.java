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
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author tsoa
 */
public class DownloadFileServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            String filePath = "/media/tsoa/data/movies/\"Film Qu'est-ce qu'on a tous fait au Bon Dieu.mp4\"";
            filePath = "/home/tsoa/Documents/dd.txt";
            InputStream is = new FileInputStream(filePath);
            OutputStream os = response.getOutputStream();
            
            response.setContentType("text/plain");
            response.setHeader("Content-Disposition", "attachment;filename=toto.txt");
            
            int count;
            byte buff[] = new byte[4096];
            while ((count = is.read(buff)) > -1) {
                os.write(buff, 0, count);
            }
            
            is.close();
            os.close();
        }
        catch (IOException e) {
            // bla...
        }
    }
}
