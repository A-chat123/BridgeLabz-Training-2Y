// ===================== SAMPLE PROGRAM 1: BANK ACCOUNT SYSTEM =====================
class BankAccount {
  private static String bankName = "State Bank of India";
  private static int totalAccounts = 0;

  private final long accountNumber;  // final variable
  private String accountHolderName;
  private double balance;

  // Constructor using THIS
  BankAccount(String accountHolderName, long accountNumber, double balance) {
      this.accountHolderName = accountHolderName;
      this.accountNumber = accountNumber; 
      this.balance = balance;
      totalAccounts++;
  }

  // Static method
  public static void getTotalAccounts() {
      System.out.println("Total Accounts: " + totalAccounts);
  }

  // Display details only if instanceof
  public void displayDetails(Object obj) {
      if (obj instanceof BankAccount) {
          System.out.println("Bank Name: " + bankName);
          System.out.println("Account Holder: " + this.accountHolderName);
          System.out.println("Account Number: " + this.accountNumber);
          System.out.println("Balance: " + this.balance);
      } else {
          System.out.println("Not a BankAccount object!");
      }
  }
}



// ===================== SAMPLE PROGRAM 2: LIBRARY MANAGEMENT =====================
class Book {
  private static String libraryName = "City Central Library";

  private final String isbn;  // final variable
  private String title;
  private String author;

  // Constructor using THIS
  Book(String title, String author, String isbn) {
      this.title = title;
      this.author = author;
      this.isbn = isbn;
  }

  // Static method
  public static void displayLibraryName() {
      System.out.println("Library: " + libraryName);
  }

  // Display details if instanceof
  public void display(Object obj) {
      if (obj instanceof Book) {
          System.out.println("ISBN: " + this.isbn);
          System.out.println("Title: " + this.title);
          System.out.println("Author: " + this.author);
      } else {
          System.out.println("Not a Book object!");
      }
  }

  public String getIsbn() { return isbn; }
}



// ===================== SAMPLE PROGRAM 3: EMPLOYEE MANAGEMENT =====================
class Employee {
  private static String companyName = "Tech Solutions Pvt Ltd";
  private static int totalEmployees = 0;

  private final int id;  // final
  private String name;
  private String designation;

  // Constructor using THIS
  Employee(String name, int id, String designation) {
      this.name = name;
      this.id = id;
      this.designation = designation;
      totalEmployees++;
  }

  // Static method
  public static void displayTotalEmployees() {
      System.out.println("Total Employees: " + totalEmployees);
  }

  public void display(Object obj) {
      if (obj instanceof Employee) {
          System.out.println("Company: " + companyName);
          System.out.println("Name: " + this.name);
          System.out.println("ID: " + this.id);
          System.out.println("Designation: " + this.designation);
      } else {
          System.out.println("Not an Employee object!");
      }
  }
}



// ===================== SAMPLE PROGRAM 4: SHOPPING CART SYSTEM =====================
class Product {
  private static double discount = 5.0; // shared discount

  private final int productID; // final
  private String productName;
  private double price;
  private int quantity;

  // Constructor using THIS
  Product(int productID, String productName, double price, int quantity) {
      this.productID = productID;
      this.productName = productName;
      this.price = price;
      this.quantity = quantity;
  }

  // Static method
  public static void updateDiscount(double newDiscount) {
      discount = newDiscount;
  }

  public void display(Object obj) {
      if (obj instanceof Product) {
          System.out.println("Product ID: " + productID);
          System.out.println("Name: " + productName);
          System.out.println("Price: " + price);
          System.out.println("Quantity: " + quantity);
          System.out.println("Discount: " + discount + "%");
      } else {
          System.out.println("Not a Product object!");
      }
  }
}



// ===================== SAMPLE PROGRAM 5: STUDENT MANAGEMENT SYSTEM =====================
class Student {
  private static String universityName = "National University";
  private static int totalStudents = 0;

  private final int rollNumber;   // final
  private String name;
  private String grade;

  // Constructor using THIS
  Student(String name, int rollNumber, String grade) {
      this.name = name;
      this.rollNumber = rollNumber;
      this.grade = grade;
      totalStudents++;
  }

  public static void displayTotalStudents() {
      System.out.println("Total Students: " + totalStudents);
  }

  public void displayStudentDetails(Object obj) {
      if (obj instanceof Student) {
          System.out.println("University: " + universityName);
          System.out.println("Name: " + this.name);
          System.out.println("Roll No: " + this.rollNumber);
          System.out.println("Grade: " + this.grade);
      } else {
          System.out.println("Not a Student object!");
      }
  }
}



// ===================== SAMPLE PROGRAM 6: VEHICLE REGISTRATION SYSTEM =====================
class Vehicle {
  private static double registrationFee = 5000;

  private final String registrationNumber;  // final
  private String ownerName;
  private String vehicleType;

  // Constructor using THIS
  Vehicle(String ownerName, String vehicleType, String registrationNumber) {
      this.ownerName = ownerName;
      this.vehicleType = vehicleType;
      this.registrationNumber = registrationNumber;
  }

  public static void updateRegistrationFee(double fee) {
      registrationFee = fee;
  }

  public void display(Object obj) {
      if (obj instanceof Vehicle) {
          System.out.println("Owner: " + ownerName);
          System.out.println("Type: " + vehicleType);
          System.out.println("Registration Number: " + registrationNumber);
          System.out.println("Registration Fee: " + registrationFee);
      } else {
          System.out.println("Not a Vehicle object!");
      }
  }
}



// ===================== SAMPLE PROGRAM 7: HOSPITAL MANAGEMENT SYSTEM =====================
class Patient {
  private static String hospitalName = "City Hospital";
  private static int totalPatients = 0;

  private final int patientID;  // final
  private String name;
  private int age;
  private String ailment;

  // Constructor using THIS
  Patient(String name, int age, String ailment, int patientID) {
      this.name = name;
      this.age = age;
      this.ailment = ailment;
      this.patientID = patientID;
      totalPatients++;
  }

  public static void getTotalPatients() {
      System.out.println("Total Patients: " + totalPatients);
  }

  public void display(Object obj) {
      if (obj instanceof Patient) {
          System.out.println("Hospital: " + hospitalName);
          System.out.println("Patient ID: " + patientID);
          System.out.println("Name: " + name);
          System.out.println("Age: " + age);
          System.out.println("Ailment: " + ailment);
      } else {
          System.out.println("Not a Patient object!");
      }
  }
}



// ===================== MAIN CLASS =====================
public class AllPrograms {
  public static void main(String[] args) {

      System.out.println("===== Sample Program 1: Bank Account =====");
      BankAccount b1 = new BankAccount("Rahul", 12345, 5000);
      b1.displayDetails(b1);
      BankAccount.getTotalAccounts();

      System.out.println("\n===== Sample Program 2: Library Book =====");
      Book bk = new Book("Java Programming", "James Gosling", "ISBN1234");
      Book.displayLibraryName();
      bk.display(bk);

      System.out.println("\n===== Sample Program 3: Employee =====");
      Employee emp = new Employee("Amit", 101, "Developer");
      emp.display(emp);
      Employee.displayTotalEmployees();

      System.out.println("\n===== Sample Program 4: Product =====");
      Product p = new Product(1, "Laptop", 55000, 2);
      p.display(p);
      Product.updateDiscount(10);

      System.out.println("\n===== Sample Program 5: Student =====");
      Student s = new Student("Riya", 201, "A");
      s.displayStudentDetails(s);
      Student.displayTotalStudents();

      System.out.println("\n===== Sample Program 6: Vehicle =====");
      Vehicle v = new Vehicle("Suresh", "Car", "MH12AB1234");
      v.display(v);

      System.out.println("\n===== Sample Program 7: Patient =====");
      Patient pt = new Patient("Anita", 30, "Fever", 501);
      pt.display(pt);
      Patient.getTotalPatients();
  }
}
