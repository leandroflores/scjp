package scjp.generics.question06;

import java.util.ArrayList;
import java.util.List;

/**
 * Question 5. The following program contains two compilation errors, 
 *             at what lines?
 */
interface Chewable {}
class Meat implements Chewable {}

public class Tester {
    public static List<? extends Chewable> printSize(List<? extends Chewable> list) { //Line 10
        System.out.println(list.size());
        return list;
    }
    
    public static void main(String[] args) {
        List<? extends Chewable> list1 = new ArrayList<Meat>(); // Line 16
        List<Chewable> list2 = new ArrayList<Chewable>(); // Line 17
        List<Meat> list3 = new ArrayList<Meat>(); // Line 18
        
        list1 = printSize(list1); // Line 20
        //list2 = printSize(list2); // Line 21
        //list3 = printSize(list3); // Line 22
    }
}

/**
 * Please choose all the answers that apply:
 * 
 * a) Line 10
 * b) Line 16
 * c) Line 17
 * d) Line 18
 * e) Line 20
 * f) Line 21
 * g) Line 22
 * 
 * R: f and g
 */