
import java.util.Scanner;


public class StudentVoteChecker{
public static boolean canStudentVote(int age[]){
   for(int i = 0;i<age.length;i++){
    if(age[i]<=0){
      return false;
    }
    else if(age[i]>=18){
      return true;
    }
    
   }
   return false;
}
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int arr[] = new int[10];

    System.out.print("Enter the element:");
    for(int i = 0;i<arr.length;i++){
      arr[i] = input.nextInt();
      boolean result = canStudentVote(arr);
      if(result){
        System.out.println("can vote.");
       }
       else{
        System.out.println("cannot vote.");
       }
    }
   

   
    
  
  }
}