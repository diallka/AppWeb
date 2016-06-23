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
 */
@WebServlet(name = "ListerFilmsServlet", urlPatterns = {"/films_lister"})
public class ListerFilmsServlet extends HttpServlet {
    
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
       
        //Récuperer film DB
        //FilmService service = new FilmService();
        List<Film> filmsTrouves = new FilmService().lister();
        
        //Initialiser les attributs pour la JSP
        request.setAttribute("films", filmsTrouves);
        
        //foward vers la JSP
        request.getRequestDispatcher("films_list.jsp").forward(request, response);
        
 
    }


}


