package scjp.interfaces.question04;

/**
 * Question 4. Will the following code compile correctly?
 */
abstract class AirPlane {
    abstract void fly();
    
    void land() { // Line 5
        System.out.print("Landing..");
    }
}

class AirJet extends AirPlane {
    
    AirJet() {
        super(); // Line 14
    }
    
    void fly() {
        System.out.print("Flying");
    }
}

/**
 * Please choose only one answer:
 * 
 * a) Yes, it will compile with no errors
 * b) No, because at line 5 method land() must be abstract since class AirPlane 
 *    is abstract
 * c) No, because class AirJet must override method land()
 * d) No, because at line 14 AirJet constructor is calling the super() while 
 *    AirPlane has no constructor defined
 * 
 * R: a
 */
