/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.entity.Utilisateur;

import streaming.service.UtilisateurService;

/**
 *
 * @author admin
 */
@WebServlet(name = "Connexion", urlPatterns = {"/connexion_utilisateur"})
public class ConnexionUtilisateurServlet extends HttpServlet {

    @Override
    //Méthode doPost envoie des données
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
     
        //Récuperer params formulaire
        String login = request.getParameter("login");
        String mdp = request.getParameter("mdp");
        
        
        //Récuperer l'utilisateur correspondant en BDD
        //new UtilisateurService().rechercheParLoginEtMdp(login, mdp);
        
        Utilisateur util = new UtilisateurService().rechercheParLoginEtMdp(login, mdp);
        
        request.getSession().setAttribute("utilConnecte", util);
        
        
//        response.addCookie(new Cookie("util_type", util.getTypeUtil().toString()));
//        //Utilisateur.TypeUtil.values(); //Récupere toutes les valeurs de typeUtil et itérer dessus
//        response.addCookie(new Cookie("login", login));
//        response.addCookie(new Cookie("mdp", mdp));
        
        //Je suis loggé correctement
        
        //Rédirection vers listage de films
        response.sendRedirect("films_lister?connecte=vrai");
       
    }

@Override
    //Méthode doGet recupère des données
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        
        
        //Renvoyer vers  la jsp "form.jso"
        request.getRequestDispatcher("utilisateur_connexion.jsp").forward(request, response);
    }
}
