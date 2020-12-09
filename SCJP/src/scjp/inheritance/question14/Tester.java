package scjp.inheritance.question14;

/**
 * Question 14. Which statement(s), inserted independently at 
 *              // insert code here, will compile?
 */
class Creature {
    String getName() {
        return "Creature";
    }
}

class Bird extends Creature {
    String getName() {
        return "Bird";
    }
}

class Falcon extends Bird {
    String getName() {
        return "Falcon";
    }
}

public class Tester {
    public static Bird getIt(Creature c) {
        System.out.println(c.getName());
        return (Bird) c;
    }
    
    public static void main(String[] args) {
        // insert code here
        //getIt(new Creature());
        //getIt(new Bird());
        //getIt(new Falcon());
        //getIt(new Object());
    }
}

/**
 * Please choose all the answers that apply:
 * 
 * a) getIt(new Creature());
 * b) getIt(new Bird());
 * c) getIt(new Falcon());
 * d) getIt(new Object());
 * 
 * R: a, b and c
 */