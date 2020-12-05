package scjp.string.question02;

/**
 * Question 2. What is the expected output?
 */
public class Question02 {
    public static void main(String[] args) {
        boolean stmt1 = "champ" == "champ"; //true
        boolean stmt2 = new String("champ").equals(new String("champ")); // true
        boolean stmt3 = new String("champ").toString() == "champ"; //false
        System.out.println(stmt1 && stmt2 && stmt3);
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
