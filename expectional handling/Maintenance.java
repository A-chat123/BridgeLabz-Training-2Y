// 6. Vehicle Maintenance Tracker
import java.time.LocalDate;

class ServiceOverdueException extends Exception { public ServiceOverdueException(String msg){super(msg);} }
class InvalidMileageException extends Exception { public InvalidMileageException(String msg){super(msg);} }

class Vehicle {
    public void checkMaintenance(LocalDate serviceDate, int mileage)
            throws ServiceOverdueException, InvalidMileageException {
        if (mileage < 0) throw new InvalidMileageException("Mileage cannot be negative!");
        if (serviceDate.isBefore(LocalDate.now())) throw new ServiceOverdueException("Service overdue!");
        System.out.println("Vehicle maintenance up to date.");
    }
}

public class Maintenance {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        try {
            v.checkMaintenance(LocalDate.of(2023, 12, 1), 12000);
        } catch (ServiceOverdueException | InvalidMileageException e) {
            System.out.println(e.getMessage());
        }
    }
}

