package scjp.overriding.question09;

/**
 * Question 9. o/p of this program is 35. Which method executes, ;
 *            whether it is method Overloading or method Overriding?
 */
class BaseI {
    public int doSum(short a, short b) { // #1
        return (a + b);
    }
}

public class DerivedI extends BaseI {
    public int doSum(int a, short b) { // #2
        return (a + b);
    }
    
    public int doSum(short a, short b) { // #3
        return (a + b);
    }
    
    public static void main(String[] args) {
        DerivedI d = new DerivedI();
        short x = 15;
        short y = 20;
        System.out.println(d.doSum(x, y));
    }
}


/**
 * Please choose only one answer:
 * 
 * a) #1; superclass method.No overloading or overriding
 * b) #2; overriding
 * c) #2; overloading
 * d) #3; overriding
 * e) #3; overloading
 * f) None of the above
 * 
 * R: d
 */