import java.util.Scanner;

public class temperature{
  static double WindChill(double temp,double windSpeed){
    double w = Math.pow(windSpeed,0.16);

    double windChill = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * w;
    
    return windChill;
  }
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the temperature:");
    double temp = input.nextDouble();
    System.out.print("Enter the windSpeed:");
    double Ws = input.nextDouble();

    double result = WindChill(temp, Ws);

    System.out.print("the wind chill temperature given the temperature and wind speed is " + result);
  }
  
}