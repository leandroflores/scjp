package scjp.declarations.question14;

/**
 * Question 14. What is the output?
 */
class InitDemo {
    static int i = demo();
    static{System.out.println(i);}
    InitDemo() {
        System.out.println("hello 1");
    }
    public static void main(String... args) {
        System.out.println("Hello 2");
    }
    static int demo() {
        System.out.println("Inside Demo");
        return 10;
    }
}

/**
 * Please choose only one answer:
 * 
 * a) Compilation Error
 * b) IllegalArgumentException is thrown at Runtime
 * c) Inside Demo
 *    10
 *    Hello 2
 * d) Hello 2
 *    Inside Demo
 *    10
 * 
 * R: c
 */