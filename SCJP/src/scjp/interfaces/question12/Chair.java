package scjp.interfaces.question12;

/**
 * Question 12. To resolve the compilation error(s) in the following code, 
 *              what can be done independently:
 */
interface Movable {
    public abstract void m1(); // Line 1
    void m2(); // Line 2
    public void m3(); // Line 3
    abstract void m4(); //Line 4
}
abstract class Chair implements Movable { // Line 5
    public void m1(){} // Line 6
    //void m2(){} // Line 7
}

/**
 * Please choose all the answers that apply:
 * a) mark class Chair "abstract"
 * b) mark Chair "abstract" and mark m2() "public"
 * c) implement m3() and m4() in Chair (with public access modifier)
 * d) implement the methods m3() and m4() in Chair (with public access modifier)
 *    and mark m2() in Chair "public"
 * 
 * R: b and d
 */