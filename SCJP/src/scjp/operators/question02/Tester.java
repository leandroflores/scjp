package scjp.operators.question02;

/**
 * Question 2. Which of the following "if" statement(s) will throw a 
 *             NullPointerException (assuming each statement will be executed 
 *             independently)?
 */
public class Tester {
    public int code;

    public static void main(String[] args) {
        Tester val = null;
        if ((val != null) & (val.code > 0)); // Line 1
        if ((val != null) && (val.code > 0)); // Line 2
        if ((val == null) | (val.code == 0)); // Line 3
        if ((val == null) || (val.code == 0)); // Line 4
    }
}

/**
 * Please choose all the answers that apply:
 * 
 * a) Line 1
 * b) Line 2
 * c) Line 3
 * d) Line 4
 * 
 * R: a and c
 */