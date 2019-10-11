package com.practicepizza.app;
import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        //Declarations
        byte PizzaSize = 0;
        String PizzaType = "";

        //Implement scanner
        Scanner in = new Scanner(System.in);
        //Input from user
        System.out.print("Write the size of your pizza: ");
        PizzaSize = in.nextByte();
        //Process
        if(PizzaSize <= 7){
            PizzaType = "little";
        }
        else if(PizzaSize == 12){
            PizzaType = "median";
        }
        else if(PizzaSize == 15){
            PizzaType = "big";
        }
        else if(PizzaSize > 15){
            PizzaType = "mega";
        }

        //Output result
        System.out.println("You're pizza is "+PizzaType);
    }
}
