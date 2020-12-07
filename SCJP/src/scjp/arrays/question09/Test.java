package scjp.arrays.question09;

/**
 * Question 9. What is the result of running the following code with 
 *             "java Test debug":
 */
class Test {
    public static void main(String [] args) {
        if (args.length == 1 | args[1].equals("debug")) {
            System.out.println(args[0]);
        }else {
            System.out.println("Release");
        }
    }
}

/**
 * Please choose only one answer:
 * 
 * a) Debug
 * b) Release
 * c) Compilation Fails
 * d) An Exception is thrown at Runtime
 * 
 * R: d
 */