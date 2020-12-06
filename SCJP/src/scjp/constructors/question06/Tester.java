package scjp.constructors.question06;

import java.io.IOException;

/**
 * Question 6. What is the expected output?
 */
class AirPlane {
    public AirPlane() throws IOException {
        System.out.print("AirPlane");
        throw new IOException();
    }
}

class AirJet extends AirPlane {
    public AirJet() throws IOException {
        /*
        try {
            super();
        }catch (IOException e) {
            System.out.print("IOException is thrown in AirJet");
        }*/
    }
}

public class Tester {
    public static void main(String[] args) {
        try {
            new AirJet();
        }catch (IOException e) {
            System.out.println("IOException is thrown in Tester");
        }
    }
}

/**
 * Please choose only one answer:
 * 
 * a) "AirPlaneIOException is thrown in AirJet" will be printed
 * b) "AirPlaneIOException is thrown in AirJetIOException is thrown in Tester" will be printed
 * c) "AirPlaneIOException is thrown in Tester" will be printed
 * d) Compile Error
 * 
 * R: d
 */