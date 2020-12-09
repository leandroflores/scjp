package scjp.inner.question08;

/**
 * Question 8. What is the right output?
 */
public class Outer {
    private int i = 5; // Line 1
    
    Outer(int i) { // Line 2
        this.i = i; // Line 3
        System.out.print(++i); // Line 4
    }
    
    class Inner {
        Inner() {
            System.out.print("," + i++); // Line 5
        }
    }
    
    public static void main(String[] args) {
        int i = 6;
        Outer.Inner in = new Outer(i).new Inner(); // Line 6
    }
}

/**
 * Please choose only one answer:
 * 
 * a) 6,6
 * b) 5,6
 * c) 7,6
 * d) 7,7
 * e) Compilation Error in Line 6
 * f) Compilation Error in Line 5 inner class can't access to private variables
 * 
 * R: c
 */