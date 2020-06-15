package HangmanGame;

public class Hangman {
    public static void main(String[] args) {
        Game game = new Game("treehouse");
        Prompter prompter = new Prompter(game);
        prompter.displayProgress();
        boolean isHit = prompter.promtForGuess();
        if (isHit) {
            System.out.println("We've got a hit!");
        } else {
            System.out.println("Oops missed!");
        }
        prompter.displayProgress();
    }
}