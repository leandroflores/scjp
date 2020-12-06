package scjp.serialization.question05;

import java.io.*;

/**
 * Question 5. Which of the following is the correct output:
 */
class Class {
    {System.out.print("a1-");}
    public Class() {
        System.out.print("a-");
    }
    static {System.out.print("s1-");}
}

class SubClass extends Class implements Serializable {
    {System.out.print("b1-");}
    public SubClass() {
        System.out.print("b-");
    }
    static {System.out.print("s2-");}
}

public class TestSerializable implements Serializable {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("myFile"));
            oos.writeObject(subClass);
            ois = new ObjectInputStream( new FileInputStream ("myFile"));
            subClass = (SubClass) ois.readObject();
        }catch (Exception e) {
            System.out.print("Todo mal!");
        }
    }
}

/**
 * Please choose only one answer:
 * 
 * a) s1-s2-a1-a-b1-b-a1-a-b1-b
 * b) s1-s2-a1-a-b1-b-a1-a
 * c) s1-s2-a1-a-b1-b-
 * d) Todo mal!
 * e) ClassCastException is thrown
 * 
 * R: b
 */