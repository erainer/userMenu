package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);                       //Initialize input
        int number;                                                     //Stores users choice
        boolean done = false;                                           //Checks for valid entry
        do {
            System.out.println("Enter the number of your choice:\n" +   //Menu
                    "1.Burrito\n2.Taco\n3.Chalupa\n4.Nachos\n5.Exit\n");
            number = scanner.nextInt();                                 //Stores input into number
            if(number > 0 && number < 6)                                //Chosen message
                System.out.println("You have chosen:");
            switch(number) {                                            //Determine which choice was picked
                case 1:
                    done = true;
                    System.out.println("Burrito"); break;
                case 2:
                    done = true;
                    System.out.println("Taco"); break;
                case 3:
                    done = true;
                    System.out.println("Chalupa"); break;
                case 4:
                    done = true;
                    System.out.println("Nachos"); break;
                case 5:
                    done = true;
                    System.out.println("Exit"); break;
                default:
                    done = false;
                    System.out.println("Invalid number, please try again"); break;
            }
        }while(number != 1 && number != 2 && number != 3 && number != 4);   //Validates choices

    }
}