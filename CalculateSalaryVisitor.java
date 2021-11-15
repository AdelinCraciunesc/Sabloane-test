package test;

public class CalculateSalaryVisitor implements Visitor{
    private int salariu;

    public void calculateSalary(Angajat angajat) {
        salariu += angajat.getSalariul();
    }

    public void printSalary() {
        System.out.println("Pret total angajati: " + this.salariu);
    }
}
