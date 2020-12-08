package scjp.collections.question01;

import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * Question 1. What is the output of compiling and running the following program?
 */
public class Tester {
    public static void main(String [] args) {
        TreeMap tree = new TreeMap();
                tree.put("aa", 1);
                tree.put("cc", 2);
                tree.put("ee", 3);
                tree.put("gg", 4);
                
        NavigableMap nvMap = tree.headMap("ee", false);
                     nvMap.put("nn", 5); // Line 16
        
        System.out.println(nvMap);
    }
}

/**
 * Please choose only one answer:
 * 
 * a) {aa=1, cc=2, ee=3}
 * b) {aa=1, cc=2, ee=3, nn=5}
 * c) Compilation Error at Line 16
 * d) Exception is thrown at Line 16
 * 
 * R: d
 */