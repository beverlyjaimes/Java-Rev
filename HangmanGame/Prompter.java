package HangmanGame;

import java.util.Scanner;

class Prompter {
    private Game game;

    public Prompter(Game game) {
        this.game = game;
    }

    public boolean promtForGuess() {
        Scanner scanner = new Scanner(System.in); 
        boolean isHit = false;
        boolean isAcceptable = false;
        do {
            System.out.print("Enter a letter:  ");
            String guessInput = scanner.nextLine();

            try {
              isHit = game.applyGuess(guessInput);
              isAcceptable = true;
            } catch(IllegalArgumentException iae) {
                System.out.printf("%s. Please try again. %n",
                                iae.getMessage());
            }
        }while (! isAcceptable);
        return isHit;
    }

    public void displayProgress() {
        System.out.printf ("You have %d treis left to solve:  %s%n", 
        game.getRemainingTries(),
        game.getCurrentProgress());
    }

    public void displayOutcome() {
        if (game.isWon()) {
            System.out.printf("You won! %n Tries Remaining: %d%n The word was: %s%n ",
                                game.getRemainingTries(),
                                game.getAnswer());
        } else if (!game.isWon())  {
            System.out.printf("You lost the game. The word was: %s%n ",
                                game.getAnswer());
        }
    }
}
