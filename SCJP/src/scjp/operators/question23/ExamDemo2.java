package scjp.operators.question23;

import java.util.Arrays;
import java.util.List;

/**
 * Question 23. What is the result of compiling and running the following program?
 */
public class ExamDemo2 {
    public static void main(String[] args) {
        byte b = 10;
        b += 10;
        System.out.println(b);
    }
}


/**
 * Please choose only one answer:
 * 
 * a) Compilation Fails due to possible loss of precision
 * b) 20
 * 
 * R: b
 */