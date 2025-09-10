
import java.util.Scanner;

public class sum_of_n_natural_number{
  static int number_Recursion(int n){
    if(n==0){
      return 0;
    }
    return n + number_Recursion(n-1);
}
static int natural_number(int n){
   
  return n*(n+1)/2;
}
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number:");
    int number = input.nextInt();
    
    if(number<0){
      return;
    }
  
    int result = number_Recursion(number);
    int result_1 = natural_number(number);

    if(result_1 == result){
      System.out.print("result:"+ result);
    }



}
}

