import java.util.Scanner;

public class Simple_interest{
  static Float calc( int P, Float R, int T){
    Float SP  = (P*R*T)/100;

   return SP;

  }

  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
    int time;
    int principle_amount;
    Float rate;
    System.out.print("Enter the principle_amount:");
     principle_amount = input.nextInt();
      System.out.print("Enter the rate:");
     rate = input.nextFloat();
     System.out.print("Enter the time:");
     time = input.nextInt();
   



    Float result = calc( principle_amount,rate,time);

    System.out.print("The Simple interest is " + result + " for principal " + principle_amount + " ,Rate of interest " + rate + " and Time " + time + " ." );

    input.close();
}


}

