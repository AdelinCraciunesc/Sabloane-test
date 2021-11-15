package test;

public class AngajatHR extends Angajat{
    protected String post;

    public AngajatHR(String nume, String adresa, int salariul, String post) {
        super(nume, adresa, salariul);
        this.post = post;
    }

    @Override
    public void print() {
        // TODO Auto-generated method stub
        System.out.println("Angajat HR cu postul: " + this.post);
    }

    @Override
    public void accept(Visitor visitor) {
        // TODO Auto-generated method stub
        
    }
    
}
