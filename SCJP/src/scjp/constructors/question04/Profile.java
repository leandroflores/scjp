package scjp.constructors.question04;

/**
 * Question 4. What is the expected output?
 */
public class Profile {
    
    private Profile(int w) { // Line 1
        System.out.println(w);
    }
    
    //public static Profile() { // Line 5
    //    System.out.println(10);
    //}
    
    public static void main(String[] args) {
        Profile obj = new Profile(50);
    }
}

/**
 * Please choose only one answer:
 * 
 * a) Won't compile because of line (1) – constructor can't be private
 * b) 10
 * c) 50
 * d) Won't compile because of line (5) – constructor can't be static
 * 
 * R: d
 */