import java.util.Scanner;

public class Second {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int myNumber = scanner.nextInt();

        for (int i = 1; i <= myNumber; i++) {

            if (i % 2 == 1) {

                System.out.print(i+" ");
            }

        }
    }
}



/*Schreiben Sie ein Java-Programm, das den Benutzer auffordert, eine positive ganze Zahl
einzugeben, und dann alle ungeraden Zahlen von 1 bis zu dieser ganzen Zahl in der
Konsole ausgibt.*/