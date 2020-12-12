package scjp.generics.question10;

import java.util.ArrayList;
import java.util.List;

/**
 * Question 10. Considering that all needed imports are there, what, inserted 
 *              independently at Line 1, will compile?
 */
class A {}
class B extends A {}
class C extends B {}

public class Test {
    public List<? extends B> ring() {
        // Line 1
        //return new ArrayList<B>();
        //return new ArrayList<C>();
        //return new ArrayList<A>();
        //return new ArrayList<? extends B>();
        //return new LinkedList<B>();
        //return new PriorityQueue<B>();
        return new ArrayList();
    }
}

/**
 * Please choose all the answers that apply:
 * 
 * a) return new ArrayList<B>();
 * b) return new ArrayList<C>();
 * c) return new ArrayList<A>();
 * d) return new ArrayList<? extends B>();
 * e) return new LinkedList<B>();
 * f) return new PriorityQueue<B>();
 * g) return new ArrayList();
 * 
 * R: a, b, e and g
 */