package nyc.c4q.tashsmit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String adventure = " ";

        //Print out game greeting and map
        System.out.println("Welcome to my Command Adventure Game");
        System.out.println("_______________________");
        System.out.println("*                     *");
        System.out.println("*  X   - - - -  {H}   *");
        System.out.println("*  |                  *");
        System.out.println("*  |                  *");
        System.out.println("*  | - - - N - - - #  *");
        System.out.println("*          |          *");
        System.out.println("*          |          *");
        System.out.println("*          |          *");
        System.out.println("*          #          *");
        System.out.println("*                     *");
        System.out.println("_______________________");

        //Tell user where they are and ask first question
        System.out.println("You are home {H} in Wunderbelly Forest. It is a sunny and beautiful day" +
                "outside, would you like to go on an adventure? (Y/N");
        adventure = input.nextLine();

        if (adventure.toLowerCase().equals("y")) {
            System.out.println("Great! Let's go");
            System.out.println("You have walked approximately 60 miles west and" +
                    "met a rather large bunny on the way named 'Jorge'.");
            System.out.println("It is starting to get late. Should you and Jorge camp out (C)" +
                    "or keep going (K)?");
            adventure = input.nextLine();
            if (adventure.toLowerCase().equals("c")) {
                System.out.println("Good idea! You and Jorge will proceed tomorrow morning");
                System.out.println("Sun is up and it's time to go!");
                System.out.println("You and Jorge walk 20 miles south and 10 miles east. You guys" +
                        "reach a neighbors {N} house");
                System.out.println("What do you want to do (enter number): ");
                System.out.println("0.Knock on the door");
                System.out.println("1.Knock on the door");
                System.out.println("1.Knock on the door"

            }
        }
        else
            System.out.println("Okay, you stay home and rest. Play again? (Y/N)?");




    }
}
