package scjp.interfaces.question01;

/**
 * Question 1. Is the following declaration for interface Bendable correct and 
 *             free of compilation error?
 */
abstract interface Bendable { // Line 1
    
    final int x = 2009; // Line 3
    
    void method1(); // Line 5
    public static class Angle{} // Line 6
}

/**
 * Please choose only one answer:
 * 
 * a) Yes, this is a correct and free of error declaration
 * b) No, compilation error at line 1 , abstract should be removed
 * c) No, compilation error at line 3 , x should be declared public final
 * d) No, compilation error at line 5 , method method1() should be declared public abstract
 * e) No, compilation error at line 6 , can't declare a class inside an interface
 *
 * R: a
 */
