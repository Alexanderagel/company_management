package org.example;

import javax.xml.namespace.QName;

public class Developer extends Employe {

    private String programmingLanguage;

    public Developer(String name, String programmingLanguage) {
        super(name);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String getSound() {
        return "Woop Woop!";
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
}