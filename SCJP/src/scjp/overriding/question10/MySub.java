package scjp.overriding.question10;

/**
 * Question 10. What will be the output:
 */
class MySuper {
    MySuper() {disp();}
    void disp() {System.out.println("superclass");}
}

public class MySub extends MySuper {
    double i = Math.ceil(8.4f);
    
    public static void main(String[] args) {
        MySuper obj = new MySub();
        obj.disp();
    }
    void disp(){System.out.println(i);}
}


/**
 * Please choose only one answer:
 * 
 * a) The program displays "superclass" followed by "9.0" as an output
 * b) The program displays "superclass" followed by "superclass" as an output
 * c) The program displays "9.0" followed by "9.0" as an output
 * d) The program displays "0.0" followed by "9.0" as an output
 * 
 * R: d
 */