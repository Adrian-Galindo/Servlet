/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.devavance.metier.views.interfaces;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author bouchaib.lemaire
 */
public interface IServletView {
    String CONTROLLER = "controller";
    String FORM_LOGOUT = "/WEB-INF/form_logout.html";
    String HEADOR = "/WEB-INF/header.html";
    String FOOTER = "/WEB-INF/footer.html";
    
    public void include_header(HttpServletRequest request, HttpServletResponse response);
    public void include_footer(HttpServletRequest request, HttpServletResponse response);
}
