<%-- 
    Document   : utilisateur_connexion
    Created on : 21 juin 2016, 13:58:05
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
       
        <div class="contenu">
            <h3>Authentification</h3>
            
<form method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">Identifiant:</label>
    <input name="login" type="text" placeholder="identifiant">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Mot de passe:</label>
    <input  name="mdp" type="password"  placeholder="mot de passe">
  </div>
 
  <button type="submit"  class="btn btn-default">Valider</button> 
  <a href="inscrire_utilisateur" >S'inscrire?</a>
</form>
            
            
        </div>
        <br/><br/>
        <div class="pied">
            <c:import url="_PIED.jsp" />
        </div>
    </body>
</html>