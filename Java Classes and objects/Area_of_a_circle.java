class Circle{
  int radius;

  void area_and_circumference(){
    System.out.println("Circumference:" + 2*22/7*radius);
    System.out.print("Area:" + 22/7*radius*radius);
  }
}


public class Area_of_a_circle{
  public static void main(String[] args) {
     Circle result = new Circle();
      result.radius = 4;
      result.area_and_circumference();

  }
}
