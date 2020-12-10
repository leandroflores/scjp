package scjp.exceptions.question08;

/**
 * Question 8. What is the result of compiling and running the following 
 *             program?
 */
public class Tester {
    public static void main(String[] args) { 
        try {
            throw new RuntimeException();
        }catch (RuntimeException e) {
            System.out.println("RuntimeException");
        //}catch (ArithmeticException e) {
        //    System.out.println("ArithmeticException");
        }catch (Exception e) {
            System.out.println("Exception");
        }
    }
}

/**
 * Please choose only one answer:
 * 
 * a) "RuntimeException" is printed
 * b) "Exception" is printed
 * c) "ArithmeticException" is printed
 * d) Compilation Error
 * 
 * R: d
 */