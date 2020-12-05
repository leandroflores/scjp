package scjp._q01;

/**
 * Q1.1.1. How to split String in Java
 * 
 * What is the result of compiling and running the following code?
 */
public class Tester {
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
 * d) Compilation error
 * 
 * R: a
 */