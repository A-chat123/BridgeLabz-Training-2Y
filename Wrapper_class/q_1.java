/*Write a Java program that takes an integer input from the user and:
● Converts it into an Integer object.
● Displays the value using both the primitive and object forms. */

import java.util.Scanner;

public class q_1{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int num = input.nextInt();
    Integer num1 =  Integer.valueOf(num);

    System.out.println("primitive type:" + num);
    System.out.print("Object forms:" + num1);
  }
}