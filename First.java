import java.util.Scanner;

public class First {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int myNumber = scanner.nextInt(); // Die angegebene Zahl gibt an, wie lang die Zahlenfolge ist/wie viele Zahlen sie enthält.
        int startNumber = 0;
        int nextNumber = 1;

        for (int i = 0; i <= myNumber; i++) {
            System.out.print(startNumber+" ");//startNumber=0, i=0, nextNumber=1;
            int sum = startNumber + nextNumber;// i=0, sum=0+1;

            startNumber = nextNumber; //i=0, startNumber=1
            nextNumber = sum; //nextNumber=1
//naechste Runde: startNumber=1;


        }


    }
}
