/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author admin
 */
@WebServlet(name = "DeconnexionUtilisateurServlet", urlPatterns = {"/deconnexion_utilisateur"})
public class DeconnexionUtilisateurServlet extends HttpServlet {

    @Override
    //Méthode doPost envoie des données
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
      
        
        
       
    }

@Override
    //Méthode doGet recupère des données
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        
        //request.getRequestDispatcher("utilisateur_connexion.jsp").forward(request, response);
        
//        try {
//            request.getCookies().wait(0L);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(DeconnexionUtilisateurServlet.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
//premiere methode coté utilisateur
//        Cookie c;
//        c = new Cookie("login", "test");
//        c.setMaxAge(0);
//        response.addCookie(c);
//        
//        c = new Cookie("mdp", null);
//        c.setMaxAge(0);
//        response.addCookie(c);
//        
//        c = new Cookie("util_type", null);
//        c.setMaxAge(0);
//        response.addCookie(c);

        //Méthode session coté serveur
        request.getSession().removeAttribute("utilConnecte");

    response.sendRedirect("connexion_utilisateur");
    }
}
