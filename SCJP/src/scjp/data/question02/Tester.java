package scjp.data.question02;

/**
 * Question 2. What is the result of compiling and running the following code?
 */
public class Tester {
    
    static void test(float x) {
        System.out.print("float");
    }
    
    static void test(double x) {
        System.out.print("double");
    }
    
    public static void main(String[] args) {
        test((float) 99.9);
    }
}

/**
 * Please choose only one answer:
 * 
 * a) float
 * b) double
 * c) Compilation error 
 * d) Exception is thrown at run time
 * 
 * R: a
 */
