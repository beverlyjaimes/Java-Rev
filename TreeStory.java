import java.io.Console;
import java.util.Scanner;

 
public class TreeStory {
    
    public static void main(String[] args) {
        Console console = System.console();
        // Scanner scan = new Scanner(System.in);
        /*
         * Some terms: noun - Person, place or thing verb - An action adjective - A
         * description used to modify or describe a noun Enter your amazing code here!
         */
    String ageAsString = console.readLine("How old are you? ");
    // System.out.print("How old are you?\n");
    int age = Integer.parseInt(ageAsString);
    // int age = scan.nextInt();
    // System.out.print(age);
    if (age >= 13 ) {
        String name = console.readLine("Enter a name:  ");
        String adjective = console.readLine("Enter an adjective:  ");
        boolean isInvalidWord;
        String noun;
        do {
            noun = console.readLine("Enter a noun:  ");
            isInvalidWord = (noun.equalsIgnoreCase("dork") || noun.equalsIgnoreCase("dork"));
            if (isInvalidWord) {
                console.printf("That language is not allowed. Try again. \n");
            }
        } while (isInvalidWord) ;
        String adverb = console.readLine("Enter an adverb:  ");
        String verb = console.readLine("Enter a verb ending with -ing:  ");
          
          console.printf("Your TreeStory:\n---------------------\n");
          console.printf("%s is a %s %s. ", name, adjective, noun);
          console.printf("They are always %s %s.\n", adverb, verb);
    } else {
        console.printf("You must be at least 13 to play.\n");
        System.exit(0);
    }
   
    }
    
}