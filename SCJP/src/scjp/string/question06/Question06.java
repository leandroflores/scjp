package scjp.string.question06;

/**
 * Question 6. What is the expected output?
 */
public class Question06 {
    public static void main(String[] args) {
        String stmt = null;
        
        System.out.print(null + stmt);
        System.out.print(stmt + null);
    }
}

/**
 * Please choose only one answer:
 * 
 * a) RuntimeException is thrown because of the first print statement
 * b) RuntimeException is thrown because of the second print statement
 * c) nullnullnullnull
 * d) nullnull
 * e) Compilation Error
 * 
 * R: c
 */
