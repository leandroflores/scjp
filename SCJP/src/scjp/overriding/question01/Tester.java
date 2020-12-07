package scjp.overriding.question01;

/**
 * Question 1. What modification is necessary to produce the following output: SubType
 */
class Type {
    public Object getTypeName() {
        return "Type";
    }
}

class SubType extends Type {
    public String getTypeName() { // Line 8
        return "SubType";
    }
}

public class Tester {
    public static void main(String[] args) {
        Type first = new SubType(); // Line 16
        System.out.println(first.getTypeName()); // Line 17
    }
}


/**
 * Please choose only one answer:
 * 
 * a) No modification is needed
 * b) At line 8 change ´the return type from String to Object to be a correct 
 *    overloading of getTypeName()
 * c) At line 16 change Type to SubType
 * d) At line 17 cast first.getTypeName() to String
 * 
 * R: a
 */