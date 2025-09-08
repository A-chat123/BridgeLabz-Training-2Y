import java.util.Scanner;
public class trignometric_function{
  static double[] calculateTrignometricFunctions(double angle){
    double radian = Math.toRadians(angle);
    double sine = Math.sin(radian); 
    double cosine = Math.cos(radian); 
    double tangent = Math.tan(radian); 
    return new double[]{sine,cosine,tangent};
  }
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the angle:");
    double angle = input.nextDouble();

    double result[] = calculateTrignometricFunctions(angle);

    System.out.print("Sine: " + result[0] + " cosine: " + result[1] + " tangent: " + result[2]);

  }
  }

  