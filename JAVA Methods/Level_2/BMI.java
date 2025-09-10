
import java.util.Scanner;

public class BMI{
   static double Calculate_BMI(double weight, double height){
     
    return weight/((height*height)*0.0001);
    }

  static String[] BMI_Status(double[][] arr){
    String Status[] = new String[arr.length];
    for(int i = 0;i < Status.length;i++){
      double bmi = arr[i][2];

      if(bmi<= 18.4){
        Status[i] = "Underweight";
      }
      else if(bmi >= 18.5 && bmi <= 24.9){
        Status[i] = "Normal";
      }
      else if(bmi>=25.0 && bmi<=39.9){
        Status[i] = "Overweight";

      }
      else{
        Status[i]  = "Obese";
      }
    }
     return Status;
  }



  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double BMI[][] = new double[10][3];
      for(int i = 0 ;i < BMI.length ; i++){
        for(int j = 0;j < BMI[i].length;j++){
            if(j==0){
              System.out.print("PERSON " + (i+1) + "  WEIGHT(in kg):");
              BMI[i][j] = input.nextDouble();

            }
              if(j==1){
              System.out.print("PERSON " + (i+1) + "  HEIGHT(in cm):");
              BMI[i][j] = input.nextDouble();
            }
            if(j==2){
           BMI[i][j] = Calculate_BMI(BMI[i][0],BMI[i][1]);
           System.out.println("PERSON " + (i+1) + "  CALCULATED_BMI(kg /m^2 ): "+ BMI[i][j]);
             
           String result[] = BMI_Status(BMI);

           System.out.println("BMI_STATUS: " + result[i]);
            
          
            }
            
             
        }
        System.out.println(" ");
      }
  
  
    }


}
