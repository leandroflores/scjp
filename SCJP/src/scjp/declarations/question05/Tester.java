package scjp.declarations.question05;

/**
 * Question 05. What is the result of compiling and running the following code?
 */
public class Tester {
    static int p = test(); // Line 1
    
    static public int test() {
        System.out.print(p); // Line 4
        return 99;
    }
    
    public static void main(String[] args) {
        System.out.print(p); // Line 11
    }
}

/**
 * Please choose only one answer:
 * 
 * a) 099
 * b) Compilation Error at line 1, p must be initialized by a value
 * c) Compilation Error at line 4, using uninitialized variable p
 * d) Compilation Error at line 11, p must be called using its class by writing Tester.p
 * 
 * R: a
 */
