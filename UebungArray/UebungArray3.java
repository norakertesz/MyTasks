package UebungArray;

public class UebungArray3 {
    public static void main(String[] args) {
        double[][] myDoubleArray = {
                {1.1, 2.2, 3.3},
                {4.4, 5.5, 6.6},
                {7.7, 8.8, 9.9}
        };

        double max = myDoubleArray[0][0];
        double min = myDoubleArray[0][0];
        double average = 0;
        double sum = 0;
        double sum2 = 0;
        double sum3 = 0;

        for (int i = 0; i < myDoubleArray.length; i++) {
            for (int j = 0; j < myDoubleArray[i].length; j++) {
                if (myDoubleArray[i][j] > max) {
                    max = myDoubleArray[i][j];
                }
            }
        }
        System.out.println("A legnagyobb element:" + max);

        for (int i = 0; i < myDoubleArray.length; i++) {
            for (int j = 0; j < myDoubleArray[i].length; j++) {
                sum = sum + myDoubleArray[i][j];
                if (myDoubleArray[i][j] < min) {
                    min = myDoubleArray[i][j];
                }
            }
        }
        System.out.println("A legkisebb element:" + min);
        System.out.println("Az elemek összege:" + sum);
        double averageVar = myAverage(myDoubleArray, sum2, average);
        System.out.println("Az elemek atlaga: " + averageVar);
        System.out.print("Az array ezeket az elemeket tartalmazza:");
        myElements();
    }

    public static double myAverage(double[][] myDoubleArray, double sum2, double average) {

        for (int i = 0; i < myDoubleArray.length; i++) {
            for (int j = 0; j < myDoubleArray[i].length; j++) {
                sum2 = sum2 + myDoubleArray[i][j];

            }
            average = sum2 / (myDoubleArray.length * myDoubleArray[i].length);
        }

        return average;
    }

    public static void myElements() {
        double[][] myDoubleArray = {
                {1.1, 2.2, 3.3},
                {4.4, 5.5, 6.6},
                {7.7, 8.8, 9.9}
        };

        for (int i = 0; myDoubleArray.length > i; i++) {
            for (int j = 0; j < myDoubleArray[i].length; j++) {
                System.out.print(myDoubleArray[i][j] + "," + " ");

            }
        }
       
        
    }
}


