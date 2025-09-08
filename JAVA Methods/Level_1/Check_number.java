
import java.util.Scanner;

public class Check_number{
  static int number(int n){
    if(n>0){
      return 1;
    }
   else if(n<0){
    return -1;
   }
   else{
    return 0;
   }
  }

public static void main(String[] args){
  Scanner input = new Scanner(System.in);

  System.out.print("Enter the number:");
  int number = input.nextInt();

  int result = number(number);

  System.out.print("the result is " + result);
}

}