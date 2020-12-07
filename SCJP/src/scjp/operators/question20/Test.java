package scjp.operators.question20;

/**
 * Question 20. What is the output of compiling and running the following code?
 */
class Test {
    public static void main(String[] args) {
        Integer x = 1000;
        long y = 1000;
        Integer z = 1000;
        System.out.println(x == y);
        System.out.println(x == z);
    }
}

/**
 * Please choose only one answer:
 * 
 * a) true then false will be printed
 * b) true then true will be printed
 * c) false then true wil be printed
 * d) false then false will be printed
 * e) Compilation Error at the First Print Statement
 * f) Compilation Error at the Second Print Statement
 * 
 * R: a
 */