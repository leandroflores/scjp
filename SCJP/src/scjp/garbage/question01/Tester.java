package scjp.garbage.question01;

/**
 * Question 1. How many objects are eligible for garbage collection after 
 *             executing line 7?
 */
class Tester {
    public static void main(String[] args) {
        Integer x = new Integer(3000);
        Integer y = new Integer(4000);
        Integer z = new Integer(5000);
        
        Object a = x;
        x = y;
        y = z;
        z = null; // Line 7
    }
}

/**
 * Please choose only one answer:
 * 
 * a) 0
 * b) 1
 * c) 2
 * d) 3
 * 
 * R: a
 */
