package scjp.inheritance.question09;

/**
 * Question 9. What is the result of compiling and running the following code?
 */
interface Chewable{}
interface Eatable extends Chewable{}
class Food implements Chewable{}
class Meat extends Food{}
class Gum implements Chewable{}

public class Tester {
    public static void main(String[] args) {
        Food food = new Food();
        Meat meat = new Meat();
        Gum  gum  = new Gum();
        
        System.out.print(food instanceof Chewable); // true
        System.out.print(meat instanceof Eatable); // false
        System.out.print(gum  instanceof Eatable); // false
        System.out.print(gum  instanceof Chewable); // true
    }
}

/**
 * Please choose only one answer:
 * 
 * a) falsetruefalsetrue
 * b) truefalsefalsetrue
 * c) truetruetruetrue
 * d) Compilation Error
 * 
 * R: b
 */