package scjp.flow.question08;

/**
 * Question 8. What is the result of compiling and running the following code?
 */
public class Tester {
    public static void main(String[] args) {
        do {
            System.out.print("inside do");
        }while (false);
        
        //while (false) {
        //    System.out.print("inside while");
        //}
        System.out.print("outside");
    }
}

/**
 * Please choose only one answer:
 * 
 * a) inside dooutside
 * b) outside
 * c) Compilation error because of the second loop (while statement)
 * 
 * R: c
 */
