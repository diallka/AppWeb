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
import streaming.service.SerieService;

/**
 *
 * @author admin
 */
@WebServlet(name = "SupprimerFilmServlet", urlPatterns = {"/film_supprimer"})
public class SupprimerFilmServlet extends HttpServlet {


@Override
    //Méthode doGet recupère des données
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
       
        
        
        
        //response.sendRedirect("films_lister");
        
        //request.getRequestDispatcher("film_suppression.jsp").forward(request, response);
    }
}
