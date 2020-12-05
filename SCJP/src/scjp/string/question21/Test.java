package scjp.string.question21;

import java.util.Collection;
import java.util.List;

/**
 * Question 21. What will be the output upon running this piece of code?
 */
class Test {
    public static void hello(Collection x) {
        System.out.println("Collection");
    }
    
    public static void main(String[] args) {
        Test t = new Testing();
        List x = null;
        t.hello(x);
    }
}

class Testing extends Test {
    public static void hello(List x) {
        System.out.println("List");
    }
}

/**
 * Please choose only one answer:
 * 
 * a) Collection
 * b) List
 * c) Compilation Error
 * 
 * R: a
 */
