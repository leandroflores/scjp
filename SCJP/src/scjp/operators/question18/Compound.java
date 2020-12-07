package scjp.operators.question18;

/**
 * Question 18. What will be the output when we compile and execute the code below:
 */
public class Compound {
    public static void main(String[] args) {
        int k = 12;
        k /= --k;
        System.out.println(k);
        k *= k++;
        System.out.println(k);
        k *= ++k;
        System.out.println(k);
    }
}

/**
 * Please choose only one answer:
 * 
 * a) It will compile successfully and display 1 followed by 2 and then 3 as an output
 * b) It will compile successfully and display 1 followed by 1 and then 2 as an output
 * c) It will compile successfully and display 1 followed by 3 and then 4 as an output
 * d) It will generate compile time error
 * 
 * R: b
 */