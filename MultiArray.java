import java.util.Arrays;

public class MultiArray {


    public static void main(String[] args) {


        int[][][][] myArray = new int[4][3][2][2];

int counter=0;

    for (int[][][] secondArray : myArray
    ) {
        for (int[][] thirdArray : secondArray
        ) {
            for (int[] fourthArray : thirdArray
            ) {
                for (int item : fourthArray
                ) {counter++;

                }
            }
        }
    } System.out.print(counter);
}
    }

