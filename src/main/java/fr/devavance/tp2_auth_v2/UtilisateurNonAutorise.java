/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package fr.devavance.tp2_auth_v2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kn_21
 */
@WebServlet(name = "UtilisateurAutorise", urlPatterns = {"/UtilisateurNonAutorise"})
public class UtilisateurNonAutorise extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String choix = req.getParameter("choix");

        PrintWriter out = resp.getWriter();        
        out.println("<h1>Vous n'êtes pas connectés, votre login et/ou votre mot de passe sont incorrects</h1>");
        out.println("<p>Retourner vers la page login <a href=\"login.html\">back</a></p>");
    }

    
}
