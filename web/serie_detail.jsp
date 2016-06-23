<%-- 
    Document   : serie_detail
    Created on : 20 juin 2016, 10:00:39
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
        <h1>Description Serie:</h1>
        
        <h1>${serie.titre}</h1>
        <cite>${serie.synopsis}</cite>
        <br/>
        Episode: <c:forEach items="serie.saison" var="saison">
           
        </c:forEach>
        
        <br/>
        Catégorie: ${serie.genre.nom}
        <br/>
        Pays: <c:forEach items="${serie.pays}" var="p">
            
        </c:forEach>
        <br/>
        Format: 
        <br/>
        Acteur(s): <c:forEach items="${serie.acteurs}" var="act">
                                ${act.nom} ${act.prenom},
                            </c:forEach>
        <br/>            
                            Réalisateur(s):<c:forEach items="${serie.realisateurs}" var="real">
                                ${real.nom} ${real.prenom},
                            </c:forEach>
       
    </body>
</html>
