/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import streaming.entity.Utilisateur;


/**
 *
 * @author admin
 */
public class UtilisateurDAO {

//    public Object recupererIdetMdp(Utilisateur u) {
//        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//        return em.createQuery("SELECT u FROM Utilisateur u WHERE u.identifiant= " + u.getIdentifiant() + " AND u.mdp= " + u.getMdp()).getSingleResult();
//        
//    }
  

   //On recherche si un utilisateur possède déjà ce login
    public List<Utilisateur> rechercheParLogin(String login) {
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        return em.createQuery("SELECT u FROM Utilisateur u WHERE u.login=:monLogin").setParameter("monLogin", login).getResultList();
    }
    
    //On recherche si un utilisateur possède déjà cet email
    public List<Utilisateur> rechercheUtilAvecCetEmail(String email) {
          EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return  em.createQuery("SELECT u FROM Utilisateur u WHERE u.email=:monEmail").setParameter("monEmail", email).getResultList();
  
    }

    
      //Rechercher utilisateur existant par login et mdp et on le connecte
    public Utilisateur rechercheParLoginEtMdp(String login, String mdp) {
       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
       Query query = em.createQuery("SELECT u FROM Utilisateur u WHERE u.login=:monLogin AND u.mdp=:monMdp");
       query.setParameter("monLogin", login);
       query.setParameter("monMdp", mdp);
       return (Utilisateur) 
               query.getSingleResult();
    }
  

    public void creerUtilisateur(Utilisateur util) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        em.getTransaction().begin();
        
        em.persist(util);
        
        em.getTransaction().commit();
    }
    
    
}
