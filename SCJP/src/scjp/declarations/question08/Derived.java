package scjp.declarations.question08;

/**
 * Question 08. What is the result of compiling and running the following code?
 */
class Base {
    //private 
        Base() {System.out.print("Base");}
}
public class Derived extends Base {
    public Derived(){System.out.print("Derived");}
    public static void main(String[] args) {
        new Derived();
    }
}

/**
 * Please choose only one answer:
 * 
 * a) BaseDerived
 * b) Derived
 * c) Exception is thrown at runtime
 * d) Compilation Error
 * 
 * R: d
 */
