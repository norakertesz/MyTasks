public class MyClass {
    public static void main(String[] args) {

       Oop h1=new Oop();
       h1.name="Rex";
       h1.alter=3;
       h1.rasse="Mischling";
       h1.farbe="schwarz";
       h1.hatErGebellt();
        System.out.println(h1.name+" ist mein Hund. Er ist ein " + h1.farbe+" "+h1.rasse+", und "+h1.alter+" Jahre alt.");
        System.out.println(h1.hatErGebellt());

//-------------------------------------------------
        System.out.println(h1.stock());
        h1.seinStock();
    }




}
