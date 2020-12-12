package scjp.generics.question01;

import java.util.ArrayList;
import java.util.List;

/**
 * Question 1. What is the result of compiling and running the following 
 *             program?
 */
public class Tester {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>(); // Line 1
        //List<Object> list2 = list1; // Line 2
        //list2.add(new Integer(12)); // Line 3
        //System.out.println(list2.size()); // Line 4
    }
}

/**
 * Please choose only one answer:
 * 
 * a) Compilation Error at Line 1, must initialize the size
 * b) Compilation Error at Line 2, Type mismatch, cannot convert from 
 *    List String to List Object 
 * c) Compilation Error at Line 3, can add objects of type String only
 * d) 1
 * 
 * R: b
 */