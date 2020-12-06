package scjp.static_.question01;

/**
 * Question 1. What is the result of compiling and running the following code?
 */
class Bird {
    
    static {
        System.out.print("static1 ");
    }
    
    {
        System.out.print("init3 ");
    }
    
    public Bird() {
        System.out.print("Bird ");
    }
    
    static {
        System.out.print("static2 ");
    }
}

public class Falcon extends Bird {
    Falcon() {
        System.out.print("Falcon ");
    }
    
    public static void main(String[] args) {
        System.out.print("main ");
        new Falcon();
    }
}

/**
 * Please choose only one answer:
 * 
 * a) main static1 static2 init3 Bird Falcon
 * b) main static1 static2 Falcon init3 Bird
 * c) main static1 static2 Falcon Bird init3
 * d) static1 static2 main init3 Bird Falcon 
 * e) static1 static2 main Bird init3 Falcon 
 * 
 * R: d
 */