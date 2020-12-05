package scjp.string.question11;

/**
 * Question 11. What is the result of compiling and running the following code?
 */
public class Question11 {
    public static void main(String[] args) {
        String stmt = "JavaChamp is here to help you";
        for (String token : stmt.split("//s")) {
            System.out.print(token + " ");
        }
    }
}

/**
 * Please choose only one answer:
 * 
 * a) JavaChamp is here to help you
 * b) JavaChamp i here to help you
 * c) No output is produced
 * d) Compilation Error
 * 
 * R: a
 */
