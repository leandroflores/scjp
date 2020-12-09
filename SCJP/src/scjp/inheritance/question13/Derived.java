package scjp.inheritance.question13;

/**
 * Question 13. What is the result of compiling and running the following code?
 */
class Base {
    public Base() {System.out.print("Base");}
}

public class Derived extends Base {
    public Derived() {this("JavaChamp");System.out.print("Derived");}
    public Derived(String s) {System.out.print(s);}
    
    public static void main(String[] args) {
        new Derived();
    }
}

/**
 * Please choose only one answer:
 * 
 * a) JavaChampDerived
 * b) JavaChampBaseDerived
 * c) BaseJavaChampDerived
 * d) JavaChampDerivedBase
 * e) Compilation Error
 * 
 * R: c
 */