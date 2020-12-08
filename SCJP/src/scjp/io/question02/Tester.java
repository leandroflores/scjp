package scjp.io.question02;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Question 2. At what line in the following program the file "data.txt" will 
 *             be created in the file system?
 */
public class Tester {
    public static void main(String[] args) {
        try {
            File file = new File("data.txt"); // Line 5
            file.createNewFile(); // Line 6
            FileWriter fr = new FileWriter(file); // Line 7
            BufferedWriter br = new BufferedWriter(fr); // Line 8
            br.append("javachamp");
            br.flush();
            br.close(); // Line 11
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/**
 * Please choose only one answer:
 * 
 * a) Line 5
 * b) Line 6
 * c) Line 7
 * d) Line 8
 * e) Line 11
 * 
 * R: b
 */