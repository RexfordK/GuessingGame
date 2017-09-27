import java.security.SecureRandom;
import java.util.Scanner;


public class GuessingGame {
    //PLayer will guess numbers from 1-10, if the player's guess is the computer's guess, the player wins. PLayer has 3 chances to win.

    public static void main(String[] args) {
        Methods myMethods = new Methods();
        Scanner userIn = new Scanner(System.in);
        SecureRandom ranGen = new SecureRandom();


//Start the Game
        myMethods.startingGameString();
        myMethods.setPlayerName(userIn.next());
//Computer:
        myMethods.computerGreeting1();




        for (int counter = 2; counter > -1; --counter) {
//
            if (counter == 2){
                System.out.println("\nLets begin");
            }

            myMethods.computerStatement1(); //What number am I thinking of?

            //creating the computer's guess (Random number 1-10)
            int computerGuess = 1 + ranGen.nextInt(10);

            //player guesses number
            myMethods.setPlayerGuess(userIn.nextInt());

            // System.out.println("You guessed " + playerGuess);


            if (myMethods.getPlayerGuess() == computerGuess) {
                System.out.println("The computer guessed " + computerGuess + " You guessed right!!!\n YOU ARE THE WINNER!!!");

                counter = 0;
            } else if (computerGuess - myMethods.getPlayerGuess() <= 2 && computerGuess - myMethods.getPlayerGuess() > 0) {
                System.out.println("The computer guessed " + computerGuess + " and the player guessed " + myMethods.getPlayerGuess() + "\nSo Close!! Just " + (computerGuess - myMethods.getPlayerGuess()) + " number(s) away!  Try again!!!!");

            } else if (myMethods.getPlayerGuess() - computerGuess <= 2 && myMethods.getPlayerGuess() - computerGuess > 0) {
                System.out.println("The computer guessed " + computerGuess + " and the player guessed " + myMethods.getPlayerGuess() + "\nSo Close!! Just " + (myMethods.getPlayerGuess() - computerGuess) + " number(s) away! Try again!!!!");

            } else {
                System.out.println("The computer guessed " + computerGuess + " and the player guessed " + myMethods.getPlayerGuess() + "!!");
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





