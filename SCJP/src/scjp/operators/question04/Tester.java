package scjp.operators.question04;

/**
 * Question 4. What is the result of compiling and running the following code?
 */
public class Tester {
    public static void main(String[] args) {
        int x = 0;
        int i = 1;
        for (; i > 0; i--)
            if ((++x > 0) | (--i > 0))
                x++;
        System.out.println(x + "" + i);
    }
}

/**
 * Please choose only one answer:
 * 
 * a) Compilation Error
 * b) 21
 * c) 20
 * d) 2-1
 * 
 * R: d
 */