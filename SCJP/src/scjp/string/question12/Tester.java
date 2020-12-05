package scjp.string.question12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Question 12. Given the following code, what is the expected output?
 */
public class Tester {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[a-f]\\d+");
        Matcher m = p.matcher("ab34ef0");
        while (m.find()) {
            System.out.print(m.start() + " " + m.group());
        }
    }
}

/**
 * Please choose only one answer:
 * 
 * a) 0 ab345 f0
 * b) 0 ab344 ef0
 * c) 1 b35 f0
 * d) 1 b345 f0
 * 
 * R: d
 */
