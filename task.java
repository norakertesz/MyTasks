import java.util.Arrays;

public class task { // ARRAY

    public static void main(String[] args) {

        int[] firstArray = new int[]{1, 3, 3, 4, 5};

        for (int i = 0; i < firstArray.length; i++) {

        }

        //------------------------------------------------------
        double[] secondArray= new double[]{1.1,3.5,2.7,9.9,15.2,98.21};
        //Schreibe ein Programm, das ein Array von 5 Gleitkommazahlen erzeugt (Kein
        //Einlesen aus der Konsole) und das größte Element im Array findet und ausgibt.


    double max = secondArray[0];
    for (int i=1; i<secondArray.length; i++) {
        if (secondArray[i]>max) {
            max = secondArray[i];
        }

}
        System.out.println(max);
    }
}
