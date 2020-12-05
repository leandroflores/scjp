package scjp.chapter04.question08;

/**
 * Question 4.1.8. What is the result of compiling and running the following code?
 */
public class Question08 {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = null;
        
        if (s1 == s2)
            System.out.print("A");
        
        if (s1.equals(s2))
            System.out.print("B");
    }
}

/**
 * Please choose only one answer:
 * 
 * a) "AB" will be printed
 * b) "A" will be printed followed be a NullPointerException thrown
 * c) "B" will be printed
 * d) No output is produced
 * 
 * R: b
 */
