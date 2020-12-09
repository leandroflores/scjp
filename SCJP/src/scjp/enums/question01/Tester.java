package scjp.enums.question01;

/**
 * Question 1. What is the result of compiling and running the following code?
 */
enum Status {
    Published(1), Rejected(2); // Line 2
    int index; // Line 3
    Status(int i) {index = i;}
    int getIndex(){return index;} // Line 5
}

public class Tester {
    public static void main(String[] args) {
        System.out.println(Status.Published.index + Status.Rejected.index); // Line 10
    }
}

/**
 * Please choose only one answer:
 * 
 * a) Compilation Error at Line 2: must be terminated by a colon ','
 * b) Compilation Error at Line 3: index must be marked static
 * c) Compilation Error at Line 5: must be marked public
 * d) Compilation Error at Line 10: can't access index directly, 
 *    must use getIndex() instead
 * e) 3
 * 
 * R: e
 */
