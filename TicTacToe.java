import java.util.Scanner;

public class TicTacToe {


    public static void main(String[] args) {
        String[][] squares = {
                {},
                {"O", "X", "X"},
                {"O", "X", "O"}
        };

        for (String[] row : squares
        ) {
            for (String element : row
            ) {

                System.out.print(element + " ");

            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println();


        //  for (int i = 0; i < squares.length; i++) {
        //     System.out.println("Which place do you want to put the symbol?");
        //    String choice = scanner.next();
        //  choice= String.valueOf(squares[i]);

        // }
        System.out.println(squares[1][1]);

    }
}
