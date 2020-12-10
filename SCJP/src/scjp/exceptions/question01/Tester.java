package scjp.exceptions.question01;

import java.io.IOException;

/**
 * Question 1. What is the expected output?
 */
class Father {
    public Father() throws IOException {
        System.out.print("Father");
        throw new IOException();
    }
}

class Son extends Father {
    public Son() throws IOException {
        System.out.println("Son");
    }
}

public class Tester {
    public static void main(String[] args) {
        try {
            new Son();
        }catch(IOException e) {
            System.out.print("Inside catch");
        }
    }
}

/**
 * Please choose only one answer:
 * 
 * a) Compile Error, constructors can't throw Exceptions
 * b) FatherSon
 * c) FatherInside catch
 * d) Father, then an IOException is thrown
 * e) Son
 * f) SonInside catch
 * 
 * R: c
 */