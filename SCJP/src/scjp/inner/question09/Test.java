package scjp.inner.question09;

/**
 * Question 9. What will be the result of above code?
 */
public class Test {
    public static void main(String[] args) {
        new OuterClass(); // Line 3
    }
}

class OuterClass {
    private int x = 9; // Line 5
    
    public OuterClass() {
       InnerClass inner = new InnerClass(); // Line 7
       inner.innerMethod();
    }
    
    class InnerClass {
        public void innerMethod() {
            System.out.println(x);
        }
    }
}

/**
 * Please choose only one answer:
 * 
 * a) Prints 9
 * b) Error during compilation at Line 3
 * c) Error during compilation at Line 5
 * d) Error during compilation at Line 7
 * 
 * R: a
 */