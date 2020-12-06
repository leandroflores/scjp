package ocpjp02.question17;

/**
 * Q17: What will be the output of the following program?
 */
class Sup {
    public Sup(String str) {
        System.out.println("Super class");
    }
}

/*
public class Test17 extends Sup{
    public Test17() {
        System.out.println("Sub class");
    }
    public static void main(String[] args) {
        Test17 t17 = new Test17();
    }
}*/

/**
 * Choose the one below:
 * 
 * 1. Super class SubClass
 * 2. Super class
 * 3. Sub class
 * 4. Compile Error
 * 
 * R: 4
 */