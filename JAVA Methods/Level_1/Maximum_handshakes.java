
import java.util.Scanner;

public class Maximum_handshakes{
  static int handshake(int n){
    int handshakes = (n*(n-1))/2;

    return handshakes;
  }


  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of Students:");
      int Students = input.nextInt();

     int No_of_handshakes = handshake(Students);

     System.out.print("Number of Handshakes: " +  No_of_handshakes);
  }
}