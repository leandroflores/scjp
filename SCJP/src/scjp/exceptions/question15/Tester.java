package scjp.exceptions.question15;

/**
 * Question 15. What is the output of the following code?
 */
public class Tester {
    public static void main(String[] args) {
        Double d = -4.0;
        
        try {
            d /= 0;
        }catch (ArithmeticException e) {
            System.out.print("EXCEPTION!");
        }finally {
            System.out.print(d);
        }
    }
}

/**
 * Please choose only one answer:
 * 
 * a) NotANumber
 * b) NaN
 * c) EXCEPTION! -4.0
 * d) -Infinity
 * e) EXCEPTION! 0.0
 * f) Compilation Fails
 * 
 * R: d
 */