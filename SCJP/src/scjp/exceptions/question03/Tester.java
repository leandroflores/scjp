package scjp.exceptions.question03;

import java.io.IOException;

/**
 * Question 3. What is the expected result of compiling and running the 
 *             following code?
 */
class AirPlane {
    public AirPlane() {
        System.out.print("AirPlane");
    }
}

class AirJet extends AirPlane {
    public AirJet() throws IOException {
        try {
            throw new IOException();
        }catch (IOException e) {
            System.out.print("IOException is thrown in AirJet");
        }
    }
}

public class Tester {
    public static void main(String args[]) {
        try {
            new AirJet();
        }catch (IOException e) {
            System.out.print("IOException is thrown in Tester");
        }
    }
}

/**
 * Please choose only one answer:
 * 
 * a) "AirPlaneIOException is thrown in AirJetIOException is thrown in Tester" 
 *    will be printed
 * b) "AirPlaneIOException is thrown in AirJet" will be printed
 * c) "AirPlaneIOException is thrown in Tester" will be printed
 * d) Compilation Error
 * 
 * R: b
 */