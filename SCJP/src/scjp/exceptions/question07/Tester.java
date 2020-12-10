package scjp.exceptions.question07;

/**
 * Question 7. What is the result of compiling and running the following code?
 */
public class Tester {
    public static void main(String[] args) { 
        System.out.print("1");
        try {
            return;
        }catch (Exception e) {
            System.out.print("2");
        }finally {
            System.out.print("3");
        }
        System.out.print("4");
    }
}

/**
 * Please choose only one answer:
 * 
 * a) 1234
 * b) 13
 * c) 1
 * d) Compilation Error
 * 
 * R: b
 */