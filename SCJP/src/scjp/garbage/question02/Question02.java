package scjp.garbage.question02;

/**
 * Question 2. What can be inserted at // insert code here, to make object 
 *             created at line 5 eligible for garbage collection?
 */
class Question02 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[3];
        arr[0] = new Integer("3"); // Line 5
        Integer x = arr[0];
        
        // insert code here
    }
}

/**
 * Please choose only one answer:
 * 
 * a) arr[0] = null;
 * b) x = null;
 * c) arr = null; x = new Integer(450);
 * d) All of the above
 * 
 * R: c
 */
