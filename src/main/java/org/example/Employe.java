package org.example;

public class Employe extends Person {


    public Employe(String name) {
    setName(name);

        this.name = name;
    }

    public String getSound() {
        return "Aaow!";
    }

    public String getName(){ return name;}

    public String setName() {
        return name;
    }

    public void setName(String name) {


        this.name = capitalizeFisrLetter(name);

    }


    @Override
    public String eatFood() {
        return "Nom Nom Nom!";


    }

    protected String capitalizeFisrLetter(String input) {
        String firstCharacter = input.substring(0, 1).toUpperCase();
        String rest = input.substring(1);
        return firstCharacter + rest;

    }





}