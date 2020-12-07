package scjp.declarations.question02;

/**
 * Question 2. What is the result of compiling and running the following code?
 */
public class Tester {
    static int x = 4;
    int y = 9;
    
    public Tester() {
        System.out.print(this.x); // Line 7
        printVariables();
    }
    
    public static void printVariables() { 
        System.out.print(x); // Line 12
        //System.out.print(y); // Line 13
    }
    
    public static void main(String... args) { // Line 16
        new Tester();
    }
}

/**
 * Please choose only one answer:
 * 
 * a) Compile Error at line 7 (static x must be only accessed inside static methods)
 * b) Compile Error at line 13 (static methods cant make reference to non-static variables )
 * c) Compile Error at line 16 (invalid argument type for method main )
 * d) 49
 * e) Compile Error at line 12 (must access x by writing Tester.x)
 * 
 * R: b
 */
