package scjp.inner.question06;

/**
 * Question 6. What statement,inserted independently at // insert statement here, 
 *             would produce output "Body"?
 */
public class Body {
    String name = "Body";
    
    public static void main(String[] args) {
        System.out.println(new Body().new Heart().getPName());
    }
    
    class Heart {
        String name = "Heart";
        
        String getPName() {
            // insert statement here
             return Body.this.name;
        }
    }
}

/**
 * Please choose only one answer:
 * 
 * a) return Body.name;
 * b) return Body.this.name;
 * c) return super.name;
 * d) return this.super.name;
 * 
 * R: b
 */