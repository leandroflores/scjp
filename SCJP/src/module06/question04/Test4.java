package module06.question04;

/**
 * Q4: What will be the output?
 */
public class Test4 {
    
    public static void method() {
        System.out.println("Called");
    }
    
    public static void main(String[] args) {
        Test4 t4 = null;
              t4.method();
    }
}

/**
 * Choose the one below:
 * 
 * 1. "Called"
 * 2. Compiler Error
 * 3. Runtime Exception
 * 4. Nothing is printed in screen
 * 
 * R: 1
 */