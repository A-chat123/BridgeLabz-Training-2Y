
import java.util.Scanner;

public class No_of_triangular_rounds {

    static int rounds(int S1, int S2, int S3) {
        int perimeter = S1 + S2 + S3;
        int rounds = 5000 / perimeter;

        return rounds;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first side:");
        int a = input.nextInt();
        System.out.print("Enter the Second side:");
        int b = input.nextInt();
        System.out.print("Enter the third side:");
        int c = input.nextInt();

        int result = rounds(a, b, c);

        System.out.print("No of rounds needs to complete 5km: " + result);

    }
}
