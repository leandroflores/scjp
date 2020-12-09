package scjp.inner.question05;

/**
 * Question 5. Are the Lines 1 and 2 correct and free of compilation errors?
 */
public class AirPlane {
    public void fly(int speed) {
        final int e = 1;
        
        class FlyingEquation {
            {
            System.out.println(e); // Line 1
            System.out.println(speed); // Line 2
            }
        }
    }
}

/**
 * Please choose only one answer:
 * 
 * a) Both statements at Lines 1 and 2 are correct
 * b) Both statements at Lines 1 and 2 are incorrect and cause compilation 
 *    errors
 * c) Compilation Error at Line 1, inner class can't access outer class local 
 *    variables
 * d) Compilation Error at Line 2, inner class can't access method's arguments
 * 
 * R: a
 */