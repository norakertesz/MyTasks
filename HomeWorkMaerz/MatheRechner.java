package HomeWorkMaerz;

public class MatheRechner {
    public static void main(String[] args) {
        addition(10,5);
        subtraktion(10,5);
        multiplikation(10,5);
        division(10.0,5.0);
    }

    public static int addition(int a, int b) {
        return a+b;

    }

    public static int subtraktion(int a, int b) {
        int c;
        c = a - b;
        System.out.println("Subtraktion:" + c);
        return c;
    }

    public static int multiplikation(int a, int b) {
        int c;
        c = a * b;
        System.out.println("Multiplikation:" + c);
        return c;

    }

    public static double division(double a, double b) {
        double c;
        c = a / b;
        System.out.println("Division:" + c);
        return c;
    }


}
