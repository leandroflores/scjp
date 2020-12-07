package scjp.overriding.question06;

/**
 * Question 6. Which, inserted independently at //insert overridden call() here, 
 *             will represent an overridden call() and compile with no error?
 */
class Base {
    void call() throws IllegalArgumentException {
        
    }
}

public class Derived extends Base {
    
    //insert overridden call() here
    
}


/**
 * Please choose all the answers that apply:
 * 
 * a) public void call() throws IllegalArgumentException {}
 * b) void call() throws IllegalArgumentException,FileNotFoundException {}
 * c) void call() throws RuntimeException {}
 * d) void call() throws IllegalArgumentException,RuntimeException { }
 * e) private void call() {}
 * 
 * R: a, c, and d
 */