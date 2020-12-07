package scjp.interfaces.question05;

/**
 * Question 5. The following code contains a compilation error , what can be 
 *             done to fix this error - independently?
 */
abstract class AirPlane { // Line 1
    abstract void fly();
    
    void land() { 
        System.out.print("Landing..");
    }
}

class AirJet extends AirPlane { // Line 10
    
    AirJet() {
        super(); // Line 13
    }
    
    void fly() {
        System.out.print("Flying");
    }
    
    //abstract void land(); // Line 20
}

/**
 * Please choose all the answers that apply:
 * 
 * a) Remove abstract from line 20 and add body to method land()
 * b) Declare class AirJet as abstract to at line 10
 * c) Remove super() call at line 13
 * d) Remove abstract at line 1 and line 2
 * 
 * R: a, and b
 */
