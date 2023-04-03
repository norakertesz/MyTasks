package UebungArray;

public class UebungArray1 {
    public static void main(String[] args) {
        int[][] myArray = {

                {0, 5, 3},
                {5, 5, 1},
                {7, 8, 9}


        };
        int sum = 0;
        int average = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] + " ");

                sum += myArray[i][j];
                average = sum / (myArray.length * myArray[i].length);
            }
        }
        System.out.println();
        System.out.println("The sum of myArray " + sum + "!");
        System.out.println("The average of myArray: " + average);
        System.out.println( "The Max in Array: "+maxValue(myArray));
        System.out.println( "The Min in Array: "+minValue(myArray));

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {

                System.out.println();


            }

        }

    }

    private static int maxValue(int[][] myArray) {
        int max = myArray[0][0];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {

            if (myArray[i][j] > max) {
                max = myArray[i][j];
            }}
        }
        return max;
    }

    private static int minValue(int[][] myArray) {
        int min = myArray[0][0];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {

                if (myArray[i][j] < min) {
                    min = myArray[i][j];
                }}
        }
        return min;
    }
}