package scjp.overriding.question11;

/**
 * Question 11. What is the result of compiling and running this program ?
 *              If compiles successfully assume "java Dont" at command line
 */
class Test {
    Test() {
        System.out.println("Hello");
    }
    public void showItem() {}
}

abstract class A extends Test {
    A() {
        System.out.println("Hi everyOne");
    }
    abstract public void showItem();
}

public class Dont extends A {
    public void showItem() {}
    
    public static void main(String... args) {
        new Dont();
    }
}


/**
 * Please choose only one answer:
 * 
 * a) Compile Time Error
 * b) An Exception may be thrown
 * c) Hello
 *    Hi everyOne
 * 
 * R: c
 */