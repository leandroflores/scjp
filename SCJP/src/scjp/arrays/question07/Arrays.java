package scjp.arrays.question07;

/**
 * Question 7. Consider the following command-line invocations?
 * 
 * i. java Arrays
 * ii. java Arrays 12
 * iii. java Arrays 12 32
 * 
 */
class Arrays {
    public static void main(String[] args) {
        for (int x = 0; args.length > x++;)
            System.out.print(args[x] + " ");
    }
}

/**
 * Please choose all the answers that apply:
 * 
 * a) Only the invocation i will complete without throwing exceptions
 * b) Only Invocation i will throw an exception
 * c) Invocation ii will produce he output 12
 * d) Invocation iii will produce he output 12 32
 * e) Invocations ii and iii will throw exceptions
 * 
 * R: a, c, d and e
 */