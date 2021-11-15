package test;

public class AngajatIT extends Angajat{
    protected String post;

    public AngajatIT(String nume, String adresa, int salariul, String post) {
        super(nume, adresa, salariul);
        this.post = post;
    }

    @Override
    public void print() {
        // TODO Auto-generated method stub
        System.out.println("Angajat IT cu postul: " + this.post);
    }

    @Override
    public void accept(Visitor visitor) {
        // TODO Auto-generated method stub
        
    }
    
}
