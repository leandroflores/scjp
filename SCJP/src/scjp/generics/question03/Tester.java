package scjp.generics.question03;

import java.util.ArrayList;
import java.util.List;

/**
 * Question 3. What is the result of compiling and running the following 
 *             program using JDK 1.5 or higher?
 */
interface chewable {}

class Gum implements chewable {}

class Meat implements chewable {}

public class Tester {
    public static void main(String[] args) {
        List list1 = new ArrayList<chewable>(); // Line 1
        list1.add(new Gum()); // Line 2
        list1.add(new Meat()); // Line 3
        list1.add(new Integer(9)); // Line 4
        System.out.println(list1.size()); // Line 5
    }
}

/**
 * Please choose only one answer:
 * 
 * a) Compilation Error at Line 1
 * b) Compilation Error at Line 4
 * c) Runtime Exception thrown at Line 1
 * d) Runtime Exception thrown at Line 4
 * e) 3
 * 
 * R: e
 */