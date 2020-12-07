package scjp.operators.question13;

/**
 * Question 13. What is the result of compiling and running the following code?
 */
public class Question13 {
    public static void main(String[] args) {
        int x = 1, y = 0;
        if ((y == x++) && (x < ++y)) {}
        System.out.println(x + "" + y);
    }
}

/**
 * Please choose only one answer:
 * 
 * a) 20
 * b) 21
 * c) 10
 * d) 11
 * 
 * R: a
 */