package ocpjp02.question24;

/**
 * Q24 : String s1 = new String("hi");
 * 
 */
public class Test24 {
    public static void main(String[] args) {
        String s1 = new String("hi");
        String s2 = "hi";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    } 
}

/**
 * Choose the one below:
 * 
 * 1. false true
 * 2. true false
 * 3. true true
 * 4. None of the above
 * 
 * R: 1
 */