package scjp.declarations.question18;

/**
 * Question 18. Which of the following are NOT valid JavaBeans method 
 *              identifiers for setters/getters of private class variables?
 */
class Question18 {
    /*
    // Property setters:
    void setCustomername() // Line 1
    public int modifyValue(int val) // Line 2
    public void setCustomerName(String customer) // Line 3
    public void setIsAlive(boolean isAlive) // Line 4
    public void addSize(int size) // Line 5
    public void putSize(int size) // Line 6

    // Property getters:
    public int getMyValue() // Line 7
    public int getAccount#(String clientName) // Line 8
    protected boolean getHappy() // Line 9
    public boolean isHappy() // Line 10
    public boolean getHappy() // Line 11
    public int isNrOfFlowers() // Line 12
    */
}

/**
 * Please choose all the answers that apply:
 * a) Lines 1 and 9 - JavaBeans methods must be public in order to provide 
 *                    access to the private variables of a class
 * b) Lines 2, 5 and 6 - according to JavaBeans "add" should be used only with 
 *                       listener methods, and "set" should be used instead of 
 *                       "put" and "modify"
 * c) Line 8 - will produce a compile-time error due to invalid Java identifier
 * d) Line 3 - the method's argument name should match the one its name: 
 *             "customerName"
 * e) Lines 4, 7 and 11 - are adding or missing some things
 * f) Line 10 - it should be getHappy() because it's a getter method as it 
 *              returns a value
 * g) Line 12 - "nrOfFlowers" seems to be of type "int" not "boolean", as that's
 *              what the method is returning, so it should be "get" instead 
 *              of "is"
 * 
 * R: 
 */