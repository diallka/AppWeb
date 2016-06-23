/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.entity.Film;
import streaming.entity.Genre;
import streaming.service.FilmService;
import streaming.service.GenreService;

/**
 *
 * @author admin
 */
@WebServlet(name = "FormServlet", urlPatterns = {"/film_ajouter"})
public class AjouterFilmServlet extends HttpServlet {
    
@Override
    //Méthode doPost envoie des données
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
       //recuperer données (on recupère du String)
       //request.getParameter("anneeProd");
       
//      String  anneeProdStr = request.getParameter("anneeProd");
//      String  titreStr = request.getParameter("titre");
//      String synopsisStr = request.getParameter("synopsis");
//      String dureeStr = request.getParameter("duree");
//      String  listGenreStr = request.getParameter("list");
//      String  listPaysStr = request.getParameter("list");
      
    //****************************************************************
    //Recup genre
    long genreId = Long.parseLong(request.getParameter("genre_id"));
    Genre genre = new GenreService().rechercherParId(genreId);
     //****************************************************************
    //On contruit un film
      Film f = new Film(); 
        
        f.setTitre(request.getParameter("titre"));
    //*****************************************************************   
        genre.getFilms().add(f);
        f.setGenre(genre);
    //*****************************************************************
        f.setSynopsis("synopsis");
        //f.setAnnee(anneeProdStr);
        
        //new FilmService qui va créer un nouveau service dans FilmService
        FilmService filmService = new FilmService();
        
        new FilmService().ajouterFilm(f);
        
        //Permet de repartir directement vers la liste des films actualisés
        response.sendRedirect("films_lister");
       
    }

@Override
    //Méthode doGet recupère des données
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        //parfois enlever le super.doGet pour obtenir la page
        //super.doDelete(request, response);
         //On appelle createEntityManagerFactory qui va appeller createEntityManager
        request.setAttribute("genres", new GenreService().lister());
        
        //Renvoyer vers  la jsp "form.jso"
        request.getRequestDispatcher("film_ajout.jsp").forward(request, response);
    }

}
