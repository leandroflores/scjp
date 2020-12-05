package scjp.string.question13;

/**
 * Question 13. What is the result of compiling and running the following code?
 */
public class Tester {
    public static void main(String[] args) {
        String  s = "";
        Integer x = 5;
        StringBuffer sb = new StringBuffer();
        if (x < 15)
            s.concat("javachamp");
        else
            sb.append("javachamp");
        System.out.print(s + sb);
    }
}

/**
 * Please choose only one answer:
 * 
 * a) javachamp
 * b) javachamp javachamp
 * c) No output is produced
 * d) Compilation Error
 * 
 * R: c
 */
