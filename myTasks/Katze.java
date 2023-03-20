package myTasks;

import java.util.Scanner;

public class Katze {
    String name;
    int alter;
    String art;

    Katze(String n, int al, String ar) {
        name = n;
        alter = al;
        art = ar;
    }

    static Scanner scanner = new Scanner(System.in);

    public static String meow() {
        System.out.println("Ist die Katze gluecklich?");
        String meow = scanner.next();
        if (meow.equals("ja")) {
            System.out.println("knrrrrrrrrrrrrr");
        } else {
            System.out.println("Meow...:( ");
        }
        return meow;
    }
}
