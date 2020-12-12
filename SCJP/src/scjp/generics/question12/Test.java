package scjp.generics.question12;

import java.util.*;

/**
 * Question 12. How can this program be modified to make use of appropriate 
 *              generic types? (one modification for each line)
 */
public class Test {
    public static void main(String[] args) {
        List ids = new ArrayList(); // Line 1
        ids.add(123);
        ids.add(999);
        
        Map students = new HashMap(); // Line 2
        students.put("Jess", ids.get(0));
        students.put("Jimmy", ids.get(1));
        
        int x = ((Long) students.get("Jimmy")).intValue(); // Line 3
    }
}

/**
 * Please choose all the answers that apply:
 * 
 * a) Replace Line 1 with List<Integer> ids = new ArrayList<Integer>();
 * b) Replace Line 1 with List<Long> ids = new ArrayList<Long>();
 * c) Replace Line 2 with Map<Integer,String> students = new HashMap<Integer,String>();
 * d) Replace Line 2 with Map<String,Integer> students = new HashMap<String,Integer>();
 * e) Replace Line 3 with int x = students.get("Jimmy");
 * 
 * R: a, b and d
 */