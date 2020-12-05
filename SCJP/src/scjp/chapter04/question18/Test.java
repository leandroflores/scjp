package scjp.chapter04.question18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Question 4.1.18. What is the correct answer?
 */
class Test {
    public static void main(String[] args) {
        String  jc = "javachamp_champ2012champ";
        Pattern p = Pattern.compile(".{4}c+(m)*"); //line 1
        Matcher m = p.matcher(jc);
        while (m.find()) {
            System.out.print(m.start());
        }
    }
}

/**
 * Please choose only one answer:
 * 
 * a) javacamp_c2012c
 * b) javachamp_champ2012cham
 * c) Compilation Error in Line 1
 * d) 0615
 * e) Runtime Exception due Line 1
 * 
 * R: d
 */
