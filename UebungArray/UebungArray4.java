package UebungArray;

public class UebungArray4 {
    public static void main(String[] args) {
        int[][] myArray = {
                {1, 1, 5},
                {2, 2, 3},
                {3, 3, 1},
                {3, 3, 1}
        };

        int counter = 0;
        int[] newArray = new int[myArray.length];
        int sum=0;
        myMethod(sum, myArray, counter, newArray);
    }

    public static void myMethod(int sum, int[][] myArray, int counter, int[] newArray) {

        for (int[] myNewArray : myArray
        ) {
            sum = 0;
        for (int element : myNewArray
        ) {
            sum += element;
        }
        newArray[counter] =sum;
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







