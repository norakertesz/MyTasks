package HomeWorkMaerz;

public class Drucker {


    public String myMethod(String text) {
        text = "Das ist ein String.";
        System.out.println(text);
        return text;


    }

    public int myMethod(int x, int y) {


        int sum = x + y;
        System.out.println(sum);
        return sum;
    }

    public double myMethod(double x, double y) {

        double sum = x + y;
        System.out.println(sum);
        return sum;
    }

    public boolean myMethod(boolean drucker) {
        System.out.println(drucker);
        return drucker;
    }
}
