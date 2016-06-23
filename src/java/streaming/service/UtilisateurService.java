/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.SerieDAO;
import streaming.dao.UtilisateurDAO;
import streaming.entity.Utilisateur;


/**
 *
 * @author admin
 */
public class UtilisateurService {
    
    
    //Inscrire un utilisateur
    public void inscription(Utilisateur util){
        UtilisateurDAO dao = new UtilisateurDAO();
    
        //Validation d'un utilisateur
        
        //Throw Exception si login existe
        
        List<Utilisateur> listeUtilAvecCeLogin = dao.rechercheParLogin(util.getLogin());
        
        if(listeUtilAvecCeLogin.size() > 0){
            throw new RuntimeException("Ce login existe déjà");
        }
      
       //****************************************************************************
       
       List <Utilisateur> rechercheUtilAvecCetEmail = dao.rechercheUtilAvecCetEmail(util.getEmail());
       
       if(listeUtilAvecCeLogin.size() > 0){
           throw new RuntimeException("Cet email existe déjà");
       }
       
        util.setEtatUtil(Utilisateur.EtatUtil.NON_VALIDE);
  
       //Créer l'utilisateur dans le dao
        dao.creerUtilisateur(util);
    }
    //***************************************************************************
     public void envoyerMail(String mailDest, String titre, String msg) {
      //Envoyer email
        
        new MailService().envoyerMail(mailDest, titre, msg);
    }
    
    public Utilisateur rechercheParLoginEtMdp(String login, String mdp) {
       
        return new UtilisateurDAO().rechercheParLoginEtMdp(login, mdp);
    }

   

}
