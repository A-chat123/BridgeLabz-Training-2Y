// 4. Online Order Processing
import java.util.Random;

class OutOfStockException extends Exception {
    public OutOfStockException(String msg) { super(msg); }
}
class PaymentFailedException extends Exception {
    public PaymentFailedException(String msg) { super(msg); }
}

class Order {
    public void placeOrder() throws OutOfStockException, PaymentFailedException {
        int x = new Random().nextInt(2);
        if (x == 0)
            throw new OutOfStockException("Product out of stock!");
        else
            throw new PaymentFailedException("Payment failed. Try again!");
    }
}

public class OnlineOrder {
    public static void main(String[] args) {
        Order o = new Order();
        try {
            o.placeOrder();
        } catch (OutOfStockException | PaymentFailedException e) {
            System.out.println(e.getMessage());
        }
    }
}
