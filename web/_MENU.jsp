<%-- 
    Document   : _MENU
    Created on : 17 juin 2016, 10:54:55
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!--sss-->



<div>
  <table>
    <tr>
        <th><a href="films_lister">Films</a>***</th>
        
    <th><a href="series_lister">Serie</a>***</th>
    <th><a href="changer_style?style=style1">style1</a></th>
    <th><a href="changer_style?style=style2">style2</a></th>   
    
    
    <c:choose>
        <c:when test="${utilConnecte.login==null}">
            <th><a href="connexion_utilisateur">Connexion</a></th>
        </c:when>
        <c:otherwise>
            <a href="deconnexion_utilisateur">Déconnexion</a></th> 
            <c:if test="${utilConnecte.typeUtil == 'ADMIN'}">
                
            <th><a href="film_ajouter">Ajouter un film</a>***</th>
            <th><a href="serie_ajouter">Ajouter une serie</a>***</th>
            
            </c:if>
        </c:otherwise>
    </c:choose>
    
</tr>
  </table>
</div>

