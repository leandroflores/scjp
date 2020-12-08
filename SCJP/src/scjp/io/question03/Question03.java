package scjp.io.question03;

import java.io.File;
import java.io.IOException;

/**
 * Question 3. Given the following code segment enclosed within a try/catch 
 *             block what valid Exception type can be catched causing no 
 *             compilation error?
 */
public class Question03 {
    public static void main(String[] args) {
        try {
            File file = new File("file.dat");
                 file.createNewFile();
        }catch (IOException e) {
        }
    }
}

/**
 * Please choose all the answers that apply:
 * 
 * a) Exception
 * b) RuntimeException
 * c) Throwable
 * d) FileNotFoundException
 * e) IOException
 * 
 * R: a, c and e
 */