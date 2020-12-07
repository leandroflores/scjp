package scjp.overriding.question05;

/**
 * Question 5. What is the result of compiling and running the following code?
 */
public class Tester {
    static void call(Long x, Long y) {
        System.out.print("Long x, Long y");
    }
    
    static void call(int... x) {
        System.out.print("int... x");
        
    }
    
    static void call(Number x, Number y) {
        System.out.print("Number x, Number y");
    }
    
    public static void main(String[] args) {
        int val = 3;
        call(val, val);
    }
}

/**
 * Please choose only one answer:
 * 
 * a) Long x, Long y
 * b) int... x
 * c) Number x, Number y
 * d) Compilation error
 * e) An exception is thrown at run time
 * 
 * R: c
 */