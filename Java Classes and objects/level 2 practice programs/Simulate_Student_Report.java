class Student{
  String name;
  int rollnumber;
  int marks;

    char To_calculate_grade(){
    if(40 <= marks && marks< 50){
      return 'F'; 
    }
    else if( 50 <= marks && marks < 60){
      return 'E';
    }
     else if(60 <= marks && marks< 70){
        return 'D';
   }
   else if(70 <= marks && marks < 80){
    return 'C';
   }
   else if(80  <= marks && marks< 90){
    return 'B';
   }

  else if(90 <= marks && marks <100 ){
    return 'A';
  }
  
  else{
    return 'P';
  }
}
  void display_Student_details(){
       System.out.println("Name:" + name);
       System.out.println("RollNumber:" + rollnumber); 
      System.out.println(  "Marks:" + To_calculate_grade());
  }

}




public class Simulate_Student_Report {
  public static void main(String[] args) {
     Student S1 = new Student();
     S1.name = "Anish";
     S1.rollnumber = 6;
     S1.marks = 86;
     S1.display_Student_details();
  }
}
