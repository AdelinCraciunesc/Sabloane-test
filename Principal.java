package test;

import java.util.ArrayList;
// Metoda main imi dadea eroare cand se numea fisierul main nu stiu de ce
public class Principal {
    public static void main(String[] args) {
        Companie comp = new Companie();
        ArrayList<Element> elements = new ArrayList<Element>();
        ArrayList<Angajat> ang1 = new ArrayList<Angajat>();
        AngajatIT a1 = new AngajatIT("nume", "adresa", 300, "IT");
        AngajatHR a2 = new AngajatHR("nume1", "adresa1", 400, "HR");
        ang1.add(a1);
        ang1.add(a2);
        Departament d1 = new Departament("logistica", ang1, elements);
        Departament d2 = new Departament("infrastructura", ang1, elements);
        comp.add(d1);
        comp.add(d2);

        comp.print();

        CalculateSalaryVisitor c = new CalculateSalaryVisitor();
        comp.accept(c);

        c.printSalary();
    }
}
