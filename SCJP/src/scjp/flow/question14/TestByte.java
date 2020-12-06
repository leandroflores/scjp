package scjp.flow.question14;

/**
 * Question 14. What will be the output of compiling and running this code:
 */
class TestByte {
    public static void main(String[] args) {
        final Integer a = 10;
        int b = 2;
        switch(b) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            //case a:
            //    System.out.println("3");
            //    break;
        }
    }
}

/**
 * Please choose only one answer:
 * 
 * a) Compile Error
 * b) Prints 2
 * c) Runtime Exception is generated
 * d) Prints 3
 * 
 * R: a
 */
