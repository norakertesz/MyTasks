package OOP;


public class Rechteck {

    private double width;
    private double height;

    double breite;
    double hoehe;

    Rechteck(double breite, double hoehe) {
        this.breite = breite;
        this.hoehe = hoehe;

    }

    public double getWidth() {
        return breite;
    }

    public double getHeight() {
        return hoehe;
    }

    public void setWidht(double breite) {
        this.breite = breite;
    }

    public void setHeight(double hoehe) {
        this.hoehe = hoehe;
    }

    public double getFlaeche() {
        double flaeche = breite * hoehe;
        System.out.println("Flaeche ist " + flaeche + " m2.");
        return flaeche;
    }

    public double getUmfang() {
        double umfang = 2 * (breite + hoehe);
        System.out.println("Umfang ist: " + umfang + ".");
        return umfang;
    }


}
