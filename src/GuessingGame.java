import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * Created by Rex98 on 7/31/2017.
 */
public class GuessingGame {
    //PLayer will guess numbers from 1-10, if the player's guess is the computer's guess, the player wins. PLayer has 3 chances to win.

    public static void main(String[] args) {

        Scanner userIn = new Scanner(System.in);
        SecureRandom ranGen = new SecureRandom();


//Start the Game
        System.out.println("****Welcome to the guessing game****");


        System.out.println("What is your name?");
        String playerName = userIn.nextLine();
//Computer:
        System.out.println("Hello " + playerName);


int playerGuess;

        for (int counter = 2; counter > -1; --counter) {
//
            while (counter == 2){
                System.out.println("Lets begin\n");
                break;
            }
            System.out.println("\nComputer: What number am I thinking of between 1 and 10?");

            //creating the computer's guess (Random number 1-10)
            int computerGuess = 1 + ranGen.nextInt(10);

            //player guesses number
            playerGuess = userIn.nextInt();

            // System.out.println("You guessed " + playerGuess);

            if (playerGuess == computerGuess) {
                System.out.println("The computer guessed " + computerGuess + " You guessed right!!!\n YOU ARE THE WINNER!!!");

                counter = 0;
            } else if (computerGuess - playerGuess <= 2 && computerGuess - playerGuess > 0) {
                System.out.println("The computer guessed " + computerGuess + " and the player guessed " + playerGuess + "\nSo Close!! Just " + (computerGuess - playerGuess) + " number(s) away!  Try again!!!!");

            } else if (playerGuess - computerGuess <= 2 && playerGuess - computerGuess > 0) {
                System.out.println("The computer guessed " + computerGuess + " and the player guessed " + playerGuess + "\nSo Close!! Just " + (playerGuess - computerGuess) + " number(s) away! Try again!!!!");

            } else {
                System.out.println("The computer guessed " + computerGuess + " and the player guessed " + playerGuess + "!!");
            }

            if (counter > 1) {
                System.out.println("you have " + counter + " more tries!");
            } else if (counter == 1 ) {
                System.out.println("you have " + counter + " more attempt!");

            }


            while (counter == 0) {

                Scanner playerIn = new Scanner(System.in);
                System.out.println("Game Over \nPLay again?(y/n)");
                String choice = playerIn.next();


                if (choice.equalsIgnoreCase("y")) {
                    counter = 2;

                } else if (choice.equalsIgnoreCase("n")) {
                    System.out.println("\nGoodbye");
                    System.exit(0);
                }

            }


        }
    }

}





