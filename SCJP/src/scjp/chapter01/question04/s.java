package scjp.chapter01.question04;

/**
 * Question 1.1.4. which of the followings are correct when tried to compile and execute the below code?
 */
class s {
    
    public static void main(String agr[]) {
        short s1 = 4; // Line 1
        short s2 = s1 += s1; // Line 2
        //short s3 = s1 + s2; // Line 3
        //byte b1 = (byte) s1 + (byte) s2; // Line 4
        byte b2 = (byte) ((byte) s1 + (byte) (byte) s2); // Line 5
    }
}

/**
 * Please choose all the answers that apply:
 * 
 * a) Compile Time error at Line 1
 * b) Compile Time error at Line 2
 * c) Compile Time error at Line 3
 * d) Compile Time error at Line 4
 * e) Compile Time error at Line 5
 * f) Compiles successfully 
 * 
 * R: c and d
 */
