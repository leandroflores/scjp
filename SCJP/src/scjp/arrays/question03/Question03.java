package scjp.arrays.question03;

/**
 * Question 3. What is true after running the following code?
 */
public class Question03 {
    public static void main(String[] args) {
        String[] entries = {"entry1", "entry2"};
        int count = 0;
        while (entries[count++] != null) {
            System.out.println(count);
        }
        System.out.println(count);
    }
}

/**
 * Please choose all the answers that apply:
 * 
 * a) An Exception will be thrown
 * b) 0 will be printed as part of the output
 * c) 2 will be printed as part of the output
 * d) 3 will be printed as part of the output
 * 
 * R: a, and c
 */