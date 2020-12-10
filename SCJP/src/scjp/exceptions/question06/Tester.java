package scjp.exceptions.question06;

/**
 * Question 6. What is the result of compiling and running the following code?
 */
public class Tester {
    public static void main(String[] args) { 
        System.out.print("1");
        try {
            System.out.print("2");
            System.exit(0);
        }finally {
            System.out.print("3");
        }
    }
}

/**
 * Please choose only one answer:
 * 
 * a) 123
 * b) 12
 * c) Compilation Error, there should be at least one catch before finally
 * 
 * R: b
 */