package scjp.declarations.question17;

/**
 * Question 17. Which of the following are NOT valid JavaBeans identifiers for 
 *              methods that add/remove listeners from an event source?
 */
class Question17 {
    /*
    // Event subscribers:
    public void addXListener(MyListener m) // Line 1
    void addXListener() // Line 2
    public void addEvent(Event e) // Line 3
    public void addEventListener(EventListener e) // Line 4

    // Event removers:
    public void removeMyListener(MyListener m) // Line 5
    public void removeMyListener() // Line 6
    public void deleteActionListner(ActionListsner m) // Line 7
    */
}

/**
 * Please choose all the answers that apply:
 * a) lines 1 and 3 - the names of the methods do not match the type of argument 
 *                    they receive + JavaBeans adder/remover methods should 
 *                    always end with "Listener"
 * b) line 2 - JavaBeans methods must be public in order to provide access to 
 *             the private variables of a class + it's missing an argument of 
 *             type XListener
 * c) line 4 - it's adding or missing something
 * d) line 5 - the name of its argument should be more meaningful
 * e) line 6 - it misses the event to be removed
 * f) line 7 - should be "remove" instead of "delete"
 * 
 * R: b, e, and f
 */