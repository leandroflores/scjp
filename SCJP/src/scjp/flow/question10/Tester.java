package scjp.flow.question10;

/**
 * Question 10. What is the result of running the following program 
 *              (which was compiled fine) given the command line:
 *              java Tester one two
 */
public class Tester {
    public static void main(String[] args) {
        if (args.length > 0)
            for (String str : args)
                System.out.print(str);
                System.out.print("--");
    }
}

/**
 * Please choose only one answer:
 * 
 * a) one--two--
 * b) onetwo
 * c) onetwo--
 * d) Tester--one--two--
 * e) Testeronetwo--
 * 
 * R: c
 */
