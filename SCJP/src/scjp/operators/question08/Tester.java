package scjp.operators.question08;

/**
 * Question 8. What is the result of compiling and running the following code?
 */
public class Tester {
    public static void main(String[] args) {
        boolean flag = true;
        int x = 5;
        int result = (8 * 2) % x;
        System.out.print(!(result > 0) ^ true ^ !(flag = false));
        System.out.print(flag);
    }
}

/**
 * Please choose only one answer:
 * 
 * a) truefalse
 * b) truetrue
 * c) falsefalse
 * d) falsetrue
 * e) Compilation Error
 * 
 * R: c
 */