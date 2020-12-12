package scjp.generics.question02;

import java.util.ArrayList;
import java.util.List;

/**
 * Question 2. What is the result of compiling and running the following 
 *             program using JDK 1.5 or higher?
 */
interface chewable {}

class Gum implements chewable {}

public class Tester {
    public static void main(String[] args) {
        List<Gum> list1 = new ArrayList<Gum>(); 
        list1.add(new Gum());
        List list2 = list1;
        list2.add(new Integer(9));
        System.out.println(list2.size());
    }
}

/**
 * Please choose only one answer:
 * 
 * a) Compilation Error
 * b) 2 will be printed but with warnings
 * c) 2 will be printed without warnings
 * d) An exception will be thrown at runtime
 * 
 * R: b
 */