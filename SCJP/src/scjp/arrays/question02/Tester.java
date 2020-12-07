package scjp.arrays.question02;

/**
 * Question 2. What is the result of compiling and running the following code?
 */
public class Tester {
  
    static void test(int[] a) {
        int[] b = new int[2];
        a = b;
        System.out.print(b.length);
        System.out.print(a.length);
    }
    
    public static void main(String[] args) {
        int[] a = new int[5];
        test(a);
        System.out.println(a.length);
    }
}

/**
 * Please choose only one answer:
 * 
 * a) 225
 * b) 255
 * c) 200
 * d) 222
 * 
 * R: a
 */