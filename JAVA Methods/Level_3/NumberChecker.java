
import java.util.Scanner;
import java.util.Arrays;


public class NumberChecker {

  public static int Count(int n){
    int c = 0;
    
    while(n > 0){
         n = n / 10;
         c++;
    }
    return c;
  }

  public static int[] No_of_digits(int n, int c){
    
    int digits[] = new int[c];
    for(int i = digits.length-1;i >= 0;i--){
       digits[i] = n % 10;
       n /= 10;
       
    }
    return digits;
  }
  public static String duck_number(int[] digits_Array){
    boolean Isdigit = true;
    for(int i = 0 ; i < digits_Array.length; i++){
        if(digits_Array[i] == 0){
            Isdigit = false;
            break;
        }
       }
       if(Isdigit){
        return "It is a duck Number.";
       }
       else{
        return "It is not a duck Number.";
       }

  }

  public static String Armstrong_number(int[] digits_Array){
      int sum = 0;
      int n = digits_Array.length;
      for(int digit:digits_Array){
        sum += Math.pow(digit,n);
      }

    
    
      int Original = 0;
    for(int digit:digits_Array){
        Original = Original * 10 + digit;
    }

    if(sum == Original ){
      return "It's a Armstrong Number.";
  }
  else{
    return "It's not a Armstrong Number.";
  }
}
public static int[] LargestandSecond_largest(int[]digits_Array){
  int Largest = Integer.MIN_VALUE;
  int Second_largest = Integer.MIN_VALUE;

  for(int i = 0 ; i < digits_Array.length;i++){
    if(digits_Array[i] > Largest){
      Second_largest = Largest;
      Largest = digits_Array[i];
    }
    else if((digits_Array[i] > Second_largest  ) && (digits_Array[i] != Largest)){
       Second_largest = digits_Array[i];
    }
  }
  return new int[] {Largest,Second_largest};
}
public static int[] SmallestandSecond_smallest(int[]digits_Array){
  int Smallest = Integer.MAX_VALUE;
  int Second_smallest = Integer.MAX_VALUE;

  

  for(int i = 0 ; i < digits_Array.length;i++){
    if(digits_Array[i] < Smallest){
      Second_smallest = Smallest;
      Smallest = digits_Array[i];
    }
    else if((digits_Array[i] < Second_smallest) && (digits_Array[i] != Smallest)){
       Second_smallest = digits_Array[i];
    }
    
  }
  return new int[] {Smallest,Second_smallest};
}
  public static void main(String[] args){
   
Scanner input = new Scanner(System.in);
int number = input.nextInt();

 int count = Count(number);
 int [] Digits_Array = No_of_digits(number,count);
 String duck_Number = duck_number(Digits_Array);
  String Armstrong_Number = Armstrong_number(Digits_Array);
  int[] result1 = LargestandSecond_largest(Digits_Array); 
  int[] result2 = SmallestandSecond_smallest(Digits_Array); 
   
System.out.println(count + " " + Arrays.toString(Digits_Array) +" " + duck_Number + Armstrong_Number +" " + Arrays.toString(result1) + " " + Arrays.toString(result2)  );

  }
}

