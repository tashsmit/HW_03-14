package nyc.c4q.tashsmit;

/***********************************************
 * Command Adventure Game
 * Written by Tasha Smith
 * 3/12/15
 * Please keep in mind, program was not designed
 * for user to enter anything besides what program
 * prompts you to. Will further improve the code
 * at a later time
 * **********************************************
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer = " ";
        Boolean pooh = false;
        Boolean keepGoing = false;
        Boolean food = false;

        while (!answer.equalsIgnoreCase("q")) {

            //Print out game greeting and map
            System.out.println("               Welcome to my Command Adventure Game. Press q at anytime to quit");
            System.out.println("                    _______________________");
            System.out.println("                    *                     *");
            System.out.println("                    *  X   - - - -  {H}   *");
            System.out.println("                    *  |                  *");
            System.out.println("                    *  |                  *");
            System.out.println("                    *  | - - - N          *");
            System.out.println("                    _______________________");

            //Tell user where they are and ask first question
            System.out.println("You are home {H} in Wunderbelly Forest. It is a sunny and beautiful day" +
                    "outside, would you like to go on an adventure? (Y/N)");
            answer = input.nextLine();

            if (answer.equalsIgnoreCase("y")) {
                System.out.println("Great! Let's go");
                System.out.println("You have walked approximately 60 miles west and" +
                        "have arrived at point X. You met a rather large bunny on the way named 'Pooh'.");
                System.out.println("             _______________________");
                System.out.println("             *                     *");
                System.out.println("             *  {X} - - - -   H    *");
                System.out.println("             *  |                  *");
                System.out.println("             *  |                  *");
                System.out.println("             *  | - - - N          *");
                System.out.println("             _______________________");

                System.out.println("Would you like to keep Pooh?");
                answer = input.nextLine();
                //Will determine if user wants to keep Pooh rabbit

                if (answer.equalsIgnoreCase("y")) {
                    pooh = true;
                    System.out.println("Awesome, Pooh will keep you company along your adventure.");
                } else {
                    pooh = false;
                    System.out.println("Good idea, he probably would make better as dinner than a companion");
                }
                System.out.println("It is starting to get late now.");
                //Will ask user if they want to camp or keep going depending if
                //they have pooh or not

                if (pooh == true) {
                    System.out.println("What should you and pooh do?");
                    System.out.println("keep going (K)");
                    System.out.println("or camp out in the forest? (C)");
                } else {
                    System.out.println("What should you do?");
                    System.out.println("keep going (K)");
                    System.out.println("or camp out in the forest? (C)");
                }

                answer = input.nextLine();

                // Will determine if user has pooh, kept going or went camping
                // user will die if camped with or without pooh
                if (answer.equalsIgnoreCase("c") && pooh == true) {
                    System.out.println("As you fell asleep, Pooh turned into a beast and ate you. Sorry you lost! Play " +
                            "again? Y/N");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("y"))
                        continue;
                    else
                        break;
                } else if ((answer.equalsIgnoreCase("k") && pooh == true)) {
                    keepGoing = true;
                    System.out.println("Okay off you guys go!");
                } else if ((answer.equalsIgnoreCase("c") && pooh == false)) {
                    keepGoing = false;
                    System.out.println("Good idea! But you had no one to protect you. A gang of possums came and ate " +
                            "you alive. Sorry you lost! Play again Y/N?");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("y"))
                        continue;
                    else
                        break;
                } else {
                    keepGoing = true;
                    System.out.println("Okay, I hope you like walking in the forest alone in the dark");
                }
                System.out.println("Sun is up and the weather is nice.");

                //User will come to neighbors house now alone or with pooh

                // if kept on going with pooh rabbit
                if (pooh == true) {
                    System.out.println("You and Pooh are quite tired and hungry. You guys reach a neighbors {N} house");
                    System.out.println("             _______________________");
                    System.out.println("             *                     *");
                    System.out.println("             *  X   - - - -   H    *");
                    System.out.println("             *  |                  *");
                    System.out.println("             *  |                  *");
                    System.out.println("             *  | - -  {N}         *");
                    System.out.println("             _______________________");
                    System.out.println("What do you want to do (enter number): ");
                    System.out.println("0.Knock on the door");
                    System.out.println("1.Sneak in and look around");
                    System.out.println("2.Keep going");
                    answer = input.nextLine();
                    //Outcomes of the three options
                    if (answer.equals("0")) {
                        System.out.println("A rather large woman opens the door.");
                        System.out.println("'Hello fellow and rabbit. Come inside. You guys look hungry.'");
                        //User decides if to go inside neighbors house or not
                        //Use will die if they go inside
                        System.out.println("Go inside? Y/N");
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("y")) {
                            System.out.println("Not so smart of an idea. The woman guts Pooh, cooks him and eats him. She" +
                                    " locks you away in a cage and you starve to death. Sorry you lost! Play again? " +
                                    "Y/N");
                            answer = input.nextLine();

                            if (answer.equalsIgnoreCase("y"))
                                continue;
                            else
                                break;
                        } else {
                            food = false;
                            System.out.println("You and Pooh carry along your way");
                        }
                        //Sneak in and look around option
                        //They can look for food or leave
                    } else if (answer.equals("1")) {
                        System.out.println("You guys sneak through the basement window");
                        System.out.println("Down there, you see a bunch of skulls, bloody butcher tables and human " +
                                "corpses");
                        System.out.println("Look for food (F) or leave (L)?");
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("f")) {
                            food = true;
                            System.out.println("You and Pooh find some left over meaty dishes on the table. You guys " +
                                    "quickly leave the house safe and sound");
                        } else {
                            food = false;
                            System.out.println("You and Pooh carry along your way");
                        }
                    } else {
                        food = false;
                        System.out.println("You and Pooh carry along your way");
                    }
                } else if (pooh == false) {
                    System.out.println("You are quite tired and hungry. You reach a neighbors {N} house");
                    System.out.println("             _______________________");
                    System.out.println("             *                     *");
                    System.out.println("             *  X   - - - -   H    *");
                    System.out.println("             *  |                  *");
                    System.out.println("             *  |                  *");
                    System.out.println("             *  | - -  {N}         *");
                    System.out.println("             _______________________");
                    System.out.println("What do you want to do (enter number): ");
                    System.out.println("0.Knock on the door");
                    System.out.println("1.Sneak in and look around");
                    System.out.println("2.Keep going");
                    answer = input.nextLine();
                    //Outcomes of the three options
                    if (answer.equals("0")) {
                        System.out.println("A rather large woman opens the door.");
                        System.out.println("'Hello sir, you look rather grave. Come inside to eat some food.");
                        //User decides if to go inside neighbors house or not
                        //Use will die if they go inside
                        System.out.println("Go inside? Y/N");
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("y")) {
                            System.out.println("Not so smart of an idea. The woman beat you half to death and " +
                                    "makes you her infinite slave. Sorry you lost! Play again? " +
                                    "Y/N");
                            answer = input.nextLine();
                            if (answer.equalsIgnoreCase("y"))
                                continue;
                            else
                                break;
                        } else {
                            food = false;
                            System.out.println("You carry along your way");
                        }
                        //Sneak in and look around option
                        //User can look for food or leave
                    } else if (answer.equals("1")) {
                        System.out.println("You find a side door slightly open");
                        System.out.println("Through the door you see a whole bunch of people tied up and starving" +
                                "but some rather good looking plates of food on a table");
                        System.out.println("Go for the food (F) or leave (L)?");
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("f")) {
                            food = true;
                            System.out.println("You quickly grab some bites to eat and get out of there right " +
                                    "before the woman gets back");
                        } else {
                            food = false;
                            System.out.println("You run away.");
                        }
                    } else {
                        System.out.println("After walking 2 miles you collapse from food starvation and exhaustion " +
                                "and die under the blazing sun. Sorry you lose! Play again? Y/N");
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase("y"))
                            continue;
                        else
                            break;
                    }
                }
                System.out.println("You find a highway, hitchhike and head back home! Congratulations you " +
                        "won. Play again? Y/N");
                answer = input.nextLine();
                if (answer.equalsIgnoreCase("y"))
                    continue;
                else
                    break;
            } else {
                System.out.println("You ended the session. Do you want to play again? (Y/N)");
                answer = input.nextLine();
                if (answer.equalsIgnoreCase("y"))
                    continue;
                else
                    break;
            }
        }
        System.out.println("See ya!");

        }
    }

