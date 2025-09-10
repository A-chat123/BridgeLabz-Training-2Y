
import java.util.Scanner;

public class Quadratic_equation {

  public static int[] Roots(int a,int b,int c){
    int delta  = (int)(Math.pow(b,2) -  4 * a * c);
   
    int[]roots;
    if(delta>0){
      int x1 = (int)(-b + Math.sqrt(delta)/(2 * a)) ;
       int x2 =  (int)(-b - Math.sqrt(delta)/(2 * a));
       roots = new int[] {x1,x2};
      

       
       
    }
     else if(delta == 0){
      int x = -b / ( 2 * a);
      roots = new int[]{x};
      
     }
      else{
        roots = new int[] { };
      }
     return roots;
    
    }
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      //ax^2 + bx + c
      System.out.print("enter the a:");
      int a = input.nextInt();
      System.out.print("Enter the b:");
      int b = input.nextInt();
      System.out.print("Enter the c");
      int c = input.nextInt();

      System.out.println("The roots of a quadratic equation: ");
  }
}
