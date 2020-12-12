package scjp.generics.question09;

import java.util.ArrayList;
import java.util.List;

/**
 * Question 9. What is the expected output of compiling and running the 
 *             following code?
 */
public class Test {
    public static void main(String[] args) {
        List list = new ArrayList();
        
        list.add("Hello");
        Foo f = new Foo();
        list.add(f);
        
        //f = list.get(1);
        //System.out.print(list.get(0) + "-" + f);
    }
}

class Foo {
    public String toString() {
        return "Foo";
    }
}

/**
 * Please choose only one answer:
 * 
 * a) Hello-Foo
 * b) Compilation Error
 * c) Exception at run time
 * 
 * R: b
 */