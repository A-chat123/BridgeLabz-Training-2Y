// 10. Movie Ticket Booking
import java.util.*;

class InvalidSeatException extends Exception { public InvalidSeatException(String msg){super(msg);} }
class SeatAlreadyBookedException extends Exception { public SeatAlreadyBookedException(String msg){super(msg);} }

class MovieBooking {
    Map<Integer, Boolean> seats = new HashMap<>();

    public MovieBooking() {
        for (int i = 1; i <= 5; i++) seats.put(i, true); // all available
    }

    public void bookSeat(int seatNo) throws InvalidSeatException, SeatAlreadyBookedException {
        if (!seats.containsKey(seatNo))
            throw new InvalidSeatException("Invalid seat number!");
        if (!seats.get(seatNo))
            throw new SeatAlreadyBookedException("Seat already booked!");
        seats.put(seatNo, false);
        System.out.println("Seat " + seatNo + " booked successfully!");
    }
}

public class MovieTicketSystem {
    public static void main(String[] args) {
        MovieBooking mb = new MovieBooking();
        try {
            mb.bookSeat(6);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
