package ocpjp02.question06;

/**
 * Q6: What will be the output?
 */
public class Test6 {
    public Test6() {
        //this(4);
    }
    
    public Test6(byte var) {
        System.out.println(var);
    }
    
    public static void main(String[] args) {
        Test6 t6 = new Test6();
    }
}

/**
 * Choose the one below:
 * 
 * 1. 4
 * 2. 4 4
 * 3. Compile Error
 * 4. Compiles and Runs without error
 * 
 * R: 3
 */