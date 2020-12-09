package scjp.enums.question04;

import scjp.enums.question04.pkg.Signal;

/**
 * Question 4. Find correct import statement?
 */
class Import_Enum2 {
    public static void main(String...args) {
        for (Signal ele: Signal.values())
            System.out.println(ele);
    }
    
}

/**
 * Please choose only one answer:
 * 
 * a) import pkg.*;
 * b) import pkg.Signal;
 * c) import static pkg.Signal;
 * d) static import pkg.Signal;
 * 
 * R: b
 */