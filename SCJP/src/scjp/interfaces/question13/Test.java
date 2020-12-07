package scjp.interfaces.question13;

/**
 * Question 13. What is the correct output?
 */
public class Test implements Father, Mother { // Line 1
    
    public void go() { // Line 2
        System.out.println("Child");
    }
    
    public static void main(String[] args) {
        new Test().go(); // Line 3
    }
}

/**
 * Please choose only one answer:
 * 
 * a) Compilation Error in line 1
 * b) Compilation Error in line 2
 * c) Child
 * d) Compilation Error in line 3
 * 
 * R: c
 */