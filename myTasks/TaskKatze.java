package myTasks;

public class TaskKatze {

    public static void main(String[] args) {
        Katze k1=new Katze("Cirmi",2,"Hauskatze");
       /* k1.name="Cirmi";
        k1.alter=2;
        k1.art="Hauskatze";*/
       System.out.println("Meine Katze ist "+k1.name+" und sie ist "+k1.alter+ " Jahre alte "+k1.art+".");
       String myMeow= k1.meow();

    }
}
