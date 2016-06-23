<%-- 
    Document   : _TEMPLATE
    Created on : 17 juin 2016, 10:51:05
    Author     : admin
--%>

<!--ajouter library jstl sinon fonctionne pas-->
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
        <div id="tabs">
            <h1>Liste series</h1>
            
            
            <c:forEach items="${serie}" var="s">
                <table >
                    <tr>
                        <td><a href="detailler_serie?id=${s.id}">${s.titre}</a></td>
                    </tr>
                    <tr>
                        <td>FORMAT:  
                            <br/>
                            SAISON: 
                            <br/>
                            EPISODE: 

                            <br/>

                            PAYS: <c:forEach items="${s.pays}" var="p">
                                ${p.nom}

                            </c:forEach>
                            <br/>
                            GENRE: ${s.genre.nom}
                            <br/>
                            ANNEE: 
                        </td>
                    </tr>
                    <tr>
                        <%--   <q> 
                        ${s.synopsis}
                    </q>    --%>
                    <cite>

                    </cite> 
                    </tr>
                    <tr>
                        <td>
                            ACTEURS: <c:forEach items="${s.acteurs}" var="act">
                                ${act.nom} ${act.prenom},
                            </c:forEach>
                            <br/>            
                            REALISATEUR(S):<c:forEach items="${s.realisateurs}" var="real">
                                ${real.nom} ${real.prenom},
                            </c:forEach>
                        </td>
                    </tr>
                </table>
            </c:forEach>
            
        </div>      
        <br/>

        <div class="pied">
            <c:import url="_PIED.jsp" />
        </div>
    </body>
</html>
