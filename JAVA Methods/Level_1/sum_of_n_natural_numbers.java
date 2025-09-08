
import java.util.Scanner;

public class sum_of_n_natural_numbers{
    static int sum(int n){
     int sum = 0;
     for(int i = 1;i<=n;i++){
        sum +=i;
     }
     return sum;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = input.nextInt();

        System.out.print("The sum of n Natural Number: "+ sum(number));
    }
}