package scjp.enums.question10;

/**
 * Question 10. What's the output of the following code?
 */
enum Sounds { HAM_HAM, CHIP_CHIP }

interface PlaySounds {
    void play();
}

/*
enum AnimalSound extends Sounds implements PlaySounds {
    WOOF("dog"), meow("CaT"),
    BURBLE("fish")
    {
        int nrOfLegs = 1; // line 1
    };
    public static int nrOfLegs = 4;
    private String animal;
    
    public getAnimal() {
        return animal;
    }
    AnimalSound(String animal)
    {
        this.animal = animal;
    }
    void play(){}
}

public class Test {
}

/**
 * Please choose all the answers that apply:
 * 
 * a) DOG
 *    DOG
 *    cat
 *    FIsh
 * b) Compilation Error on Line 1
 * c) Compilation Error on Line 2
 * d) Compilation Error on Line 3
 * e) Compilation Error on Line 4
 * 
 * R: b, d and e
 */