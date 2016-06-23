/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.GenreDAO;
import streaming.entity.Genre;

/**
 *
 * @author admin
 */
public class GenreService {

   


        public List<Genre> lister() {
            
            return new GenreDAO().listerGenre();
        }
    
         public Genre rechercherParId(long genreId) {
        GenreDAO dao = new GenreDAO();
         return dao.rechercherGenreParId(genreId);
    }
    
}
