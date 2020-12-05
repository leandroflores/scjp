package scjp.variables.question06;

/**
 * Question 6. What is the result of compiling and running the following program?
 */
public class Tester {
    
    public static void print(Integer arg) {
        System.out.print("Integer");
    }
    
    public void print(int arg) {
        System.out.print("int");
    }
    
    public static void main(String[] args) {
        print(new Integer(3));
    }
}

/**
 * Please choose only one answer:
 * 
 * a) int
 * b) Integer
 * c) RuntimeException is thrown at run time
 * d) Compilation error
 * 
 * R: b
 */
