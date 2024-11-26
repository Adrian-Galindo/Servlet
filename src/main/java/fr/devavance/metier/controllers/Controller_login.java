/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package fr.devavance.metier.controllers;

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
 * @author kn_25
 */
@WebServlet(name = "Controller_login", urlPatterns = {"/Controller_login"})
public class Controller_login extends HttpServlet implements IController{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String mdp = req.getParameter("password");
        
        if(login.equals("admin") && mdp.equals("admin")){
            req.setAttribute("", mdp);
            
            is_connected(req);
            
            RequestDispatcher rq = getServletContext().getRequestDispatcher("");
            rq.forward(req, resp);
        }
    }

    private boolean is_connected(HttpServletRequest request){
        if
    }
    
    private void process_login_user(HttpServletRequest request, HttpServletResponse response){
    }
    
    private void verify_credential(String login, String password){
    }

    @Override
    public void dispatch(String path, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
