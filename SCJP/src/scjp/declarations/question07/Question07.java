package scjp.declarations.question07;

/**
 * Question 07. Given the following declarations, what is considered a correct statement?
 */
interface Chewable{}
interface Eatable extends Chewable{}
class Vitamin{}
class Food implements Eatable{ Vitamin[] vitamins;} 
public class Question07 {
    public static void main(String[] args) {}
}

/**
 * Please choose all the answers that apply:
 * 
 * a) Eatable is Chewable
 * b) Vitamin is Eatable
 * c) Food is Chewable
 * d) Food has Vitamin
 * e) Vitamin has Food
 * f) Food is an Object
 * 
 * R: a, c, and d
 */
