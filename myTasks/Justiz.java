package myTasks;

import java.util.Scanner;

public class Justiz {


    public static float strafeErrechnen(float myGsw){

        float meinStrafe=myGsw;
       if(meinStrafe<20){
           System.out.println("Sie muessen keine Strafe zahlen");
       }else{
           System.out.println("Sie muessen 100 EUR Strafe zahlen");

       }
        return meinStrafe;
    }
}


