package scjp.overriding.question12;

/**
 * Question 12. Given the code. What is the result?
 */
class Hotel {
    public int bookings;
    public void book() {
        bookings++;
    }
}

public class SuperHotel extends Hotel {
    public void book() {
        bookings--;
    }
    
    public void book(int size) {
        book();
        super.book();
        bookings += size;
    }
    
    public static void main(String args[]) {
        Hotel hotel = new SuperHotel();
        //hotel.book(2);
        System.out.print(hotel.bookings);
    }
}


/**
 * Please choose only one answer:
 * 
 * a) Compilation Fails
 * b) An Exception is thrown at Runtime
 * c) 0
 * d) 1
 * e) 2
 * f) -1
 * 
 * R: a
 */