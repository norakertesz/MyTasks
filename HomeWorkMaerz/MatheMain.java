package HomeWorkMaerz;

public class MatheMain {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Addition: " + MatheRechner.addition(a, b));
        MatheRechner.subtraktion(10, 5);
        int multiplikation = MatheRechner.multiplikation(10, 5);
        MatheRechner.division(10.0, 5.0);
        countdown(10);


    }

    public static void countdown(int counter) {

        if (counter == 0) {

            System.out.println(counter);
            return;
        }
        System.out.println(counter);
        counter -= 1;
        countdown(counter);
    }

}
