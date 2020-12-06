package scjp.operators.question01;

/**
 * Question 1. What is the result of compiling and running the following code?
 */
public class Tester {
    static int i;
    
    private static int increment(int i) {
        return i++;
    }
    
    public Tester() {
        i = 1;
    }
    
    public static void main(String[] args) {
        System.out.print(i);
        System.out.print(i = increment(i));
    }
}

/**
 * Please choose only one answer:
 * 
 * a) 01
 * b) 00
 * c) 12
 * d) Compilation Error
 * 
 * R: b
 */