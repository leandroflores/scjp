package scjp.chapter05.question09;

/**
 * Question 5.1.9. What is the result of compiling and running the following code?
 */
public class Tester {
    public static void main(String[] args) {
        if (true) {
            int x = 5;
            System.out.print(x);
        }else {
            //++x;
            //System.out.print(x);
        }
    }
}

/**
 * Please choose only one answer:
 * 
 * a) 5
 * b) 56
 * c) 6
 * d) Compilation error
 * 
 * R: d
 */
