<%-- 
    Document   : film_detail
    Created on : 17 juin 2016, 15:08:19
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         
        
        <h1>Description Film:</h1>
        
        
        
        Synopsis: <cite>${film.synopsis}</cite> <br/>
        
       Réalisateur(s): <c:forEach items="${film.realisateurs}" var="real">
              ${real.prenom} ${real.nom},
          </c:forEach> <br/>
              
        Catégories: ${film.genre.nom} <br/>
        
        Pays: <c:forEach items="${film.pays}" var= "p">
            ${p.nom} 
        </c:forEach>
        <br/>
        Format: ${film.duree} min
        <br/>
        Acteur(s): <c:forEach items="${film.acteurs}" var="act">
            ${act.prenom} ${act.nom},
        </c:forEach> <br/>
        
        Titre original: ${film.titre} <br/>
        
        Année: 
          ${film.annee}<br/>
          
          Liens: <c:forEach items="${film.liens}" var="lien">
             
         
          
        <br/>
        Langue:  ${lien.langue}
        <br/>
        Qualité: ${lien.qualite}
        <br/>
        Url:  <a href="${lien.url}" target="_blank">Lien direct</a>
            
         </c:forEach>
    </body>
</html>
