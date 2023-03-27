package HomeWorkMaerz;

import java.util.Scanner;

public class Tamagochi {
    int x;
    int y;
    int f=10;

    Tamagochi(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String myMove() {
        System.out.println("Where do you want to go?Left, right,up or down?");
        Scanner scanner = new Scanner(System.in);
        String direction = scanner.next();
        System.out.println("How many steps would you like to go?");
        Scanner scanner2 = new Scanner(System.in);
        int myMove = scanner2.nextInt();

        switch (direction) {
            case "up":
                y+=myMove;
                break;
            case "down":
                y-=myMove;
                break;
            case "left":
                x-=myMove;
                break;
            case "right":
                x+=myMove;
            default:
        }

        return direction;
    }
    public void fuettern(int f){
        this.f+=f;
    }

}
