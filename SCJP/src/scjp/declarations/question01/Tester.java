package scjp.declarations.question01;

/**
 * Question 1. What is the result of compiling and running the following code?
 */
public class Tester {
    static int x = 4;
    
    public Tester() {
        System.out.print(this.x); // Line 4
        Tester();
    }
    
    public static void Tester() { // Line 8
        //System.out.print(this.x); // Line 9
    }
    
    public static void main(String... args) { // Line 12
        new Tester();
    }
}

/**
 * Please choose only one answer:
 * 
 * a) Compile Error at line 4 (static x must be only accessed inside static methods)
 * b) Compile Error at line 8 (constructors can't be static )
 * c) Compile Error at Line 9 (static methods can't invoke this )
 * d) Compile Error at line 12 (invalid argument type for method main )
 * e) 44
 * 
 * R: c
 */
