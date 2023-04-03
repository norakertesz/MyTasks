package UebungArray;

public class UebungArray2 {

    public static void main(String[] args) {

        int[][] myArray = {
                {1, 1, 5},
                {2, 1, 3},
                {3, 0, 1},
                {3, 3, 1}
        };


        int[] newArray = new int[myArray.length];
        int counter = 0;
        for (int[] arrayDimensional : myArray
        ) {
            int myVar = 0;
            for (int element : arrayDimensional
            ) {
                myVar += element;
            }
            newArray[counter]=myVar;
            counter++;
        }
        if(newArray[0] == newArray[1] && newArray[0] == newArray[2] &&
                newArray[0] == newArray[3]){
            System.out.println("OK - In diesem zweidimensionalen Array besitzen alle eindimensionalen Arrays die gleiche Summe");
        } else {
            System.out.println("X - In diesem zweidimensionalen Array besitzen NICHT alle eindimensionalen Arrays die gleiche Summe");
        }
    }

    }


