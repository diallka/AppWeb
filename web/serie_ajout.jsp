<%-- 
    Document   : AjouterSerieServlet
    Created on : 21 juin 2016, 10:23:56
    Author     : admin
--%>
<!--ajouter library jstl sinon fonctionne pas-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <c:import url="_STYLESHEET.jsp" />
        <div class="titre">
           <c:import url="_TITRE.jsp" /> 
        </div>
        <div class="menu">
            <c:import url="_MENU.jsp" />
        </div>
    </head>
    <body>
        
        <div class="contenu">
             <h1> formulaire:</h1>
 <form method="post">
             <input type="text" name="titre" placeholder="Titre" style="border:dotted epx grey"/><br/><br/>
             <input type="text" name="duree" placeholder="Duree" style="border:dotted epx grey"/><br/><br/>
             <input type="text" name="anneeProd" placeholder="Année de production" style="border:dotted epx grey"/><br/><br/>
             <input type="textarea" name="synopsis" placeholder="Description"><br/><br/>
             Genre:
            <br/><br/>
             Pays:
             
             <br/><br/>
             <input type="submit" value="Valider"/>
         </form>
        </div>
        <div class="pied">
            <c:import url="_PIED.jsp" />
        </div>
    </body>
</html>
