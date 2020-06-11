package ObjectsReview;

public class Example {
    
    public static void main(String[] args) {
        System.out.println("We are making a new PEZ Dispenser.");
        System.out.printf("FUN FACT: There are %d PEZ allowed in every dispenser %n", PezDispenser.MAX_PEZ);
        PezDispenser dispenser = new PezDispenser("Donatello");
        System.out.printf("The dispenser is %s. %n", dispenser.getCharacterName());
        System.out.println("Filling the dispneser with delicious PEZ...");
        dispenser.fill();
        
 

    // String before = dispenser.swapHead("Darth Vader");
    // System.out.printf("It was %s but Chris switched it to be %s. %n", before, dispenser.getCharacterName());

    }
}