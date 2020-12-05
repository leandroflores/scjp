package scjp.chapter04.question15;

import java.util.Scanner;

/**
 * Question 4.1.15. What is the result of compiling and running the following code?
 */
public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner("javachamp 2009, true 239");
        while (sc.hasNext()) {
            if (sc.hasNextBoolean())
                System.out.print("Boolean");
            if (sc.hasNextInt())
                System.out.print("Int");
            sc.next();
        }
    }
}

/**
 * Please choose only one answer:
 * 
 * a) IntBooleanInt
 * b) BooleanInt
 * c) IntInt
 * d) Compilation error
 * 
 * R: b
 */
