package scjp.exceptions.question11;

import java.io.File;
import java.text.DateFormat;

/**
 * Question 11. The following code contains compilation errors, what of the 
 *              following possible solutions (made together) can be done to 
 *              remove these errors, putting in mind that all necessary imports 
 *              will be added automatically?
 */
public class Tester {
    
    static void call() { // Line 3
        File file = new File("javachamp.dat"); // Line 4
        //file.createNewFile(); // Line 5
        throw new IllegalArgumentException(); // Line 6
    }
    
    public static void main(String[] args) { 
        call(); // Line 11
        DateFormat df = DateFormat.getDateInstance(); // Line 12
        //Date parse = df.parse("12.11.2009"); // Line 13
    }
}

/**
 * Please choose all the answers that apply:
 * 
 * a) Add throws IOException declaration to call() at Line 3
 * b) Add throws FileNotFoundException declaration to call() at Line 3
 * c) Add throws IllegalArgumentException declaration to call() at Line 3
 * d) Surround code from Line 11 to 13 with try { } catch (IOException e) {} 
 *    block
 * e) Surround code from Line 11 to 13 with try { } catch (Exception e) {}
 *    block
 * 
 * R: a and e
 */