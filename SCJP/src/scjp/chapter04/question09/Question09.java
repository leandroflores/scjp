package scjp.chapter04.question09;

import java.util.regex.Pattern;

/**
 * Question 4.1.9. Which of the following methods can be invoked by an object of Pattern class?
 * 
 * Please choose all the answers that apply:
 * a) compile
 * b) matches
 * c) group
 * d) toString
 * 
 * R: a, b and d.
 */
public class Question09 {
    public static void main(String[] args) {
        Pattern.compile("");
        Pattern.matches("", "");
        //Pattern.group("");
        //new Pattern().toString();
    }
}