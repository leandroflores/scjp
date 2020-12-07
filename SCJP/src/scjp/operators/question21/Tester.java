package scjp.operators.question21;

import java.util.Arrays;
import java.util.List;

/**
 * Question 21. What is the output of the following code?
 */
public class Tester {
    public static void main(String[] args) {
        int i = 1;
        int[] arr = {0, 1, 2};
        int z = 0;
        
        arr[i] = z = ++i;
        //List<Integer> li = Arrays.asList(arr);
        //System.out.println(li + "#" + z);
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
 * R: f
 */