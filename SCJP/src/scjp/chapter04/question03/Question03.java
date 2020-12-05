package scjp.chapter04.question03;

/**
 * Question 4.1.3. Select the common methods, which are defined for both type String and type StringBuffer?
 * 
 * Please choose all the answers that apply:
 * a) toString()
 * b) length()
 * c) append(String)
 * d) trim()
 * e) equals(Object)
 * 
 * R: a, b and e.
 */
public class Question03 {
    public static void main(String[] args) {
        String string = "teste"; 
        StringBuffer buffer = new StringBuffer("teste");
        
        // a)
        System.out.println(string.toString());
        System.out.println(buffer.toString());
        
        // b)
        System.out.println(string.length());
        System.out.println(buffer.length());
        
        // c)
        //System.out.println(string.append(""));
        System.out.println(buffer.append(""));
        
        // d)
        System.out.println(string.trim());
        //System.out.println(buffer.trim());
        
        // e)
        System.out.println(string.equals("teste"));
        System.out.println(buffer.equals("teste"));
    }
    
}