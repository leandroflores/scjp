package scjp.operators.question05;

/**
 * Question 5. What is the result of compiling and running the following code?
 */
public class Tester {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        if ((true & false) | (true & false) & x++ > 0)
            System.out.print("stmt1 ");
        if (false || true | (++y > 0 | y++ > 0))
            System.out.print("stmt2 ");
        System.out.print(x + "" + y);
    }
}

/**
 * Please choose only one answer:
 * 
 * a) stmt1 stmt2 1 2
 * b) stmt1 stmt2 0 0
 * c) stmt2 1 2
 * d) stmt2 0 2
 * e) 0 0
 * 
 * R: c
 */