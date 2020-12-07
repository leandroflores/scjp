package scjp.operators.question16;

/**
 * Question 16. What is the result of compiling and running the following code?
 */
public class Question16 {
    public static void main(String[] args) {
        int x = 0, y = 0;
        if ((y == x++) | (x < ++y)) {
            ++y;
        }
        System.out.println(x + "" + y);
    }
}

/**
 * Please choose only one answer:
 * 
 * a) 00
 * b) 10
 * c) 11
 * d) 12
 * e) 22
 * 
 * R: d
 */