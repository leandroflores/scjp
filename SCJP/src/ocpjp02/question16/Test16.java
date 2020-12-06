package ocpjp02.question16;

/**
 * Q16: What will be the output of the following program?
 */
public class Test16 {
    static {
        System.out.println("Static");
    }
    {
        System.out.println("Instance");
    }
    public void Test16() {
        System.out.println("Constructor");
    }
    public static void main(String[] args) {
        Test16 t = null;
    }
}

/**
 * Choose the one below:
 * 
 * 1. Instance Static
 * 2. Static Instance
 * 3. Static
 * 4. Static Instance Constructor
 * 
 * R: 3
 */