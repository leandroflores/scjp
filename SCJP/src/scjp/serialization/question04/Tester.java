package scjp.serialization.question04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Question 4. What is the result of compiling and running the following code?
 */
public class Tester implements Serializable {
    transient int x = 5;
    
    public static void main(String[] args) {
        Tester tester1 = new Tester();
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("data.txt"));
            os.writeObject(tester1);
            os.close();
            System.out.print(++tester1.x + "");
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("data.txt"));
            Tester tester2 = (Tester) is.readObject();
            is.close();
            System.out.println(tester2.x);
        }catch (Exception x) {
            System.out.println("Exception thrown");
        }
    }
}

/**
 * Please choose only one answer:
 * 
 * a) 5 5
 * b) 6 5
 * c) 6 0
 * d) An exception is thrown
 * 
 * R: c
 */