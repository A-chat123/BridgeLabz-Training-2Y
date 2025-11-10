// 14. Bank Transaction Manager
class AccountNotFoundException extends Exception { public AccountNotFoundException(String msg){super(msg);} }

class TransactionManager {
    public void verifyAccount(String accNo) throws AccountNotFoundException {
        if (!accNo.equals("12345"))
            throw new AccountNotFoundException("Account not found!");
    }

    public void processTransaction(double balance, double amount)
            throws InsufficientFundsException {
        if (amount > balance)
            throw new InsufficientFundsException("Insufficient funds!");
        System.out.println("Transaction successful!");
    }

    public void executeTransaction() throws Exception {
        verifyAccount("11111");
        processTransaction(5000, 6000);
    }
}

public class BankManager {
    public static void main(String[] args) {
        TransactionManager tm = new TransactionManager();
        try {
            tm.executeTransaction();
        } catch (AccountNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            System.out.println("Transaction complete.");
        }
    }
}

