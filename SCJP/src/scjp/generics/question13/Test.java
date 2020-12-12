package scjp.generics.question13;

import java.util.*;

/**
 * Question 13. Given the following incomplete program, based on the given put 
 *              statements in map, what is considered a correct declaration and 
 *              instantiation for map?
 */
public class Test {
    public static void main(String[] args) {
        // insert code here
        //Map<List<Integer>,? extends Number> map = new HashMap<List<Integer>,Number>();
        //Map<List<Integer>,Number> map = new HashMap<List<Integer>,Integer>();
        Map<List<Integer>, Number> map = new HashMap<List<Integer>, Number>();
        
        map.put(new ArrayList<Integer>(), 1);
        map.put(new ArrayList<Integer>(), 12);
        map.put(new LinkedList<Integer>(), new Integer(1));
        map.put(new LinkedList<Integer>(), new Long(1));
    }
}

/**
 * Please choose only one answer:
 * 
 * a) Map<List<Integer>,? extends Number> map = new HashMap<List<Integer>,Number>();
 * b) Map<List<Integer>,Number> map = new HashMap<List<Integer>,Integer>();
 * c) Map<List<Integer>, Number> map = new HashMap<List<Integer>, Number>();
 * d) Map<List<Integer>,Integer> map = new HashMap<List<Integer>,Integer>();
 * e) Map<ArrayList<Integer>,Integer> map = new HashMap<ArrayList<Integer>,Integer>();
 * f) Map<List<Integer>,Long> map = new HashMap<List<Integer>,Long>();
 * 
 * R: c
 */