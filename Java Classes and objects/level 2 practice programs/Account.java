class BankAccount {
  String accountHolder;
  long accountNumber;
  int balance;

  void Deposit(int amount) {
    if (amount > 0) {
      balance += amount;
    } else {
      System.out.print("Money not received.");
    }
  }

  void Withdraw(int amount) {
    if (amount < balance) {
      balance -= amount;
    } else {
      System.out.print("Don't have a sufficient money.");
    }
  }

  void Display_current_Money() {

    System.out.println("Current_balance:" + balance);

  }

}

public class Account {
  public static void main(String[] args) {
    BankAccount account = new BankAccount();
    account.balance = 2000;
    account.accountHolder = "Anish";
    account.accountNumber = 134142593;
    account.Deposit(3000);

    account.Withdraw(2300);

    account.Display_current_Money();

  }
}
