package ocpjp02.question05;

/**
 * Q5: What will be the output?
 */
public class Test5 {
    
    public void Test5() {
        System.out.println("Constructor1");
    }
    
    public Test5() {
        System.out.println("Constructor2");
    }
    
    public static void main(String[] args) {
        Test5 t5 = new Test5();
    }
}

/**
 * Choose the one below:
 * 
 * 1. "Constructor1"
 * 2. "Constructor2"
 * 3. "Constructor1Constructor2"
 * 4. Compile Error
 * 
 * R: 2
 */