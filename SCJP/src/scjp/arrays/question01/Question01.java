package scjp.arrays.question01;

/**
 * Question 1. What is the result of compiling and running the following code?
 */
public class Question01 {
    public static void main(String[] args) {
        int[] a = new int[0];
        System.out.print(a.length);
    }
}

/**
 * Please choose only one answer:
 * 
 * a) 0
 * b) Compilation Error, arrays cannot be initialized to zero size
 * c) Compilation Error, it is a.length() not a.length
 * 
 * R: a
 */