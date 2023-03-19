import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        // Wrong username or password. Please try again.
        //Maximum number of attempts reached. End program.

        String p = "password123";
        String u = "username123";
        int counter = 0;
        do {
            System.out.println("Enter your username:");
            String username = scanner.next(); //user123
            username = username.toLowerCase();
            System.out.println("Enter your password:");
            String password = scanner2.next();//password123
            password = password.toLowerCase();
            counter++;
            if (!(password.equals(p)) && !(username.equals(u)) && counter != 3) {
                System.out.println("Wrong username or password. Please try again.");
                continue;}
                if (counter == 3) {
                    System.out.println("Maximum number of attempts reached. End program.");
                }else{
                    System.out.println("OK");
                    break;
                }
            } while (counter != 3);


    }

}
