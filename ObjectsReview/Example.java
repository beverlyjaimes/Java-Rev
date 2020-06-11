package ObjectsReview;

public class Example {
    
    public static void main(String[] args) {
        System.out.println("We are making a new PEZ Dispenser.");
        System.out.printf("FUN FACT: There are %d PEZ allowed in every dispenser %n", PezDispenser.MAX_PEZ);
        PezDispenser dispenser = new PezDispenser("Donatello");
        System.out.printf("The dispenser is %s. %n", dispenser.getCharacterName());

        if (dispenser.isEmpty()) {
            System.out.println("Dispenser is empty.");
        }
        System.out.println("Filling the dispneser with delicious PEZ...");
        dispenser.fill();

        if(!dispenser.isEmpty()) {
            System.out.println("Dispenser is full");
        }
        while(dispenser.dispnese()) {
            System.out.println("Chomp!");
        }
        if(dispenser.isEmpty()) {
            System.out.println("Ate all the PEZ");
        }


        
 

    // String before = dispenser.swapHead("Darth Vader");
    // System.out.printf("It was %s but Chris switched it to be %s. %n", before, dispenser.getCharacterName());

    }
}