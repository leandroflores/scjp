package scjp.constructors.question05;

/**
 * Question 5. What is the expected output?
 */
class Plant {
    Plant() {
        System.out.println("Plant created");
    }
}

class Tree extends Plant {
    Tree() {
        System.out.println("Tree created");
        //super();
    }
}

public class Test {
    public static void main(String[] args) {
        Tree tree = new Tree();
    }
}

/**
 * Please choose only one answer:
 * 
 * a) Plant created
 *    Tree created
 * b) Tree created
 *    Plant created
 * c) Runtime Exception
 * d) Compilation Error
 * 
 * R: d
 */