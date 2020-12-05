package scjp.variables.question12;

/**
 * Question 12. What is the result of compiling and running the following code?
 */
public class Tester {
    final short s = 12; // Line 3
    
    static void swap(Tester obj) {
        //obj.s = 11; // Line 6
    }
    
    public static void main(String[] args) {
        final Tester obj1 = new Tester();
        swap(obj1);
        System.out.print(obj1.s); // Line 12
    }
}

/**
 * Please choose only one answer:
 * 
 * a) 11
 * b) 12
 * c) Compilation error at Line 3
 * d) Compilation error at Line 6
 * e) Compilation error at Line 12
 * 
 * R: d
 */
