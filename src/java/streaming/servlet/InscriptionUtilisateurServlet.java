/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.entity.Utilisateur;
import streaming.service.UtilisateurService;

/**
 *
 * @author admin
 */
@WebServlet(name = "InscriptionUtilisateurServlet", urlPatterns = {"/inscrire_utilisateur"})
public class InscriptionUtilisateurServlet extends HttpServlet {

     @Override
    //Méthode doPost envoie des données
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
     
        String login = request.getParameter("login");
        String mdp = request.getParameter("mdp");
        String email = request.getParameter("email");
        
        Utilisateur util = new Utilisateur();
        util.setLogin(login);
        util.setEmail(email);
        util.setMdp(mdp);
        
        //util.getEtatUtil(Utilisateur.EtatUtil.VALIDE);
        
        //Vérifier si utilisateur existe en BDD
        new UtilisateurService().inscription(util);
        
        //Envoi email
        String mailDest = request.getParameter(email);
        String titre ="Titre";
        String msg = "Votre inscription sera validé sous 24h";
        
        new UtilisateurService().envoyerMail(mailDest, titre, msg);
        //Rédirection vers 
        response.sendRedirect("films_lister");
       
    }

@Override
    //Méthode doGet recupère des données
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        
        //Renvoyer vers  la jsp "form.jso"
        request.getRequestDispatcher("utilisateur_inscription.jsp").forward(request, response);
    }

}
