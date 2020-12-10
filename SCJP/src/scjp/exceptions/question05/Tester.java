package scjp.exceptions.question05;

/**
 * Question 5. What is the expected output?
 */
interface Foldable {
    public void fold() throws Exception;
}

class Paper implements Foldable {
    public void fold() { // Line 6
        System.out.print("Fold");
    }
}

public class Tester {
    public static void main(String args[]) { 
        Foldable obj1 = new Paper();
        //obj1.fold(); // Line 8
        Paper obj2 = new Paper(); // Line 10
        obj2.fold();
    }
}

/**
 * Please choose only one answer:
 * 
 * a) FoldFold
 * b) Compilation Error at Line 6, fold() must declare at header throws 
 *    Exception
 * c) Compilation Error at Line 8, unhandled exception
 * d) RuntimeException at Line 8
 * e) Compilation Error at Line 10, unhandled exception
 * 
 * R: c
 */