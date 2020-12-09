package scjp.inner.question02;

/**
 * Question 2. What is the expected output?
 */
public class OuterTest {
    public static void main(String[] args) {
        Airplane.BlackBox box = new Airplane().new BlackBox(); // Line 1
        box.printVariables();
    }
}

class Airplane {
    String code = "11";
    
    class BlackBox {
        String code = "22";
        
        public void printVariables() {
            System.out.print(code);
            System.out.print(Airplane.this.code); // Line 20
        }
    }
}

/**
 * Please choose only one answer:
 * 
 * a) Compile Error because of Line 1 (incorrect instantiation)
 * b) Compile Error because of Line 20 (can't access Airplane's variables)
 * c) 2222
 * d) 1111
 * e) 2211
 * 
 * R: e
 */