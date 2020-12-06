package scjp.wrappers.question03;

/**
 * Question 3. Given that Long and Integer extend Number, what is the result of 
 *             compiling and running the following code?
 */
public class Tester {
    
    public static void main(String[] args) {
        Number x = 12; // Line 5
        Number y = (Long) x; // Line 6
        System.out.print(x + "" + y); // Line 7
    }
}

/**
 * Please choose only one answer:
 * 
 * a) 1212
 * b) Compilation error at line 5
 * c) Compilation error at line 6
 * d) Compilation error at line 7
 * e) An exception is thrown at run time
 * 
 * R: e
 */
