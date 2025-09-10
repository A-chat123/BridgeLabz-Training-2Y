
import java.util.Scanner;

public class UnitConvertor {
  public static double kmtoMiles(double km){
      double km2miles = 0.621371 * km;
      return km2miles;
  }
  public static double MilestoKilometers(double miles){
    double miles2km = 1.60934 * miles;
    return miles2km;
  }
  public static double MeterstoFeet(double meter){
    double meters2feet = 3.28084 * meter;
    return meters2feet;
  }
  public static double FeettoMeters(double feet){
    double feet2meters = 0.3048 * feet;
    return feet2meters;
  }

  public static void main(String[] args){
    Scanner input  = new Scanner(System.in);
    System.out.print("Enter the distance in km: ");
    double km = input.nextDouble();
    System.out.print("Enter the distance in miles: ");
    double miles = input.nextDouble();
    System.out.print("Enter the distance in meters: ");
    double meters = input.nextDouble();
    System.out.print("Enter the distance in feet: ");
    double feet = input.nextDouble();
    System.out.printf("kmtoMiles(double km):" + kmtoMiles( km) + "    Milestokm(miles):" + MilestoKilometers(miles) + "    MeterstoFeet(double Meters):"+ MeterstoFeet(meters) + "   FeettoMeters(Feet):"+ FeettoMeters(feet) +".");
  }
}
