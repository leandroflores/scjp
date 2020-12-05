package scjp.chapter01.question01;

/**
 * Question 1.1.1. What is the result of compiling and running the following code?
 */
public class Tester {
    
    static void test(float x) {
        System.out.print("float");
    }
    
    static void test(double x) {
        System.out.print("double");
    }
    
    public static void main(String[] args) {
        test(99.9);
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
 * R: b
 */
