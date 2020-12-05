package scjp.string.question17;

/**
 * Question 17. What is the correct answer?
 */
public class Test {
    public void method(StringBuffer sb) {
        System.out.println("StringBuffer method");
    }
    public void method(String s) {
        System.out.println("String method");
    }
    public static void main(String[] args) {
        Test test = new Test();
        //test.method(null);
    }
}

/**
 * Please choose only one answer:
 * 
 * a) Stringbuffer method
 * b) String method
 * c) null
 * d) Compilation Error
 * e) Runtime Exception
 * 
 * R: d
 */
