import java.util.Scanner;

public class factor_array{


  static int[] factor(int n){
    int count = 0;
    for(int i =1;i<=n;i++){
      if(n%i==0){
          count++;
      }
    }
    int arr[] = new int[count];

      int index = 0;

    for(int i = 1;i<=n;i++){
      if(n % i == 0){
         arr[index] = i;
        index++;
      }
    }
    return arr;
  }

  static int sum(int[] result1){
       int sum = 0;
       for(int i = 0;i<result1.length;i++){
        sum +=result1[i];
       }
       return sum;
  }

  static int product(int[] result1){
    int mul = 1;
    for(int i = 0;i<result1.length;i++){
      mul *= result1[i];
    }
    return mul;
  }
  static int square(int[] result1){
    int sum = 0;
    for(int i = 0;i<result1.length;i++){
      sum+=Math.pow(result1[i],2);
    }
    return sum;
  }
  
  
  public static void  main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number:");
    int number  = input.nextInt();
    int result1[] = factor(number); 
     int result2 = sum(result1);
    for(int element:result1){
      System.out.print(element +" ");
     

    }
     System.out.println(" ");
     System.out.println("The Sum of factors: "+ result2);


     int result3 = product(result1);

  System.out.println("The product of the factors:" + result3);

  System.out.print("The sum of square of the factors:"+ square(result1));
  }
  
}