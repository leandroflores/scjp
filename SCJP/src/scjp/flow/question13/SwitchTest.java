package scjp.flow.question13;

/**
 * Question 13. What is the output of this code?
 */
public class SwitchTest {
    enum Color {RED, GREEN, BLUE};
    
    public static void main(String[] args) {
        Color clr = Color.GREEN;
        long x = 2;
        
        /*
        switch(x) { // #1 
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("default");
                break;
        }*/
        
        switch(clr) { // #2
            case RED:
                System.out.println("Red");
                break;
            case GREEN:
                System.out.println("Green");
                break;
            case BLUE:
                System.out.println("Blue");
                break;
        }
    }
}

/**
 * Please choose only one answer:
 * 
 * a) 2 Green
 * b) 2 3 Green
 * c) 2 3
 * d) Compile Error at #1
 * e) Compile Error at #2
 * f) Runtime Exception at #2
 * 
 * R: d
 */
