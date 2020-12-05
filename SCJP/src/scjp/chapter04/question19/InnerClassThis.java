package scjp.chapter04.question19;

/**
 * Question 4.1.19. What will be the Output?
 */
public class InnerClassThis {
    int x = 10;
    public void foo() {
        System.out.println("Outer class");
    }
    
    public class ReallyInner {
        public void foo() {
            System.out.println("Inner class");
        }
        public void test() {
            this.foo();
            InnerClassThis.this.foo();
        }
    }
    
    public static void main(String... args) {
        InnerClassThis.ReallyInner i = new InnerClassThis().new ReallyInner();
        i.test();
    }
}

/**
 * Please choose only one answer:
 * 
 * a) The code does not compile
 * b) Inner class
 *    Outer class
 * c) The code compiles but throws runtime exception
 * d) Outer class
 *    Inner class
 * 
 * R: b
 */