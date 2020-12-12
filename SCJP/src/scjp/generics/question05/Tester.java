package scjp.generics.question05;

import java.util.ArrayList;
import java.util.List;

/**
 * Question 5. The following code contains a compilation error, at what line?
 */
interface Chewable {}
class Meat implements Chewable {}

public class Tester {
    public static void main(String[] args) {
        List<? extends Chewable> list1 = new ArrayList<Meat>(); // Line 11
        
        List<Chewable> list2 = new ArrayList<Chewable>(); // Line 13
        
        Meat meat = new Meat();
        
        //list1.add(meat); // Line 17
        
        list2.add(meat); // Line 19
    }
}

/**
 * Please choose only one answer:
 * 
 * a) Line 11
 * b) Line 13
 * c) Line 17
 * d) Line 19
 * 
 * R: c
 */