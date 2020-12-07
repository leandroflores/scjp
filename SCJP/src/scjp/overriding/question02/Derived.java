package scjp.overriding.question02;

/**
 * Question 2. What is the result of compiling and running the following code?
 */
class Base {
    public final int getNext(int i) {
        return ++i;
    }
}

public class Derived extends Base {
    //public int getNext(int i) {
    //    return i++;
    //}
    
    public static void main(String[] args) {
        int result = new Derived().getNext(3);
        System.out.print(result);
        result = new Base().getNext(3);
        System.out.print(3);
    }
}


/**
 * Please choose only one answer:
 * 
 * a) 33
 * b) 34
 * c) 44
 * d) 43
 * e) Compilation Error
 * 
 * R: e
 */