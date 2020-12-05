package scjp.string.question16;

/**
 * Question 16. What is the result of compiling and running the following code?
 */
public class Tester {
    public static void main(String[] args) {
        String str = "java";
        StringBuffer sb = new StringBuffer("javachamp");
        sb.insert(9, ".com");
        str.concat("champ");
        if (sb.length() < 6 || str.equals("javachamp")) {
            System.out.print(sb);
        }
        sb.delete(2, 7);
        System.out.print(sb);
    }
}

/**
 * Please choose only one answer:
 * 
 * a) javachamp.comjamp.com
 * b) jamp
 * c) jamp.com
 * d) javachampjamp
 * e) jap
 * 
 * R: c
 */
