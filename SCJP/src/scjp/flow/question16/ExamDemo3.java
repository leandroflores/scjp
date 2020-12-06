package scjp.flow.question16;

/**
 * Question 16. What is the result of running and the compiling the following code?
 */
class ExamDemo3 {
    static { new ExamDemo3(); }
    {System.out.println("Init Block");}
    ExamDemo3() {
        System.out.println("Constructor Runs");
    }
    static {System.out.println("static init 2");}
    public static void main(String... args) {
        System.out.println("Inside main method");
    }
}

/**
 * Please choose only one answer:
 * 
 * a) Compile Time Error
 * b) ExceptionIntializerError is thrown
 * c) Init Block
 *    Constructor Runs
 *    static init 2
 *    Inside main method
 *
 * R: c
 */
