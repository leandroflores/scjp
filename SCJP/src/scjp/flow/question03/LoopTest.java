package scjp.flow.question03;

/**
 * Question 3. What is the result of compiling and running the following code?
 */
public class LoopTest {
    public static void goLoop(int a) {
        /*
        start; for (int i = 1; i < 2; i++) {
            for (int j = 1; j < 2; j++) {
                if (a > 5) {
                    break start;
                }
                System.out.print(i + j);
            }
        }
        */
    }
    
    public static void main(String[] args) {
        LoopTest.goLoop(15);
    }
}

/**
 * Please choose only one answer:
 * 
 * a) 2
 * b) No output is produced
 * c) Compile Error
 * d) Runtime Exception is thrown
 * e) 24
 * 
 * R: c
 */
