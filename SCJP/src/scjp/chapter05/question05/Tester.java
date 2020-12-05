package scjp.chapter05.question05;

/**
 * Question 5.1.5. What is the result of compiling and running the following program?
 */
public class Tester {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;
        while (++x < 5) y++;
        System.out.println(y);
    }
}

/**
 * Please choose only one answer:
 * 
 * a) 0
 * b) 3
 * c) 4 
 * d) Compilation error
 * 
 * R: b
 */
