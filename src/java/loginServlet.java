/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Long Huynh
 */
public class loginServlet extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        String url = "/index.html";
        String username = request.getParameter("name");
        String password = request.getParameter("pass");
        
        if(username.equals("jsmith@toba.com") && password.equals("letmein")){
            
            response.sendRedirect("/account_activity.html");
        }
        else {
            url = "/login_failure.html";
            getServletContext().getRequestDispatcher(url)
                    .forward(request, response);
        }
    
    }
}
