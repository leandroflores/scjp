package scjp.chapter04.question07;

/**
 * Question 4.1.7. What is the result of compiling and running the following code?
 */
public class Question07 {
    public static void main(String[] args) {
        StringBuffer buffer1 = new StringBuffer("javachamp");
        StringBuffer buffer2 = new StringBuffer(buffer1);
        if (buffer1.equals(buffer2))
            System.out.println("true");
        else
            System.out.println("false");
    }
}

/**
 * Please choose only one answer:
 * 
 * a) true
 * b) false
 * 
 * R: b
 */
