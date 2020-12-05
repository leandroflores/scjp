package scjp.string.question04;

/**
 * Question 4. Which of the statements would evaluate to true?
 */
public class Question04 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("javachamp");
        String s = new String("javachamp");
        
        boolean stmt1 = s.equals(sb); //false
        boolean stmt2 = sb.equals(s); //false
        boolean stmt3 = sb.toString() == s; //false
        boolean stmt4 = sb.toString().equals(s); //true
        boolean stmt5 = s.equals(sb.toString()); //true
    }
}

/**
 * Please choose all the answers that apply:
 * 
 * a) stmt1
 * b) stmt2
 * c) stmt3
 * d) stmt4
 * e) stmt5
 * 
 * R: d and e
 */
