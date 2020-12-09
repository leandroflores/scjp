package scjp.inheritance.question11;

/**
 * Question 11. What is the result of compiling and running the following code?
 */
class Base {
    public void Base() {System.out.print("Base");}
}

public class Derived extends Base {
    public Derived() {System.out.print("Derived");}
    
    public static void main(String[] args) {
        new Derived();
    }
}

/**
 * Please choose only one answer:
 * 
 * a) BaseDerived
 * b) DerivedBase
 * c) Derived
 * d) Base
 * e) Compilation Error
 * 
 * R: c
 */