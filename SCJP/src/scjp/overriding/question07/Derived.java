package scjp.overriding.question07;

/**
 * Question 7. What is the result of compiling and running the following code?
 */
class Base {
    public void method(final int x) {
        System.out.println("Base");
    }
}

public class Derived extends Base {
    public void method(int x) { // Line 1
        System.out.print("Derived");
    }
    
    public static void main(String[] args) {
        Base b = new Derived();
        b.method(3);
    }
}


/**
 * Please choose only one answer:
 * 
 * a) Will compile fine and wil print "Derived"
 * b) Will compile fine and wil print "Base"
 * c) Won't compile because of line 1.Can be corrected by marking x as final,
 *    then the output will be "Derived"
 * d) Won't compile because of line 1.Can be corrected by marking x as final,
 *    then the output will be "Base"
 * 
 * R: a
 */