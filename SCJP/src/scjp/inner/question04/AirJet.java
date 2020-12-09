package scjp.inner.question04;

/**
 * Question 4. Which of the instantiations for a Engine are correct and 
 *             compile-free?
 */
public class AirJet {
    public static void main(String[] args) {
        
        // Instantiation 1
        Engine engine1 = new AirJet().new Engine();
        
        // Instantiation 2
        AirJet.Engine engine2 = new AirJet().new Engine();
        
        // Instantiation 3
        AirJet airjet = new AirJet();
        Engine engine3 = airjet.new Engine();
        
        // Instantiation 4
        //Engine engine4 = new Engine();
        
    }
    class Engine {}
}

/**
 * Please choose all the answers that apply:
 * 
 * a) Instantiation 1
 * b) Instantiation 2
 * c) Instantiation 3
 * d) Instantiation 4
 * 
 * R: a, b and c
 */