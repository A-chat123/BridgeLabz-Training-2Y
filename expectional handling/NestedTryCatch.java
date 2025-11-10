// 15. Nested Try-Catch in Propagation
class NestedExample {
  void methodB() {
      try {
          String num = "abc";
          int n = Integer.parseInt(num);
      } catch (NumberFormatException e) {
          System.out.println("Number format error in methodB!");
      }
      // This will propagate
      String s = null;
      System.out.println(s.length());
  }

  void methodA() {
      try {
          methodB();
      } catch (NullPointerException e) {
          System.out.println("Null pointer caught in methodA!");
      }
  }
}

public class NestedTryCatch {
  public static void main(String[] args) {
      new NestedExample().methodA();
  }
}

