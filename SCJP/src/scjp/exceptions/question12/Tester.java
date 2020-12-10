package scjp.exceptions.question12;

/**
 * Question 12. What is the result of compiling and running the following code?
 */
public class Tester {
    public static void main(String[] args) { 
        String stmt = "javachamp 2009";
        String[] arr = stmt.split(" ");
        try {
            int x = Integer.parseInt(arr[1]);
            System.out.print(x);
        }finally {
            System.out.print("finally");
        }
    }
}

/**
 * Please choose only one answer:
 * 
 * a) 2009
 * b) finally
 * c) 2009finally
 * d) No output will be produced
 * e) Compilation Error
 * 
 * R: c
 */