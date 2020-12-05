package scjp.string.question10;

/**
 * Question 10. What is the result of compiling and running the following program?
 */
public class Question10 {
    public static void main(String[] args) {
        String a = "javachamp";
        String b = "javachamp";
        String c = new String("javachamp");
        
        System.out.print(a == b); //true
        System.out.print(a == c); //false
        System.out.print(b.equals(c)); //true
        System.out.print(b.equals(a)); //true
    }
}

/**
 * Please choose only one answer:
 * 
 * a) Compilation Error
 * b) falsefalsetruetrue
 * c) truetruetruetrue
 * d) truefalsetruetrue
 * 
 * R: d
 */
