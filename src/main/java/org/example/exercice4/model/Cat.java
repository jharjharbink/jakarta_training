package org.example.exercice4.model;

import java.time.LocalDate;
import java.util.Date;

public class Cat {
    private String name;
    private String race;
    private String favoriteMeal;
    private LocalDate birthDate;

    public Cat(String name, String race, String favoriteMeal, LocalDate birthDate) {
        this.name = name;
        this.race = race;
        this.favoriteMeal = favoriteMeal;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getFavoriteMeal() {
        return favoriteMeal;
    }

    public void setFavoriteMeal(String favoriteMeal) {
        this.favoriteMeal = favoriteMeal;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
