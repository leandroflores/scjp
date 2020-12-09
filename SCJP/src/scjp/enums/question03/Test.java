package scjp.enums.question03;

/**
 * Question 3. What is the result of compiling and running the following code?
 */
public class Test {
    enum BookStatus {
        PUBLISHED, DRAFT
    }
    
    public static void main(String[] args) {
        BookStatus s1 = BookStatus.PUBLISHED;
        BookStatus s2 = BookStatus.PUBLISHED;
        System.out.print(s1 == BookStatus.PUBLISHED);
        System.out.print(s1.equals(s2));
    }
}

/**
 * Please choose only one answer:
 * 
 * a) falsetrue
 * b) truetrue
 * c) falsefalse
 * d) Compilation Error, s1 and s2 are incorrectly instantiated
 * 
 * R: b
 */
