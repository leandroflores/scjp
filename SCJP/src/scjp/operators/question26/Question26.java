package scjp.operators.question26;

/**
 * Question 26. (SCJP6) What is printed from:
 */
public class Question26 {
    public static void main(String[] args) {
        byte b = 10;
        //b += (b < 127) ? b > -128 ? b += 10 : 0 : "5";
        System.out.println(b);
    }
}


/**
 * Please choose only one answer:
 * 
 * a) 20
 * b) 30
 * c) Compilation fails because "b > -128" is not surrounded by parenthesis
 * d) Compilation fails because a String("5") can not be assigned to a "byte"
 * e) An exception is thrown at runtime
 * 
 * R: d
 */