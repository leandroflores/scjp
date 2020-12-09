package scjp.inheritance.question17;

/**
 * Question 17. What inserted, independently at // insert code here, 
 *              will compile and run with no errors and exceptions?
 */
class Creature {
    void grow(){}
}

class Bird extends Creature {
    void fly(){}
}

class Falcon extends Bird {
    void hunt(){}
}

public class Tester {
    public static void main(String[] args) {
        Creature c1 = new Bird();
        Falcon c2 = new Falcon();
        
        // insert code here
        c1.grow();
        //c1.fly();
        ((Bird)c1).fly();
        //((Falcon)c1).hunt();
    }
}

/**
 * Please choose all the answers that apply:
 * 
 * a) c1.grow();
 * b) c1.fly();
 * c) ((Bird)c1).fly();
 * d) ((Falcon)c1).hunt();
 * 
 * R: a and c
 */