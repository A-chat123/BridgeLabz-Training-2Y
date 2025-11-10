// 5. Banking Transaction System
import java.util.Random;

class NegativeAmountException extends Exception { public NegativeAmountException(String msg){super(msg);} }
class NetworkFailureException extends Exception { public NetworkFailureException(String msg){super(msg);} }

class Transaction {
    public void process(double balance, double amount) throws NegativeAmountException, InsufficientFundsException, NetworkFailureException {
        int error = new Random().nextInt(3);
        if (amount < 0) throw new NegativeAmountException("Negative amount not allowed!");
        if (amount > balance) throw new InsufficientFundsException("Insufficient funds!");
        if (error == 2) throw new NetworkFailureException("Network issue! Please try later.");
        System.out.println("Transaction successful!");
    }
}

public class BankingTransaction {
    public static void main(String[] args) {
        Transaction t = new Transaction();
        try {
            t.process(5000, 6000);
        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } catch (NetworkFailureException e) {
            System.out.println(e.getMessage());
        }
    }
}
