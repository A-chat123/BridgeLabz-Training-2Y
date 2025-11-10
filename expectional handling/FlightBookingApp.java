// 13. Flight Booking Application
class SeatUnavailableException extends Exception { public SeatUnavailableException(String msg){super(msg);} }
class PaymentFailedException2 extends Exception { public PaymentFailedException2(String msg){super(msg);} }

class FlightBooking {
    public void checkSeatAvailability() throws SeatUnavailableException {
        throw new SeatUnavailableException("No seats available!");
    }

    public void processPayment() throws PaymentFailedException2 {
        throw new PaymentFailedException2("Payment processing failed!");
    }

    public void bookTicket() throws Exception {
        checkSeatAvailability();
        processPayment();
    }
}

public class FlightBookingApp {
    public static void main(String[] args) throws Exception {
        FlightBooking fb = new FlightBooking();
        try {
            fb.bookTicket();
        } catch (SeatUnavailableException e) {
            System.out.println(e.getMessage());
        } catch (PaymentFailedException2 e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Thank you for booking with us!");
        }
    }
}

