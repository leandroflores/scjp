package scjp.chapter05.question03;

/**
 * Question 5.1.3. What is the result of compiling and running the following code?
 */
public class Tester {
    
    static {
        int x = 3;
    }
    
    static int x;
    
    public static void main(String[] args) {
        x--;
        System.out.println(x);
    }
}

/**
 * Please choose only one answer:
 * 
 * a) 3
 * b) 2
 * c) -1 
 * d) Compilation error at line 7, x is not initialized
 * 
 * R: c
 */
