package org.example.exercice4.controleur;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.exercice4.model.Cat;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@WebServlet("/form")
public class FormServlet extends HttpServlet {

    private List<Cat> cats;

    @Override
    public void init(){
        cats = new ArrayList<>();
        cats.add(new Cat("Tom cat","Chat Grand","Saumon", LocalDate.now()));
        cats.add(new Cat("Bob cat","Chat Moyen","Espadon", LocalDate.now()));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("cats", cats);
        req.getRequestDispatcher("/WEB-INF/addCat.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name =  req.getParameter("nom");
        String race =  req.getParameter("race");
        String favoriteMeal =  req.getParameter("repas_favoris");
        LocalDate birthDate = LocalDate.parse(req.getParameter("date_de_naissance"));
        System.out.println(name);
        System.out.println(race);
        System.out.println(favoriteMeal);
        System.out.println(birthDate);

        Cat newCat = new Cat(name, race, favoriteMeal, birthDate);
        cats.add(newCat);
        req.setAttribute("cats", cats);
        req.getRequestDispatcher("/WEB-INF/addCat.jsp").forward(req,resp);
    }
}
