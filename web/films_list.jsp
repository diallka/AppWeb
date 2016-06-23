<%-- 
    Document   : film
    Created on : 17 juin 2016, 11:11:29
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Template Page</title>
        <c:import url="_STYLESHEET.jsp" />
        
    </head>
    <body>
        <div class="titre">
           <c:import url="_TITRE.jsp" /> 
        </div>
        <div class="menu">
            <c:import url="_MENU.jsp" />
        </div>
        <div class="contenu">
     
            <h1>Liste films</h1>

             <c:forEach items="${films}" var="f">
                 
                 
                 <table>
                <tr>
                  
                    <td><a href="detailler_film?id=${f.id}">${f.titre}</a> <a href=""><button type="button" class="glyphicon glyphicon-trash"></button></a></td>
                    
                </tr>
                <tr>
                  <br clear="all">
                     <td>DUREE: ${f.duree} 
                         PAYS: <c:forEach items="${f.pays}" var="p">
                                    ${p.nom}
                                </c:forEach>
                         GENRE:${f.genre.nom} 
                         ANNEE: ${f.annee}
                     </td>
                    
                   
                </tr>
                <tr>
                    <%--   <q> 
                    ${f.synopsis}
                </q>    --%>
                <cite>
                    ${f.synopsis}
                </cite> 
                ${f.pic}
                    
                </tr>
                <tr>
                     <td>
                        ACTEURS: <c:forEach items="${f.acteurs}" var="act">
                                    ${act.prenom} ${act.nom},
                                </c:forEach>
                   
                        REALISATEUR(S):<c:forEach items="${f.realisateurs}" var="real">
                        ${real.prenom} ${real.nom},
                    </c:forEach>
                    </td>
                </tr>
                
               
               
            </table>
            </div>    
            </c:forEach>
            
            
        </div>
        <br/>
        <div class="pied">
            <c:import url="_PIED.jsp" />
        </div>
    </body>
</html>
