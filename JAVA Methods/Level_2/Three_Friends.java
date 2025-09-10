
import java.util.Scanner;

public class Three_Friends {
  static int tallest(int[] height){
        if((height[0]>height[1])&&(height[0]>height[2])){
          return height[0];
        }
        else if((height[1]>height[0])&&(height[1]>height[2])){
          return height[1];
        }
        else if((height[2]>height[0])&&(height[2]>height[1])){
          return height[2];
        }
       return 0;
  }
  static int Youngest(int[] age){
    if((age[0]>age[1])&&(age[0]>age[2])){
      return age[0];
    }
    else if((age[1]>age[0])&&(age[1]>age[2])){
      return age[1];
    }
    else if((age[2]>age[0])&&(age[2]>age[1])){
      return age[2];
    }
   return 0;
  }

  public static void main(String[] args) {
      Scanner input  = new Scanner(System.in);
      System.out.println("Enter the height element:");
       int height[] = new int[3];
       for(int i = 0;i<height.length;i++){
        height[i] = input.nextInt();
       }
       int age[] = new int[3];
       System.out.println("Enter the age element:");
       for(int i = 0;i<age.length;i++){
          age[i] = input.nextInt();
       }

       int result_1 = tallest(height);
       int result_2 = Youngest(age);

       System.out.println("result_1: " + result_1 + " result_2: " + result_2 );
  }
}
