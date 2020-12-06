package scjp.wrappers.question01;

/**
 * Question 1. What is the result of compiling and running the following code?
 */
public class Tester {
    public static void main(String[] args) {
        Integer sum1 = 125; // Line 1
        int sum2 = 125; // Line 2
        
        System.out.print(sum1.equals(sum2)); // Line 3
        //System.out.print(sum2.equals(sum1)); // Line 4
        System.out.print(sum1 == sum2); // Line 5
    }
}

/**
 * Please choose only one answer:
 * 
 * a) Compilation error at Line 3
 * b) Compilation error at Line 4
 * c) truetruefalse
 * d) truetruetrue
 * 
 * R: b
 */
