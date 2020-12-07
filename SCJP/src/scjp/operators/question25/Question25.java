package scjp.operators.question25;

/**
 * Question 25. Taking in consideration the following declarations, which lines will compile?
 */
public class Question25 {
    public static void main(String[] args) {
        float f = 1.1f;
        float[] f1 = {2.0f};
        float[][] f2 = {{1.1f, 1.2f}, {2.0f}, {3.1f, 3.2f, 3.3f}};
        
        Long b = 2L;
        
        //if (f == f2) {}
        //if (f == f2[0][0]) {}
        //if (b= f2[1][0]) {}
        //if (f == f2[2, 1]) {}
        //if (f1 == f2[1]) {}
    }
}


/**
 * Please choose all the answers that apply:
 * 
 * a) if (f == f2) {}
 * b) if (f == f2[0][0]) {}
 * c) if (b= f2[1][0]) {}
 * d) if (f == f2[2, 1]) {}
 * e) if (f1 == f2[1]) {}
 * 
 * R: b, e
 */