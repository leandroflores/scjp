package scjp.operators.question22;

import java.util.Arrays;
import java.util.List;

/**
 * Question 22. What is the output of the following code?
 */
public class Tester {
    public static void main(String... xyz) {
        int i = 1;
        Integer[] arr = {0, 1, 2};
        int z = 0;
        
        arr[i] = z = ++i;
        List<Integer> li = Arrays.asList(arr);
        System.out.println(li + "#" + z);
    }
}


/**
 * Please choose only one answer:
 * 
 * a) [0, 2, 2]#2
 * b) [0, 1, 2]#2
 * c) [0, 1, 2]#1
 * d) [0, 2, 2]#1
 * e) [0, 1, 2]#2
 * f) Compilation Fails
 * 
 * R: a
 */