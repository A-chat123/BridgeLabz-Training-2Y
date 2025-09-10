
import java.util.Scanner;

public class number {
  public static void isPositive(int n){
    if(n>0){
    System.out.println("Positive.");
     isEven(n);
       
    }
    else{
     System.out.println("Negative.");
    }

  }
  public static void isEven(int n){ 
      if(n % 2 == 0){
      System.out.println("Even.");
      System.out.println(" ");
      }
    else{
      System.out.println("Odd.");
      System.out.println(" "); 
    }
    
  
    }
  public static int compare(int number1,int number2){
    if(number1>number2){
     return 1;
    }
    else if(number1 == number2){
   return 0;
    }
    else {
      return -1;
    }
  }

  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the element:");
      int number[] = new int[5];
      for(int i = 0;i<number.length;i++){
         number[i] = input.nextInt();
         isPositive(number[i]);
       }

       int Result = compare(number[0],number[4]);
       if(Result == 1){
        System.out.println("The First number Greater than Last number.");
       }
       else if(Result == 0){
        System.out.println("The First number Equal to Last number.");
       }
       else  {
        if(Result == -1){
          System.out.println("The First number Less than Last number.");
         }
       }
  }

}
