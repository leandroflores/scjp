package scjp.flow.question07;

/**
 * Question 7. What is the result of compiling and running the following code?
 */
public class Question07 {
    public static void main(String[] args) {
        int j = 10;
        switch(1) {
            case 20:
                j += 1;
            case 40:
                j += 2;
            default:
                j += 3;
            case 0:
                j += 4;
        }
        System.out.print(j);
    }
}

/**
 * Please choose only one answer:
 * 
 * a) Compile error, can't use constant 1 in the switch, must be final variable
 * b) Compile error, default must be the last statement after all the cases
 * c) Compile error, must have break statement within each case
 * d) 17
 * e) 13
 * 
 * R: d
 */
