/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import streaming.entity.Lien;

/**
 *
 * @author admin
 */
public class LienDAO {
    
    public List<Lien> listerLiens(){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.createQuery("SELECT l FROM Lien l ").getResultList();
    }
    
    public void ajouterLiens (Lien l){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        
        em.persist(l);
        
        em.getTransaction().commit();
    }
   
    public void modifierLiens(long id){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        
        Lien l = em.find(Lien.class, id);
          em.merge(l);
        em.getTransaction().commit();
    }
    
    public void supprimerLiens(long id){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        
        Lien l = em.find(Lien.class, id);
          em.remove(l);
        em.getTransaction().commit();
    }
}
