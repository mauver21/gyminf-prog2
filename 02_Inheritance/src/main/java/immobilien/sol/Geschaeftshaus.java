package immobilien.sol;

public class Geschaeftshaus extends Immobilie {
    private int lagerFlaeche, bueroFlaeche;

    public Geschaeftshaus(String besitzer, int baujahr, double preis, int lagerFlaeche, int bueroFlaeche) {
        super(besitzer, baujahr, preis);
        this.lagerFlaeche = lagerFlaeche;
        this.bueroFlaeche = bueroFlaeche;
    }

    public int getLagerFlaeche() {
        return lagerFlaeche;
    }

    public void setLagerFlaeche(int lagerFlaeche) {
        this.lagerFlaeche = lagerFlaeche;
    }

    public int getBueroFlaeche() {
        return bueroFlaeche;
    }

    public void setBueroFlaeche(int bueroFlaeche) {
        this.bueroFlaeche = bueroFlaeche;
    }

    @Override
    public void print() {
        //super.print();
        System.out.printf("Sie ist ein Geschäftshaus mit %dm^2 Lagerläche und %dm^2 Bürofläche%n", lagerFlaeche, bueroFlaeche);
    }

}
