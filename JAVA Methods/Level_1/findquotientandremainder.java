import java.util.Scanner;

public class findquotientandremainder{
  static int[] RemainderAndQuotient(int number,int divisor){
    return new int[]{number /  divisor,number % divisor};
     

  }

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number: ");
    int number = input.nextInt();
    System.out.print("Enter the divisor: ");
    int divisor = input.nextInt();

    int result[] =  RemainderAndQuotient(number,divisor);
    System.out.print("The quotient: " + result[0] + " and The remainder : " + result[1]);
    input.close(); 
  }
}