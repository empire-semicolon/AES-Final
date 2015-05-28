/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aes.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.jms.Session;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Bryan Cabansay
 */
public class LogoutServlet extends HttpServlet {
    
    public void init() throws ServletException{        
    }
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{        
            request.getSession().invalidate();        
            RequestDispatcher rd = request.getRequestDispatcher("redirect.jsp");            
            System.out.println(this.getServletContext()
                    .getRealPath("")+File.separator+"WEB-INF"+File.separator+"jsp"+File.separator+"index.jsp");
            rd.forward(request, response);        
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{        
        doGet(request, response);
    }
    
    public void destroy(){        
    }
    
}
