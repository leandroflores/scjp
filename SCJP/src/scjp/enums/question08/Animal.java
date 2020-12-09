package scjp.enums.question08;

/**
 * Question 8. Will the following code compile?
 */
enum AnimalSound {
    WOOF, meow, BURBLE // Line 1
} // Line 2

strictfp enum Animal {
    DOG(AnimalSound.WOOF, 4), // Line 3
    //CAT(meow, 4), // Line 4
    FISH(AnimalSound.BURBLE) // Line 5
    {   public int getNrOfLegs() {
        return 1;
    }   
    }; // Line 6
    private AnimalSound sound;
    private int nrOfLegs;
    
    Animal(AnimalSound sound, int nrOfLegs) {
        this(sound);
        this.nrOfLegs = nrOfLegs;
    }

    Animal(AnimalSound sound) {
        this.sound = sound;
    }
    
    public AnimalSound getSound() {
        return sound;
    }

    public int getNrOfLegs() {
        return nrOfLegs;
    } 
};

/**
 * Please choose all the answers that apply:
 * 
 * a) No, there will be a compile-time error on line 2 because of the missing 
 *    semicolon(;) and on line 6 because of the present semicolon
 * b) There will be a compile-time error on line 3 and 5
 * c) There will be a compile-time error on line 4
 * d) There will be a run-time error on other lines
 * e) AnimalSound, like any top class, can be marked with only the "public", 
 *    "default" or "strictfp" modifiers
 * f) An enum, Animal, can NOT be marked "strictfp"
 * 
 * R: c and d
 */