package scjp.interfaces.question02;

/**
 * Question 2. Is the following declaration for interface Bendable correct and 
 *             free of compilation error?
 */
abstract interface Bendable { // Line 1
    
    final int x = 2009; // Line 3
    
    void method1(); // Line 5
}

/**
 * Please choose only one answer:
 * 
 * a) Yes, this is a correct and free of error declaration
 * b) No, compilation error at line 1, Bendable should be declared public abstract
 * c) No, compilation error at line 3 , x should be declared public final
 * d) No, compilation error at line 5 , method method1() should be declared public abstract
 *
 * R: a
 */
