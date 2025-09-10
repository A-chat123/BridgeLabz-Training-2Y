
import java.util.Scanner;

public  class Leap_year{
  static boolean year(int n){
    if(n>=1582){
      if((n % 4 == 0 && n % 100 != 0)||(n % 400 == 0)){
         return true;

      }
      else{
        return false;
      }
    }
    else{
      return false;
    }
  }

  public static void main(String[] args) {
      Scanner input  = new Scanner(System.in);
      System.out.print("Enter the year:");
      int year = input.nextInt();

      if(year(year)){
        System.out.println("Leap Year.");

      }
      else{
        System.out.print("Not a Leap Year.");
      }
  }
}