/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author admin
 */
@WebServlet(name = "HomepageServlet", urlPatterns = {"/home"})
public class HomepageServlet extends HttpServlet {
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        
        //System.err.println("****passe par ici"); //S'affiche dans la console
        
        //Crée un attribut à envoyer à la page jsp --> HTML
        //req.setAttribute ("titre", "Bonjour les zeros");
        request.setAttribute("titre", "Bonjour les zeros");
        request.setAttribute("dateJour", new Date());
        
        //Renvoie à une JSP home.jsp
        request.getRequestDispatcher("home.jsp").forward(request, response);
    }

    

}
