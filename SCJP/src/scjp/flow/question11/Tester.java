package scjp.flow.question11;

/**
 * Question 11. Given the following code, which of if-statements declared is 
 *              correctly written and causes no compilation error?
 */
public class Tester {
    public static void main(String[] args) {
        int x = 9;
        
        // stmt 1
        if (x > 0) {}
        
        // stmt 2
        //if (x = 9){} else {}
        
        // stmt 3
        if (true){
        }else if (x < 0){
        }
        
        // stmt 4
        //if (true){
        //}else (x < 0){
        //}else {
        //}
        
        // stmt 5
        if (true) {
            if (false) {
            }else {
            }
        }else {
            if (true) {
            }
        }
    }
}

/**
 * Please choose all the answers that apply:
 * 
 * a) stmt 1
 * b) stmt 2
 * c) stmt 3
 * d) stmt 4
 * e) stmt 5
 * 
 * R: a, c and e
 */
