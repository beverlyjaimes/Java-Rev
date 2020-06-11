package ObjectsReview;

public class PezDispenser {
    public static final int MAX_PEZ = 12;
    // the word FINAL before the var says var can only be initialized once
    final private String characterName;
    private int pezCount;
    // CONSTRUCTOR
    public PezDispenser(String charachterName) {
        this.characterName = charachterName;
        pezCount = 0;
    }

    // overloading 
    public void fill(){
        pezCount = MAX_PEZ;
    }

    public void fill(int pezAmount) {
        int newAmount = pezCount +=pezAmount;
        if (newAmount > MAX_PEZ) {
            throw new IllegalArgumentException("Too many PEZ!!");
        }
        pezCount = newAmount;
    }

    public boolean dispnese() {
        boolean wasDispensed = false;
        if (!isEmpty()) {
            pezCount--;
            wasDispensed = true;
        }
        return wasDispensed;
    }

    public boolean isEmpty(){
        return pezCount == 0;
    }
// GETTER
    public String getCharacterName() {
        return characterName;
    }

//    public String swapHead(String characterName) {
//        String originalCharacterName = this.characterName;
//        this.characterName = characterName;
//        return originalCharacterName;
//    }
}