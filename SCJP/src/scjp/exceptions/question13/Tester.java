package scjp.exceptions.question13;

/**
 * Question 13. What is the result of compiling and running the following code?
 */
public class Tester {
    public static void main(String[] args) { 
        String stmt = "javachamp 2009";
        String[] arr = stmt.split(" ");
        try {
            int x = Integer.parseInt(arr[0]);
            System.out.print(x);
        }catch (Exception e) {
            System.out.print("catch");
        }finally {
            System.out.print("finally");
        }
    }
}

/**
 * Please choose only one answer:
 * 
 * a) 2009
 * b) 2009finally
 * c) catchfinally
 * d) No output will be produced
 * e) Compilation Error
 * f) 2009catchfinally
 * 
 * R: c
 */