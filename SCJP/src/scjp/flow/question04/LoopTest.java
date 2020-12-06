package scjp.flow.question04;

/**
 * Question 4. What is the result of compiling and running the following code?
 */
public class LoopTest {
    public static void goLoop(int a) {
        outside: for (int i = 0; i < 3; i++) {
            inside: for (int j = 1; j < 3; j++) {
                System.out.print(j);
                if (a > 5) {
                    continue outside;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        LoopTest.goLoop(15);
    }
}

/**
 * Please choose only one answer:
 * 
 * a) 121212
 * b) No output is produced
 * c) Compile Error
 * d) Runtime Exception is thrown
 * e) 111
 * 
 * R: e
 */
