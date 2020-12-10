package scjp.exceptions.question04;

import java.io.IOException;

/**
 * Question 4. What is the expected output of compiling and running the 
 *             following code?
 */
class AirPlane {
    public AirPlane() throws IOException, RuntimeException {
        System.out.print("AirPlane");
    }
}

//class AirJet extends AirPlane {} // Line 7

public class Tester {
    public static void main(String args[]) throws IOException { // Line 10
        //new AirPlane(); // Line 11
    }
}

/**
 * Please choose only one answer:
 * 
 * a) AirPlane
 * b) Compile Error at Line 7, AirJet must declare a constructor that throws 
 *    IOException or any of its supertypes
 * c) Compile Error at Line 10, main() must throw also RuntimeException
 * d) Compile Error at Line 11 ,new AirPlane() must be within try/catch block
 * 
 * R: b
 */