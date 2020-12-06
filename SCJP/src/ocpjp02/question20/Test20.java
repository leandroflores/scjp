package ocpjp02.question20;

/**
 * Q20: What will be the output of the following program?
 */
class Sup1 {
    public Sup1() {
        System.out.println("Hai");
    }
    private Sup1(String str) {
        System.out.println(str);
    }
}

public class Test20 extends Sup1 {
    private Test20(String str) {
        //System.out.println(str);
        //super();
    }
    public static void main(String[] args) {
        Test20 t20 = new Test20("HI");
    }
}

/**
 * Choose the one below:
 * 
 * 1. Hai Hi Hi
 * 2. Hai Hi
 * 3. Hi Hi
 * 4. Compile Error
 * 
 * R: 4
 */