package scjp.exceptions.question02;

/**
 * Question 2. What is the expected output of compiling and running this code?
 */
class Father {
    public Father() throws RuntimeException {
        System.out.print("Father");
        throw new RuntimeException();
    }
}

class Son extends Father {
    public Son() throws RuntimeException {
        System.out.println("Son");
    }
}

public class Tester {
    public static void main(String[] args) {
        new Son(); // Line 17
    }
}

/**
 * Please choose only one answer:
 * 
 * a) Compile Error, an import to java.lang.RuntimeException is required
 * b) Father will be printed then a RuntimeException would be thrown
 * c) Compile Error at Line 17, new Son() should be within a try/catch block
 * d) Son
 * e) SonFather
 * f) FatherSon
 * 
 * R: b
 */