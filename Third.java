import java.util.Scanner;

public class Third {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein:");
        int myNumber = scanner.nextInt();




        for(int i=1;i<10;i++){
            System.out.println(myNumber+"*"+i+"="+(myNumber*=i));
        }
        for(int i=2;i<10;i++){
            System.out.println(myNumber+"/"+i+"="+(myNumber/=i));
        }

        //--------------------------------------WHILE------------------------------
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Bitte geben Sie noch eine Zahl ein:");
        int myNumber2 = scanner2.nextInt();

        int i=1;
        while(i<=9){
            System.out.println(myNumber2+"*"+i+"="+(myNumber2*=i));
            i++;
        }

        int j=2;
        while(j<=9){
            System.out.println(myNumber2+"/"+j+"="+(myNumber2 /=j));
            j++;

        }
    }
}
