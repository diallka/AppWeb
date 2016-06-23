/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import streaming.entity.Serie;

/**
 *
 */
public class SerieDAO {
    
    //Lister toutes les series
    public List<Serie> listerTousSeries(){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.createQuery("SELECT s FROM Serie s").getResultList();
    }
    
     //Rechercher une serie par ID
    public Serie rechercherSerieParId (long id){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.find(Serie.class, id);
    }

    //Ajouter une serie
    public void ajouterSerie(Serie s) {
       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
       em.getTransaction().begin(); //Au debut sinon n'inserre pas dans la table
    
        em.persist(s); //persister le nouveau film
        
        em.getTransaction().commit();//A la fin
    }
    
    //Modifier une serie
    public void modifierSerie(Serie serie){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
       em.getTransaction().begin(); //Au debut sinon n'inserre pas dans la table
    
        em.merge(serie); //persister le nouveau film
        
        em.getTransaction().commit();//A la fin
    }
    
    //Supprimer une serie
    public void supprimerSerie(long id){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        
        Serie s = em.find(Serie.class, id);
        
        em.getTransaction().commit();
    }
}
