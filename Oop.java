import java.util.Scanner;

public class Oop {
    String name;
    int alter;
    String farbe;
    String rasse;
    String bellt = "Wuff";

    public String hatErGebellt() {
        return bellt;
    }

    public boolean stock() {
        System.out.println("Bitte ein N oder Y eingeben");
        Scanner input = new Scanner(System.in);

        if (input.next().equals("Y")) {
            return true;
        } else {
            return false;
        }
    }

    public String seinStock() {
        System.out.println("Holt er sein Stock zurueck?");
        Scanner input = new Scanner(System.in);
        String answer = input.next();
        if (answer.equals("ja")) {
            System.out.println("Super!");;
        } else {
            System.out.println("Schade...aber er hat noch Zeit es zu lernen.");
        }return answer;
    }
}
