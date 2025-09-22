
import java.util.Scanner;

public class Football_Team {
  public static int sum_of_heights(int[] heights){
       int sum = 0;
       for(int i = 0; i < heights.length; i++){
        sum += heights[i];
       }
       return sum;
  }

  static int  mean_height(int[] heights){
      int sum = 0;
      for(int i = 0; i< heights.length;i++){
        sum += heights[i];
      }
    return sum/11;
  }

   static int Shortest_height(int[] heights){
      int max = Integer.MIN_VALUE;
      for(int i = 0;i < heights.length;i++){
        if(max < heights[i] ){
          max = heights[i];
        }
      }
   return max;
  }

 static int Tallest_height(int[] heights){
      
  int min = Integer.MAX_VALUE;
  for(int i = 0;i < heights.length;i++){
    if(min > heights[i] ){
      min = heights[i];
    }
  }
return min;
  }

  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int height[] = new int[11];

      for(int i = 0 ; i < height.length ; i++){
        height[i] = input.nextInt();
      }

      int Sum = sum_of_heights(height);
      int Mean = mean_height(height);
      int Tallest = Tallest_height(height);
      int Shortest = Shortest_height(height);
      System.out.println(" the value of results:");
      System.out.println(Sum);
      System.out.println(Mean);
      System.out.println(Shortest);
      System.out.print(Tallest);
      // System.out.print(Arrays.toString(height));
  } 
}
