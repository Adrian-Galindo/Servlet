/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package fr.devavance.tp2_auth_v2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kn_21
 */
@WebServlet(name = "Identification", urlPatterns = {"/Identification"})
public class Identification extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("login.html");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String mdp = req.getParameter("password");
        
        if("admin".equals(login) && "admin".equals(mdp)){
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/UtilisateurAutorise");
            rd.forward(req, resp);
        }else{
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/UtilisateurNonAutorise");
            rd.forward(req, resp);
        }
    }
    
}
