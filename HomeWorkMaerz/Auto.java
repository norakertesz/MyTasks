package HomeWorkMaerz;

public class Auto {

    String marke;
    String typ;
    int ps;

    Auto(String marke,
         String typ,
         int ps) {
        this.marke = marke;
        this.typ = typ;
        this.ps = ps;

    }

    Auto() {
        this.marke = "abc";
        this.typ = "bca";
        this.ps = 0;

    }

    public String getMarke() {
        return marke;
    }
}
