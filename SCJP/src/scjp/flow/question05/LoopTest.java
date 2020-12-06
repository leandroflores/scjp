package scjp.flow.question05;

/**
 * Question 5. What is the result of compiling and running the following code?
 */
public class LoopTest {
    public static void main(String[] args) {
        int a = 15;
        outside: for (int i = 0; i < 3; i++) { // Line 4
            inside: System.out.print(i); // Line 5
            for (int j = 1; j < 3; j++) {
                if (a > 5)
                    //continue inside; // Line 8
                break outside; // Line 9
            }
        }
    }
}

/**
 * Please choose only one answer:
 * 
 * a) Compile Error at Line 5
 * b) Runtime exception is thrown at Line 5
 * c) Compile Error at Line 8
 * d) Runtime exception is thrown at Line 8
 * e) No output is produced
 * f) Compile Error at Line 4
 * g) Compile Error at Line 9
 * h) Runtime exception is thrown at Line 9
 * 
 * R: c
 */
