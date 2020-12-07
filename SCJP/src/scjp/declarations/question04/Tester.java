package scjp.declarations.question04;

import scjp.declarations.question04.trunk1.Account;
import scjp.declarations.question04.trunk2.CurrentAccount;

/**
 * Question 04. You have three packages, trunk1,trunk2 and trunk3, What is the 
 *              expected output of compiling and running file Tester?
 */
public class Tester {
    public static void main(String[] args) {
        //Account c = new Account(); // Line 4
        CurrentAccount ca = new CurrentAccount();
    }
}

/**
 * Please choose all the answers that apply:
 * 
 * a) Account
 *    CurrentAccount
 * b) Account
 *    Account
 *    CurrentAccount
 * c) Compilation Error in package trunk1 at line 1
 * d) Compilation Error, in package trunk2 at line 2
 * e) Compilation Error, in package trunk3 at line 3
 * f) Compilation Error, in package trunk3 at line 4
 * 
 * R: d, and f
 */
