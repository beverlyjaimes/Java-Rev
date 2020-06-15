package HangmanGame;

import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Player One:" + "\n" +" Please enter a word for the other player to guess: ");
        String theWord = input.nextLine();
        Game game = new Game(theWord);
        Prompter prompter = new Prompter(game);

        while (game.getRemainingTries() > 0 && !game.isWon()) {
            prompter.displayProgress();
            prompter.promtForGuess();
        }
        prompter.displayOutcome();
       


        // boolean isHit = prompter.promtForGuess();
        // if (isHit) {
        //     System.out.println("We've got a hit!");
        // } else {
        //     System.out.println("Oops missed!");
        // }
        // prompter.displayProgress();
    }
}