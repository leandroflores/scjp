package scjp.arrays.question08;

/**
 * Question 8. What is the result?
 */
public class Question08 {
    public static void main(String[] args) {
        Object obj = new int[] { 1, 2, 3}; // Line 12
        int[] someArray = (int[]) obj; // Line 13
        for (int i : someArray) System.out.print(i + " "); // Line 14
    }
}

/**
 * Please choose only one answer:
 * 
 * a) 1 2 3
 * b) Compilation fails because of an error in Line 12
 * c) Compilation fails because of an error in Line 13
 * d) Compilation fails because of an error in Line 14
 * e) A ClassCastException is thrown at runtime
 * 
 * R: a
 */