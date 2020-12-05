package scjp.variables.question11;

/**
 * Question 11. What is the result of compiling and running the following code?
 */
public class Tester {
    int x = 12;
    
    static Tester reset(Tester obj) {
        obj = null;
        return obj;
    }
    
    public static void main(String[] args) {
        Tester o1 = new Tester();
        o1 = reset(o1);
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
 * R: d
 */
