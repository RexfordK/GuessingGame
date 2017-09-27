/**
 * Created by Rex98 on 9/27/2017.
 */
public class Methods {
    private int playerGuess;
    private String playerChoice;
    private String playerName;


    public void computerStatement1(){
        System.out.println("\nComputer: What number am I thinking of between 1 and 10?");
    }
    public void startingGameString(){
        System.out.println("****Welcome to the guessing game****");
        System.out.println("What is your name?");
    }
    public void computerGreeting1(){
        System.out.printf("Hello " + getPlayerName());
    }

    public int getPlayerGuess() {
        return playerGuess;
    }

    public void setPlayerGuess(int playerGuess) {
        this.playerGuess = playerGuess;
    }

    public String getPlayerChoice() {
        return playerChoice;
    }

    public void setPlayerChoice(String playerChoice) {
        this.playerChoice = playerChoice;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
