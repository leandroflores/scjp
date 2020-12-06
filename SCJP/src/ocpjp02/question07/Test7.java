package ocpjp02.question07;

/**
 * Q7: What will be the output?
 */
public class Test7 {
    public Test7() {}
    public Test7(Test7 ref) {
        this(ref, "Hai");
    }
    public Test7(Test7 ref, String str) {
        ref.Test7(str);
        System.out.print("Hi");
    }
    public void Test7(String str) {
        System.out.print(str);
    }
    public static void main(String[] args) {
        Test7 t  = new Test7();
        Test7 t7 = new Test7(t);
    }
}

/**
 * Choose the one below:
 * 
 * 1. "Hi"
 * 2. "Hai"
 * 3. "HaiHi"
 * 4. "HiHai"
 * 
 * R: 3
 */