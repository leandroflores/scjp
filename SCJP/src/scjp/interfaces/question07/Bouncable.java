package scjp.interfaces.question07;

/**
 * Question 7. Which of the following variables is incorrectly declared?
 */
abstract interface Bouncable { 
    int a = 0;
    public int b = 1;
    public static int c = 2;
    //public static transient int d = 3;
    public final int e = 3;
    public static final int f = 3;
}

/**
 * Please choose only one answer:
 * 
 * a) a
 * b) b
 * c) c
 * d) d
 * e) e
 * f) f
 * 
 * R: d
 */
