package scjp.collections.question02;

import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * Question 2. What is the output of compiling and running the following program?
 */
public class Tester {
    public static void main(String [] args) {
        TreeMap tree = new TreeMap();
                tree.put("aa", 1);
                tree.put("cc", 2);
                tree.put("ee", 3);
                tree.put("gg", 4);
                
        NavigableMap nvMap = tree.headMap("ee", false);
        System.out.println(nvMap);
    }
}

/**
 * Please choose only one answer:
 * 
 * a) {aa=1, cc=2}
 * b) {aa=1, cc=2,ee=3}
 * c) {aa=1, cc=2, ee=3, gg=4}
 * d) No output is produced
 * e) Compilation Error
 * 
 * R: a
 */