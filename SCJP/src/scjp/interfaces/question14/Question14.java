package scjp.interfaces.question14;

import scjp.interfaces.question13.*;

/**
 * Question 14. Correct the following code:
 */
public class Question14 {
    public static void main(String[] args) {}
}

/**
 * Please choose all the answers that apply:
 * 
 * a) line 1 - a class(abstract or concrete) can not be empty
 * b) line 2 - interfaces must be "implemented" by non-interface classes, and 
 *             "extended" only by other interfaces
 * c) line 3 - to be a valid implementation/override, dress() must stay at least 
 *             the same as available, so it must keep the "public" access with 
 *             which was marked automatically in its interface
 * d) line 4 - is not ok as Dog is abstract so might not contain fully implemented 
 *             methods from which to create a whole object Also Bulldog has to 
 *             implement play() as the version inherited from Dog is an overload 
 *             not an override
 * e) line 5 - to be a valid override barck() may not throw any exception if the 
 *             class it overrides doesn't throw an exception Nor is it valid for 
 *             Bulldog to extend again Pet as it inherits it already from Dog
 * 
 * R: b
 */