package scjp.chapter05.question13;

/**
 * Question 5.1.13. What is the output for following program?
 */
public class SomeClass {
    static int i;
    
    private static int increment(int i) {
        return ++i;
    }
    
    public SomeClass() {
        i = 1;
    }
    
    public static void main(String[] args) {
        System.out.print(i);
        System.out.print(increment(i));
        System.out.print(i);
    }
}

/**
 * Please choose only one answer:
 * 
 * a) 000
 * b) 012
 * c) 010
 * d) Compilation error
 * 
 * R: c
 */
