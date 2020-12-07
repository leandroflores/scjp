package scjp.overriding.question03;

/**
 * Question 3. Which statement(s), inserted independently at // insere code 
 *             here, will compile?
 */
class Creature {
    Creature getIt() {
        return this;
    }
}

class Bird extends Creature {
    // insert code here
    
}

class Falcon extends Bird {
}

public class Tester {
    public static void main(String[] args) {}
}


/**
 * Please choose only one answer:
 * 
 * a) Creature getIt() { return this;}
 * b) private Falcon getIt() { return new Falcon();}
 * c) Falcon getIt() {return this;}
 * d) public Bird getIt() {return this;}
 * e) Creature getIt(Creature c) {return this;}
 * 
 * R: a, d and e
 */