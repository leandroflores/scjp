package scjp.overriding.question08;

/**
 * Question 8. What is the o/p of the given code?
 */
class Ret {
    public long tryIt() {
        long num = 25;
        return num; // $1
    }
}

public class ReturnType extends Ret {
    public long tryIt() {
        char ch = 'a';
        long num = 50;
        return ch; // $2
    }
    
    public static void main(String[] args) {
        Ret r = new ReturnType(); // $3
        System.out.println(r.tryIt()); // $4
    }
}


/**
 * Please choose only one answer:
 * 
 * a) 25
 * b) 50
 * c) Compilation Error at $2
 * d) Compilation Error at $3
 * e) Runtime Exception at $4
 * f) None of the above
 * 
 * R: f
 */