package scjp.declarations.question16;

/**
 * Question 16. Which of the following are NOT LEGAL Java identifiers according 
 *              to the "java language specification"?
 */
abstract class Question16 {
    public static void main(String[] args) {
        /*
        //int ; // Line 1
        int ______9_y; // Line 2
        int €a; // Line 3
        int £b_, c; // Line 4
        int this_is_a_way_too_long_name_for_an_identifier; // Line 5
        //int d3#; // Line 6
        //int -e, 7g, :h; // Line 7
        //float .f; // Line 8
        //double _$_$; // Line 9
        //int true = 10; // Line 10
        //int null = 4; // Line 11
        int foo = 3; // Line 12
        int Foo = 3; // Line 13
        //int continue = 6; // Line 14
        int Volatile = 6; // Line 15
        */
    }
    public abstract void addEvent(); // Line 16
}

/**
 * Please choose all the answers that apply:
 * a) Lines 1, 3, 4 - contain invalid characters for Java identifiers
 * b) Line 5 - is too long
 * c) Line 16 - in not a valid JavaBean identifier for a method that want to 
 *    add a listener to an event source
 * d) Lines 6 and 8 - can NOT contain "#" and "." even if assigned to a numeric 
 *    or floating point variable
 * e) Line 7 - can NOT contain the characters "-" and ":", nor can a Java 
 *    identifier start with a digit
 * f) Lines 10, 11 and 14
 * 
 * R: 
 */