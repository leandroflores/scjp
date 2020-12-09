package scjp.enums.question09;

/**
 * Question 9. What will the following code output?
 */

//protected enum Animal { DOG, CAT, FISH } // Line 1

public class TestEnumAnimal {
//    Animal[] animals = Animal.values(); // Line 2
//    static Animal woofy = new Animal(); // Line 3
    public static void main(String... arg) {
//        System.out.println(woofy);
//        for (Animal animal : animals) { // Line 4
//            System.out.println(animal);
//        }
    }
}

/**
 * Please choose all the answers that apply:
 * 
 * a) DOG
 *    DOG
 *    cat
 *    FIsh
 * b) Compilation Error on Line 1
 * c) Compilation Error on Line 2
 * d) Compilation Error on Line 3
 * e) Compilation Error on Line 4
 * 
 * R: b, d and e
 */