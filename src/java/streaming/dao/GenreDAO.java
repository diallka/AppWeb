/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import streaming.entity.Genre;

/**
 *
 * @author admin
 */
public class GenreDAO {
    
    //Lister les genres
    public List<Genre> listerGenre(){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        
        return em.createQuery("SELECT g FROM Genre g ORDER BY g.nom").getResultList();
    }
    
    //Rechercher genre par id
    public Genre rechercherGenreParId(long genreId){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.find(Genre.class, genreId);
    }
    
    //Ajouetr lien
    public void ajouter(Genre genre){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        
        em.persist(genre);
        
        em.getTransaction().commit();
        
    }
    //Mofifier le genre Film
    public void modifierGenre(Genre genre){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();//Début
        
        em.merge(genre);
        em.getTransaction().commit();//Fin
    }
    
    //Supprimer le genre 
    public void supprimerGenre(long id){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        
        Genre g = em.find(Genre.class, id);
        em.remove(g);
        
        em.getTransaction().commit();
    }
}
