package scjp.formatting.question01;

/**
 * Question 1. Which of the following statements produces the output 3 + 8?
 */
class Tester {
    public static void main(String[] args) {
        int x = 8;
        int y = 3;
        
        System.out.printf("%d + %d\n", y, x); // stmt1
        System.out.printf("%f + %f\n", (float) y, (float) x); // stmt2
        System.out.printf("%d + %d\n", x, y); // stmt3
        System.out.format("%2$d + %1$d\n", x, y); // stmt4
    }
}

/**
 * Please choose all the answers that apply:
 * 
 * a) Statement 1
 * b) Statement 2
 * c) Statement 3
 * d) Statement 4
 * 
 * R: a and d
 */
