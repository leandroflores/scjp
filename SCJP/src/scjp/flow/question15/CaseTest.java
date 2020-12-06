package scjp.flow.question15;

/**
 * Question 15. Knowing that character 'a' has a numeric value equal to 97, 
 *              what is the output of the following code
 */
class CaseTest {
    public static void main(String[] args) {
        char c = 'a';
        
        switch(c) {
            case 'a': {
                System.out.println("a");
                break;
            }
            //case 97: {
            //    System.out.println("(int)a");
            //    break;
            //}
        }
    }
}

/**
 * Please choose only one answer:
 * 
 * a) a
 * b) (int)a
 * c) a (int)a
 * d) Compilation Fails
 * 
 * R: d
 */
