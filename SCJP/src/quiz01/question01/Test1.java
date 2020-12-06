package quiz01.question01;

/**
 * Q1. Given the following code:
 */
public class Test1 {
    public static void main(String[] args) {
        int []a = {1,2,3,4,5,6};
        int i = a.length - 1;
        
        while(i>=0){
            System.out.print(a[i]);
            i--;
        }
    }
}

/**
 * What is the result?
 * a) '65432'
 * b) An exception could be thrown at runtime
 * c) '123456'
 * d) '654321'
 * e) Nothing
 * f) '12345'
 * 
 * R: d
 */