package org.example;

public class Employe extends Person {



    public Employe(String name) {
        this.name = name;
    }

    public String getSound() {
        return "Aaow!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String firstCharacter = name.substring(0, 1).toUpperCase();
        String rest = name.substring(1);
        this.name = firstCharacter + rest;
    }

    @Override
    public String eatFood() {
        return "Nom Nom Nom!";


    }
}