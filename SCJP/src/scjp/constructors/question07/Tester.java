package scjp.constructors.question07;

/**
 * Question 7. The following code contains one compilation error, where could it be?
 */
public class Tester {
    Tester() {} // Line 1
    //static void Tester() { this(); } // Line 2
    public static void main(String[] args) { // Line 3
        //Tester(); // Line 4
    }
}

/**
 * Please choose only one answer:
 * 
 * a) At line 1, constructor Tester must be marked public like its class
 * b) At line 2, constructor call "this()" can only be called inside constructors
 * c) At line 3, compilation error, ambiguity problem, compiler can"t determine wether a constructor
 * d) Tester or method Tester is called
 * 
 * R: b
 */