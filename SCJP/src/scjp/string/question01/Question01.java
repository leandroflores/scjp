package scjp.string.question01;

/**
 * Question 1. What is the expected output?
 */
public class Question01 {
    public static void main(String[] args) {
        boolean stmt1 = "champ" == "champ"; //true
        boolean stmt2 = new String("champ") == "champ"; // false
        boolean stmt3 = new String("champ") == new String("champ"); //false
        System.out.println(stmt1 && stmt2 || stmt3);
    }
}

/**
 * Please choose only one answer:
 * 
 * a) true
 * b) false
 * 
 * R: b
 */
