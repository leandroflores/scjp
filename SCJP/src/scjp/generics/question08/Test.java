package scjp.generics.question08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Question 8. What is the expected output of compiling and running the 
 *             following code?
 */
public class Test {
    public static void main(String[] args) {
      List<Foo> myFooList = new ArrayList<Foo>();
      myFooList.add(new Foo("C"));
      myFooList.add(new Foo("A"));
      myFooList.add(new Foo("D"));
      
      Collections.sort(myFooList);
        System.out.print(myFooList.get(0).code);
    }
}

class Foo implements Comparable<Foo> {
    String code;
    
    Foo(String c) {
        code = c;
    }
    
    public 
    int compareTo(Foo f) {
        return this.code.compareTo(f.code);
    }
}

/**
 * Please choose only one answer:
 * 
 * a) A
 * b) C
 * c) D
 * d) No Output is printed
 * e) Compilation Error
 * f) Exception thrown at run time
 * 
 * R: e
 */