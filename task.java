import java.util.Arrays;

public class task { // ARRAY

    public static void main(String[] args) {

        int[] firstArray = new int[]{1, 3, 3, 4, 5};

        for (int i = 0; i < firstArray.length; i++) {

        }

        //------------------------------------------------------
        double[] secondArray = new double[]{1.1, 3.5, 2.7, 9.9, 15.2, 98.21};
        //Schreibe ein Programm, das ein Array von 5 Gleitkommazahlen erzeugt (Kein
        //Einlesen aus der Konsole) und das größte Element im Array findet und ausgibt.


        double max = secondArray[0];
        for (int i = 1; i < secondArray.length; i++) {
            if (secondArray[i] > max) {
                max = secondArray[i];
            }

        }
        System.out.println(max);

        //--------------------------------------------------
        String[] myStringArray = new String[]{
                "Nora",
                "Victoria",
                "Myla",
                "Cheda",
                "Kata",
                "Ksenija",
                "Sophia",
                "Yasmin"

        };
        int myMax = myStringArray[0].length();
        for (int i = 0; i < myStringArray.length; i++) {
            System.out.println("Name " + myStringArray[i] + " hat " + myStringArray[i].length() + " Buchstaben.");
        }
        System.out.println();
//------------------------------------------
        int[] numberArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        int sum = 0;
        for (int i = 0; i < numberArray.length; i++) {
            sum += numberArray[i];
        }
        System.out.println(sum);


//--------------------------
        int[] myZufallArray = new int[15];


        for (int i = 0; i < myZufallArray.length; i++) {

            int number = (int) (Math.random() * 100);
            myZufallArray[i] = number;
            System.out.print(number + " ");

        }
//---------------------------------------
//        Schreibe ein Programm, das ein Array von 20 Ganzzahlen erzeugt (Kein Einlesen
//        von der Konsole) und nur die geraden Zahlen im Array ausgibt.
        System.out.println();
        System.out.println("---------------------------------------------");
        int[] ganzeZahlen = new int[20];
        for (int a = 0; a < ganzeZahlen.length; a++) {

            int number2 = (int) (Math.random() * 100);
            ganzeZahlen[a] = number2;
            if (number2 % 2 == 0) {
                System.out.print(number2 + " ");

            }
        }
        //-------------------------------------------
//        Schreibe ein Programm, das ein Array von 10 Strings erzeugt (Kein Einlesen von
//        der Konsole) und diejenigen Strings im Array ausgibt, die mit einem bestimmten
//        Buchstaben beginnen.   myStringArray
        System.out.println();
       char startBuchst='K';

for(int i=0;i<myStringArray.length;i++){
    if(myStringArray[i].charAt(0)==startBuchst){
        System.out.println(myStringArray[i]);
    }

}
    }
}
