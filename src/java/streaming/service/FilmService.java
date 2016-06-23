/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.FilmDAO;
import streaming.entity.Film;

/**
 *
 * @author admin
 */
public class FilmService {
    
    
    public List<Film> lister(){
        FilmDAO dao = new FilmDAO();
        return dao.listerTousFilms();
    }
    
     public Film rechercherFilmParId (long id){
         FilmDAO dao = new FilmDAO();
         return dao.rechercherFilmParId(id);
     }
     
     //*********************************************
     //méthode ajouterFilm créer pour la Servlet
     public void ajouterFilm(Film f){
         FilmDAO dao = new FilmDAO();
         dao.ajouterFilm(f);
     }
     //*****************************************

   

   //********************************************
    public void supprimerFilmParId(long id) {
        FilmDAO dao = new FilmDAO();
        dao.supprimerFilm(id);
        //new FilmDAO().supprimer(id);
    }
    //********************************************
   
    

    
}
