package scjp.inheritance.question12;

/**
 * Question 12. What is the result of compiling and running the following code?
 */
class Base {
    //public Base(String n) {System.out.print("Base1");}
    public void Base(String n) {System.out.print("Base2");}
}

public class Derived extends Base {
    //public Derived() {System.out.print("Derived");}
    
    public static void main(String[] args) {
        //new Derived();
    }
}

/**
 * Please choose only one answer:
 * 
 * a) Base1Derived
 * b) Base2Derived
 * c) Derived
 * d) Compilation Error
 * 
 * R: d
 */