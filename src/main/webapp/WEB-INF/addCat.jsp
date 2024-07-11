<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 11/07/2024
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="cats" scope="request" type="java.util.ArrayList<org.example.exercice4.model.Cat>" />
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Formulaire</title>
</head>
<body>
<h1>Nouveau Chat</h1>
<hr>
<form action="form" method="post">
    <div>
        <label for="name">Nom :</label>
        <input type="text" id="name" name="nom" >
    </div>
    <div>
        <label for="race">Race :</label>
        <input type="text" id="race" name="race" >
    </div>
    <div>
        <label for="favoriteMeal">Repas favorit :</label>
        <input type="text" id="favoriteMeal" name="repas_favoris" >
    </div>
    <div>
        <label for="birthDate">Date de naissance :</label>
        <input type="date" id="birthDate" name="date_de_naissance" >
    </div>
    <button>Ajouter</button>
</form>

<div class="container">
    <h1>Liste des chats</h1>
    <hr>
    <table class="table table-dark text-center align-middle">
        <thead>
        <tr>
            <th>#</th>
            <th>Nom</th>
            <th>Race</th>
            <th>Repas Favoris</th>
            <th>Date de naissance</th>
        </tr>
        </thead>
        <tbody>
        <% for (int i = 0;i < cats.size();i++) { %>
        <tr>
            <td><%= i+1 %></td>
            <td><%= cats.get(i).getName() %></td>
            <td><%= cats.get(i).getRace() %></td>
            <td><%= cats.get(i).getFavoriteMeal() %></td>
            <td><%= cats.get(i).getBirthDate() %></td>

        </tr>
        <% } %>
        </tbody>

    </table>
</div>

</body>
</html>
