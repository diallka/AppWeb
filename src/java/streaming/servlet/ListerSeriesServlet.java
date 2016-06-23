/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.util.List;
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
@WebServlet(name = "ListerSeriesServlet", urlPatterns = {"/series_lister"})
public class ListerSeriesServlet extends HttpServlet {
    
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
       
        //Récuperer film DB
        SerieService service = new SerieService();
        List<Serie> seriesTrouves = new SerieService().listerSeries();
        
        //Initialiser les attributs pour la JSP
        request.setAttribute("serie", seriesTrouves);
        
        //foward vers la JSP
        request.getRequestDispatcher("series_list.jsp").forward(request, response);
        
 
    }
}    