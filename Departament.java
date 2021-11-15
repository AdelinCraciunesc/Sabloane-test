package test;

import java.util.ArrayList;

public class Departament implements Element{
    protected String categorie;
    protected ArrayList<Angajat> angajati;

    public Departament(String categorie, ArrayList<Angajat> angajati, ArrayList<Element> elements) {
        this.categorie = categorie;
        this.angajati = angajati;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    @Override
    public void print() {
        // TODO Auto-generated method stub
        System.out.println("Departament categorie=" + categorie);
        for(Angajat angajat: angajati)
        {
            System.out.println("Angajat: " + angajat);
        }
    }

    @Override
    public void accept(Visitor visitor) {
        // TODO Auto-generated method stub
        for(Angajat angajat: angajati)
        {
            visitor.calculateSalary(angajat);
        }
    }

}
