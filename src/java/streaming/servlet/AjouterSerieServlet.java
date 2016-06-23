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
import streaming.entity.Serie;
import streaming.service.SerieService;

/**
 *
 * @author admin
 */
@WebServlet(name = "AjouterSerieServlet", urlPatterns = {"/serie_ajouter"})
public class AjouterSerieServlet extends HttpServlet {
    
@Override
    //Méthode doPost envoie des données
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
      
    //Recup genre
//    long genreId = Long.parseLong(request.getParameter("genre_id"));
//    Genre genre = new GenreService().rechercherParId(genreId);
     //****************************************************************
    //On contruit un film
      Serie s = new Serie(); 
        
        s.setTitre(request.getParameter("titre"));
    //*****************************************************************   
//        genre.getFilms().add(f);
//        f.setGenre(genre);
    //*****************************************************************
        s.setSynopsis("synopsis");
        //f.setAnnee(anneeProdStr);
        
        //new FilmService qui va créer un nouveau service dans FilmService
        SerieService serieService = new SerieService();
        
        new SerieService().ajouterSerie(s);
        
        //Permet de repartir directement vers la liste des films actualisés
        response.sendRedirect("series_lister");
       
    }

@Override
    //Méthode doGet recupère des données
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        //parfois enlever le super.doGet pour obtenir la page
        //super.doDelete(request, response);
         //On appelle createEntityManagerFactory qui va appeller createEntityManager
         
//        request.setAttribute("genres", new GenreService().lister());
        
        //Renvoyer vers  la jsp "form.jso"
        request.getRequestDispatcher("film_ajout.jsp").forward(request, response);
    }
}
