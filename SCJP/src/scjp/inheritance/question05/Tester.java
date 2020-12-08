package scjp.inheritance.question05;

/**
 * Question 5. Will the following code compile and if yes ,what is the output?
 */
interface Colorable{}
class Vehicle{}
class Car extends Vehicle implements Colorable{}
        
public class Tester {
    public static void main(String[] args) {
        Vehicle a = new Car();
        Colorable i = (Colorable) a;
        
        Vehicle b = new Vehicle();
        Colorable j = (Colorable) b;
    }
}

/**
 * Please choose only one answer:
 * 
 * a) The code compiles fine and produces no output
 * b) The code compiles fine but throws a RuntimeException because of the 
 *    second casting
 * c) There is a compilation error because of the second casting
 * d) The code compiles fine but throws a RuntimeException because of the 
 *    first casting
 * 
 * R: b
 */