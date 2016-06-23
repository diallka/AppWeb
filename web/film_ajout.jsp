<%-- 
    Document   : form2
    Created on : 20 juin 2016, 11:51:24
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
<!--        <div class="row">
            <div class="col-md-6 col-md-offset-3">
                

<button type="button" class="btn btn-primary btn-lg active">Primary button</button>

<table class="table table-bordered">
    <tr>
        <th>
            test
            test
            test
        </th>
    </tr>
    <tr>
        <th>
            test
        </th>
    </tr>
</table>
                <form>
  <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Email">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
  </div>
  <div class="form-group">
    <label for="exampleInputFile">File input</label>
    <input type="file" id="exampleInputFile">
    <p class="help-block">Example block-level help text here.</p>
  </div>
  <div class="checkbox">
    <label>
      <input type="checkbox"> Check me out
    </label>
  </div>
  <button type="submit" class="btn btn-default">Submit</button>
</form>
            </div>
</div>-->
             <form method="post">
             <input type="text" name="titre" placeholder="Titre" style="border:dotted epx grey"/><br/><br/>
             <input type="text" name="duree" placeholder="Duree" style="border:dotted epx grey"/><br/><br/>
             <input type="text" name="anneeProd" placeholder="Année de production" style="border:dotted epx grey"/><br/><br/>
             <input type="textarea" name="synopsis" placeholder="Description"><br/><br/>
             Genre:
             <select name="genre_id" style="border:dotted e px grey" >
                 <c:forEach items="${genres}" var="genre">
                     <option value="${genre.id}"> ${genre.nom} </option>
                 </c:forEach>
                 
             </select> <br/><br/>
             Pays:
             <select name="listPays" style="border:dotted epx grey">
                 <option></option>
             </select>
             <br/><br/>
             <input type="submit" value="Valider"/>
         </form>
        </div>
        <div class="pied">
            <c:import url="_PIED.jsp" />
        </div>
    </body>
</html>
