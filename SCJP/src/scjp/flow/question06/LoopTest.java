package scjp.flow.question06;

/**
 * Question 6. What is the result of compiling and running the following code?
 */
public class LoopTest {
    public static void main(String[] args) {
        int a = 5;
        outside: for (int i = 1; i < 3; i++) { 
            inside: for (int j = 1; j < 3; j++) {
                System.out.print(j);
                if (a++ > 6)
                    continue inside;
                break outside;
            }
        }
    }
}

/**
 * Please choose only one answer:
 * 
 * a) Compile Error
 * b) Runtime exception is thrown 
 * c) 1
 * d) 123
 * 
 * R: c
 */
