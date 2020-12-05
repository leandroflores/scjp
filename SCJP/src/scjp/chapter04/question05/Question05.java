package scjp.chapter04.question05;

/**
 * Question 4.1.5. Which of the statements would evaluate to true?
 */
public class Question05 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("javachamp");
        StringBuffer sb2 = new StringBuffer("javachamp");
        
        boolean stmt1 = sb1.equals(sb2); //false
        boolean stmt2 = sb1 == sb2; //false
        
        String s1 = new String("javachamp");
        String s2 = new String("javachamp");
        
        boolean stmt3 = s1.equals(s2); // true
        boolean stmt4 = s1 == s2; // false
    }
}

/**
 * Please choose only one answer:
 * 
 * a) stmt1
 * b) stmt2
 * c) stmt3
 * d) stmt4
 * 
 * R: c
 */
