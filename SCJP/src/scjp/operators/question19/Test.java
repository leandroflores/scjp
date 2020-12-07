package scjp.operators.question19;

/**
 * Question 19. What is the output of the running the following program?
 */
public class Test {
    public static void main(String[] args) {
        A b = new B(1000);
        A c = new C(1000);
        System.out.println(b == c);
        //System.out.println(b <= c);
    }
}

class A {
    int value;
}

class B extends A {
    B(int val) {
        value = val;
    }
}

class C extends A {
    C(int val) {
        value = val;
    }
}

/**
 * Please choose only one answer:
 * 
 * a) "true" then "false" will be printed
 * b) "false" then "false" will be printed
 * c) "false" then "true" will be printed
 * d) Compilation Error at the First Print Statement
 * e) Compilation Error at the Second Print Statement
 * 
 * R: e
 */