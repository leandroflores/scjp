package scjp.serialization.question02;

import java.io.Serializable;

/**
 * Question 2. Given the following two classes (Address and Account), what may 
 *             happen if you attempt to serialize an instance of Account?
 */
class Address{}
class Account implements Serializable {Address address;}
public class Question02 {
    public static void main(String[] args) {}
}

/**
 * Please choose only one answer:
 * 
 * a) Compilation Error
 * b) Exception is thrown at run time
 * c) Serialization will succeed correctly with no problems
 * 
 * R: c
 */