package ocpjp01.question07;

/**
 * Q7: Consider the code
 */
public class YearPrinter {
    public static void main(String[] args) {
        new YearPrinter().printIt();
    }
    private void printIt() {
        int year = 2013;
        System.out.println("This year is: " + year);
    }
}

/**
 * Which one of the following is correct after the above is compiled and run:
 * 
 * a) There is a compile time error
 * b) The program prints 'This year is: 2013'
 * c) There is a runtime error
 * 
 * R: b
 */