package test;

public abstract class Angajat implements Element{
    protected String nume;
    protected String adresa;
    protected int salariul;
    
    public Angajat(String nume, String adresa, int salariul) {
        this.nume = nume;
        this.adresa = adresa;
        this.salariul = salariul;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getSalariul() {
        return salariul;
    }

    public void setSalariul(int salariul) {
        this.salariul = salariul;
    }

    @Override
    public String toString() {
        return "Angajat [adresa=" + adresa + ", nume=" + nume + ", salariul=" + salariul + "]";
    }

    

}
