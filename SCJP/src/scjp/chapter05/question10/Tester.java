package scjp.chapter05.question10;

/**
 * Question 5.1.10. What is the result of compiling and running the following code?
 */
public class Tester {
    int x = 12;
    
    static void reset(Tester obj) {
        obj = null;
    }
    
    public static void main(String[] args) {
        Tester o1 = new Tester();
        reset(o1);
        System.out.println(o1.x);
    }
}

/**
 * Please choose only one answer:
 * 
 * a) 0
 * b) 12
 * c) Compilation error
 * d) NullPointerException is thrown
 * e) Another type of exception is thrown
 * 
 * R: b
 */
