package scjp.inner.question03;

/**
 * Question 3. Which of the instantiations for a BlackBox are correct and 
 *             compile-free?
 */
public class OuterTest {
    public static void main(String[] args) {
        
        // Instantiation 1
        Airplane airplane = new Airplane();
        Airplane.BlackBox box1 = airplane.new BlackBox();
        
        // Instantiation 2
        Airplane.BlackBox box2 = new Airplane().new BlackBox();
        
        // Instantiation 3
        Airplane airplane3 = new Airplane();
        //BlackBox box3 = airplane3.new BlackBox();
    }
}

class Airplane {
    class BlackBox {}
}

/**
 * Please choose all the answers that apply:
 * 
 * a) Instantiation 1
 * b) Instantiation 2
 * c) Instantiation 3
 * 
 * R: a and b
 */