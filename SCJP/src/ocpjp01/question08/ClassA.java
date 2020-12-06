package ocpjp01.question08;

/**
 * Q8: Consider the code:
 */
public class ClassA {
    public static void main(String[] args) {
        new ClassA().doThis();
    }
    
    public void doThis() {
        System.out.println("Running the ClassA class.");
    }
}

/**
 * Assume that the ClassA.java is in the current directory. 
 * And, all the Java commands are run from the current directory. 
 * Which of the following are correct:
 * 
 * a) The command 'javac -d . ClassA.java' at command prompt creates a directory 
 * called mypackage, and ClassA.class file within that directory.
 * b) The above class can be run at the command prompt using the command 
 * 'java mypackage.ClassA'.
 * c) The above class can be run at the command prompt using the command 
 * 'java ClassA'.
 * d) The above class can be run at the command prompt using the command 
 * 'java ClassA.class'.
 * 
 * R: a and b
 */