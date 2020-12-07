package scjp.operators.question12;

/**
 * Question 12. What is the result of compiling and running the following code?
 */
public class Question12 {
    public static void main(String[] args) {
        int x = 0, y = 0;
        x = 5 + y++;
        System.out.print(x + "" + y);
        
        x = 0;
        y = 0;
        x = 5 + ++y;
        System.out.print(x + "" + y);
    }
}

/**
 * Please choose only one answer:
 * 
 * a) 6161
 * b) 671
 * c) 5161
 * 
 * R: c
 */