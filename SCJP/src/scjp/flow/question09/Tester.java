package scjp.flow.question09;

/**
 * Question 9. Which of the following is correct after running this code?
 */
public class Tester {
    public static void main(String[] args) {
        char code = 'a';
        for (int i = 1; i <= 10; i++) {
            switch (i) {
                case 5: {
                    System.out.println("match");
                }
                default: {
                    System.out.println("default");
                }
            }
        }
    }
}

/**
 * Please choose all the answers that apply:
 * 
 * a) match will be printed 0 time
 * b) match will be printed one time
 * c) default will be printed 10 times
 * d) default will be printed 11 times
 * 
 * R: c
 */
