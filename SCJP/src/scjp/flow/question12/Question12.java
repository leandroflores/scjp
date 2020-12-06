package scjp.flow.question12;

/**
 * Question 12. What is the result of compiling and running the following code?
 */
public class Question12 {
    public static void main(String[] args) {
        boolean flag = false;
        int x = 0;
        do {
            x++;
        }while (flag = !flag);
        System.out.println(x);
    }
}

/**
 * Please choose only one answer:
 * 
 * a) 0
 * b) 1
 * c) 2
 * d) 3
 * e) Compile Error
 * 
 * R: c
 */
