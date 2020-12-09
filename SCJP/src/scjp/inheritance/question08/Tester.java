package scjp.inheritance.question08;

/**
 * Question 8. What is the result of compiling and running the following code?
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
        
        System.out.print(food instanceof Eatable);
        System.out.print(meat instanceof Food);
        //System.out.print(gum instanceof Food);
        System.out.print(gum instanceof Chewable);
    }
}

/**
 * Please choose only one answer:
 * 
 * a) truetruetrutrue
 * b) truetruefalsetrue
 * c) falsetruefalsetrue
 * d) Compilation Error
 * 
 * R: d
 */