/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.SerieDAO;
import streaming.entity.Serie;

/**
 *
 * @author admin
 */
public class SerieService {
    public List<Serie> listerSeries(){
        SerieDAO dao = new SerieDAO();
        return dao.listerTousSeries();
    }
     public Serie rechercherSerieParId (long id){
         SerieDAO dao = new SerieDAO();
         return dao.rechercherSerieParId(id);
     }

    public void ajouterSerie(Serie s) {
       SerieDAO dao = new SerieDAO();
       dao.ajouterSerie(s);
    }
    
    
}
