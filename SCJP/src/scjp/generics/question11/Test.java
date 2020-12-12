package scjp.generics.question11;

import java.util.*;

/**
 * Question 11. Will the following code compile?
 */
class B {}
class C extends B {}

public class Test {
    public static <E extends B> Queue<E> ring(List<E> list) {
        return null;
    }
    
    public static void main(String[] args) {
        List<C> list1 = new ArrayList<C>();
        ArrayList<C> list2 = new ArrayList<C>();
        
        Queue<C> q1;
        PriorityQueue<C> q2;
        
        q1 = ring(list1); // Line 1
        q1 = ring(list2); // Line 2
        //q2 = ring(list1); // Line 3
        //q2 = ring(list2); // Line 4
    }
}

/**
 * Please choose all the answers that apply:
 * 
 * a) Yes, the program is free of compilation errors
 * b) No, there is a compilation error at // Line 1
 * c) No, there is a compilation error at // Line 2
 * d) No, there is a compilation error at // Line 3
 * e) No, there is a compilation error at // Line 4
 * 
 * R: d and e
 */