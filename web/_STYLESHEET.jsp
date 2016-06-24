<%-- 
    Document   : _STYLESHEET
    Created on : 17 juin 2016, 10:51:32
    Author     : admin
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%@page contentType="text/html" pageEncoding="UTF-8"%>

 <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
<%--<c:choose>
        <c:when test="${cookie.login==null}">
           
        </c:when>
        <c:otherwise>
            <a href="deconnexion_utilisateur">Déconnexion</a></th> 
            <c:if test="${cookie.util_type.getValue() == 'ADMIN'}">
                
            <th><a href="film_ajouter">Ajouter un film</a>***</th>
            <th><a href="serie_ajouter">Ajouter une serie</a>***</th>
    
            </c:if>
        </c:otherwise>
    </c:choose>--%>

<link href="css/${cookie.style_prefere.getValue()}.css" rel="stylesheet" type="txt/css" />