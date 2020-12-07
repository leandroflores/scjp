package scjp.declarations.question06;

import scjp.declarations.question04.trunk2.CurrentAccount;

/**
 * Question 06. Consider the following two classes declared and defined in two 
 *              different packages, what can be added in class B to form what 
 *              considered a correct access to class A 
 *              from main() method of class B?
 */
public class Question06 {
    public static void main(String[] args) {}
}

/**
 * Please choose all the answers that apply:
 * 
 * a) at line 1 add nothing
 *    at line 2 add : new A();
 * b) at line 1 add: import package.*;
 *    at line 2 add : new subPackage.A();
 * c) at line 1 add: import subPackage.*;
 *    at line 2 add : new A();
 * d) at line 1 add: import subPackage.A;
 *    at line 2 add : new A();
 * e) at line 1 add nothing
 *    at line 2 add : new subPackage.A();
 * 
 * R: c, d, and e
 */
