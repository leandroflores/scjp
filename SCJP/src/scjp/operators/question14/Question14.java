package scjp.operators.question14;

/**
 * Question 14. What is the result of compiling and running the following code?
 */
public class Question14 {
    public static void main(String[] args) {
        int x = 1, y = 0;
        if ((y == x++) || (x < ++y)) {}
        System.out.println(x + "" + y);
    }
}

/**
 * Please choose only one answer:
 * 
 * a) 10
 * b) 11
 * c) 20
 * d) 21
 * 
 * R: d
 */