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
import streaming.entity.Film;
import streaming.service.FilmService;

/**
 *
 * @author admin
 */
public class FilmDAO {
    
    //Lister tous les films
    public List<Film> listerTousFilms(){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.createQuery("SELECT f FROM Film f").getResultList();
    }
    
    //Rechercher film par ID
    public Film rechercherFilmParId (long id){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.find(Film.class, id);
    }
    
    //Modifier Film
    public void modifierFilm(Film film){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.merge(film);
        
        em.getTransaction().commit();
    }
    
    //Supprimer Film
    public void supprimerFilm(long id){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        
//        Query q = em.createNamedQuery("DELETE FROM Film f WHERE f.id=:idFilm)");
//        q.setParameter("idFilm", id);
//        q.executeUpdate();

          Film f = em.find(Film.class, id);
          em.remove(f);
          
          em.getTransaction().commit();
    }
    //*****************************************************************************************
    //Ajouter film
//    public Film ajouterFilm(){
//        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//        em.getTransaction().begin(); //Au début
//        
//        //Film Dracula
//      Film f = new Film();
//      f.setTitre("Dracula");
//      f.setId(5L);
//      
//      em.persist(f);
//        
//      em.getTransaction().commit();
//        return ajouterFilm();
//        
//    }
    //*********************************************************************************************

    //Méthode ajouter Film appellé dans la DAO
    public void ajouterFilm(Film f) {
         EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

        em.getTransaction().begin(); //Au debut sinon n'inserre pas dans la table
    
        em.persist(f); //persister le nouveau film
        
        em.getTransaction().commit();//A la fin
        
       
    }

//    public void supprimerFilm(long id) {
//       //On appelle createEntityManagerFactory qui va appeller createEntityManager
//        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//
//        em.getTransaction().begin(); //Au debut sinon n'inserre pas dans la table
//        
//        //Supprimer tous les pays
//        Query query = em.createQuery("DELETE FROM Film f WHERE find by id");
//        query.executeUpdate();
//        
//        em.getTransaction().commit();//A la fin
//    }
}
