package scjp.inheritance.question04;

/**
 * Question 4. What is the result of compiling and running the following code?
 */
interface Colorable{}
interface Bouncable extends Colorable{}
class Super implements Bouncable{}
class Sub extends Super implements Bouncable{}
class Individual{}
        
public class Tester {
    public static void main(String[] args) {
        System.out.println(new Sub() instanceof Super); 
        System.out.println(new Sub() instanceof Colorable); 
        System.out.println(new Super() instanceof Sub); 
        //System.out.println(new Individual() instanceof Super);
    }
}

/**
 * Please choose only one answer:
 * 
 * a) truetruefalsefalse
 * b) truefalsefalsefalse
 * c) Compilation Error
 * d) RuntimeException because of the print statement
 * 
 * R: c
 */