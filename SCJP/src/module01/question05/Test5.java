package module01.question05;

/**
 * Q5: Which of the following code snippets correctly show statement 'blocks'
 */
public class Test5 {
    
    // a)
    public int calculate(int a, int b) {
        int c = a + b;
        System.out.println("a+b = " + c);
        return c;
    }
    
    // b)
    public void method() {
        String a = "Java";
        String b = "programming";
        String c = "Java programming";
        if (c.equals(a + b)) {
            System.out.println("Java programming"); // prints Java programming
        }
    }
    
    // c)
    {
        Object object = null;
    }
    
    // d)
    private void method2() {
        Integer i = null;
	try { 
            i = new Integer("56");
	}catch(NumberFormatException nfe) {
            nfe.printStackTrace();
	}
    }
    
    /**
     * R: a, b, c, and d
     */
}