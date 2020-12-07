package scjp.arrays.question05;

/**
 * Question 5. What is the result of compiling and running the following program?
 */
public class Tester {
    final static int x[] = new int[5];
    
    public static void main(String[] args) {
        final int x = new Tester().x[5];
        
        if (x <= 10)
            System.out.println("javachamp");
    }
}

/**
 * Please choose only one answer:
 * 
 * a) Compilation Error
 * b) ArrayIndexOutOfBoundsException is thrown
 * c) javachamp
 * d) No output is produced
 * 
 * R: b
 */