package org.example.exercice4.controleur;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.exercice4.model.Cat;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@WebServlet("/form")
public class FormServlet extends HttpServlet {

    private List<Cat> personList;

    @Override
    public void init(){
        personList = new ArrayList<>();
        personList.add(new Cat("toto","Chat Grand","Saumon", new Date()));
        personList.add(new Cat("tata","Chat Moyen","Espadon", new Date()));
        personList.add(new Cat("toto","Chat Petit","Poisson Rouge", new Date()));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/addCat.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name =  req.getParameter("nom");
        String race =  req.getParameter("race");
        String favoriteMeal =  req.getParameter("repas_favoris");
        String birthDate = req.getParameter("date_de_naissance");
        System.out.println(name);
        System.out.println(race);
        System.out.println(favoriteMeal);
        System.out.println(birthDate);

        Cat newCat = new Cat(name, race, favoriteMeal, new Date(birthDate));
        personList.add(newCat);
        req.setAttribute("persons",personList);
        req.getRequestDispatcher("/WEB-INF/addCat.jsp").forward(req,resp);
    }
}
