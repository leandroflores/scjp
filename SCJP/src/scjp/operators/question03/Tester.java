package scjp.operators.question03;

/**
 * Question 3. What is the result of compiling and running the following code?
 */
public class Tester {
    static boolean isEven(int x) {
        return (x % 2 == 0) ? true : false;
    }

    public static void main(String[] args) {
        System.out.print(isEven(2));
        System.out.print(isEven(3));
        System.out.print(isEven(4));
    }
}

/**
 * Please choose only one answer:
 * 
 * a) truefalsetrue
 * b) falsefalsetrue
 * c) falsefalsefalse
 * d) Compilation Error
 * e) Exception is thrown at run time
 * 
 * R: a
 */