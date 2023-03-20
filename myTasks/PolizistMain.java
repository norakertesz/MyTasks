package myTasks;

public class PolizistMain {
    public static void main(String[] args) {

        Polizist personGesw=new Polizist();
        System.out.println("Geben Sie Geschwindigkeit ein:");
       float myGsw= personGesw.myMethod();

        Justiz personStr=new Justiz();
        personStr.strafeErrechnen(myGsw);

    }
}
