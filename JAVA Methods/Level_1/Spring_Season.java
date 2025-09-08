
import java.util.Scanner;

public class Spring_Season{
  static boolean Month_Day(int month,int day){
    if(month==3 && (20<=day && day<=31)){
        return true;
    }
     else if(month==4 && (1<=day && day<=30)){
        return true ;
  }
    else if(month==5 && (1<=day && day<=20)){
        return true;
   }
   return false;
  }

  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the month:");
      int month = input.nextInt();
      System.out.print("Enter the day:");
      int day = input.nextInt();

      boolean result = Month_Day(month,day);
      
     if(result){
      System.out.print("Its a Spring Season.");
     }
        else{
          System.out.print("Not a Spring Season.");
        }

  }

}
