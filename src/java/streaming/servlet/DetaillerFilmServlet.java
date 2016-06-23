/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.entity.Film;
import streaming.service.FilmService;

/**
 *
 * @author admin
 */                                                     //routage à predefinir
@WebServlet(name = "FilmDetailServlet", urlPatterns = {"/detailler_film"})
public class DetaillerFilmServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        //Récuperer  ID film
        long idFilm = Long.parseLong(request.getParameter("id"));
        
        //Recuperer Film à partir de l'ID
        Film f = new FilmService().rechercherFilmParId(idFilm);
        
        //Initialiser les attributs pour la JSP
        request.setAttribute("film", f);
        //Foward vers JSP

  
        
        
        request.getRequestDispatcher("film_detail.jsp").forward(request, response);
    }   

}
