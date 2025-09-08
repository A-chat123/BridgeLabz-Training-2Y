
import java.util.Scanner;

public class find_smallest_and_largest_number{
  static int[] smallest_and_largest_number(int a,int b ,int c){
    int [] arr = {a,b,c};
    for(int i=0;i<arr.length-1;i++){
      for(int j = 0;j<arr.length-i-1;j++){
      if(arr[j]<arr[j+1]){
         int temp = arr[j];
              arr[j] = arr[j+1];
              arr[j+1]  = temp;

  }
      }
  }
        return arr;
  }

  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
     System.out.print("Enter the number1:");
     int number1  = input.nextInt();
     System.out.print("Enter the number2:");
     int number2  = input.nextInt();
     System.out.print("Enter the number3:");
     int number3  = input.nextInt();

     int [] result = smallest_and_largest_number(number1,number2,number3);
      
     System.out.println("MAX : " + result[0]);
    System.out.println("MIN : " + result[2]);
       
      
  }
}


 