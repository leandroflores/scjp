package scjp.exceptions.question09;

/**
 * Question 9. What is the result of compiling and running the following code?
 */
public class Tester {
    
    static void method() throws Exception {
        throw new Exception();
    }
    
    public static void main(String[] args) { 
        try {
            method();
        }catch (Throwable e) {
            try {
                throw new Exception();
            }catch (Exception ex) {
                System.out.print("exception");
            }finally {
                System.out.print("finally");
            }
        }
    }
}

/**
 * Please choose only one answer:
 * 
 * a) "exception" is printed
 * b) "finally" is printed
 * c) "exceptionfinally" is printed
 * d) Compilation Error
 * 
 * R: c
 */