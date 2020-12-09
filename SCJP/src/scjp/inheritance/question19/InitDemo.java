package scjp.inheritance.question19;

/**
 * Question 19. What is the output?
 */
class A {
    A() {
        System.out.println("Hello");
    }
}
class InitDemo extends A {
    A ob = new A();
    InitDemo() {
        System.out.println("hello 1");
    }
    public static void main(String... args) {
        System.out.println("Hello 2");
        new InitDemo();
    }
}

/**
 * Please choose only one answer:
 * 
 * a) Hello 2
 *    hello 1
 *    Hello
 *    Hello
 * b) Hello 2
 *    Hello
 *    Hello
 *    hello 1
 * c) Hello 2
 *    Hello
 *    hello 1
 *    Hello
 * d) Exception is thrown at runtime
 * 
 * R: b
 */