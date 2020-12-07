package scjp.operators.question09;

/**
 * Question 9. What is the result of compiling and running the following code?
 */
public class Test {
    public static void main(String[] args) {
        Foo x = new Foo();
        Foo y = new Foo();
        Foo z = x;
        
        System.out.print(x == y);
        System.out.print(x == z);
    }
}

class Foo {}

/**
 * Please choose only one answer:
 * 
 * a) falsetrue
 * b) falsefalse
 * c) truetrue
 * d) Compilation Error
 * 
 * R: a
 */