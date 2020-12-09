package scjp.enums.question07;

/**
 * Question 7. What is the result of running the following code?
 */
public class Coffee {
    //CoffeSize size; // Line 1
    
    public static void main(String... arg) { // Line 2
        //enum CoffeeSize{ SMALL, NORMAL, BIG; } // Line 3
        
        Coffee drink = new Coffee();
        //drink.size = CoffeeSize.BIG; // Line 4
        //System.out.println(drink.size); // Line 5
    }
}

/**
 * Please choose all the answers that apply:
 * 
 * a) big
 * b) Compile Time Error on Line 1
 * c) Compile Time Error on Line 2
 * d) Compile Time Error on Line 3
 * e) Runtime Error on Line 4
 * 
 * R: b and d
 */