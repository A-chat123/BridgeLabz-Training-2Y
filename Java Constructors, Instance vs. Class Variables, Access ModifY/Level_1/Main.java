// -------------------------------------------------------------
// PART 1 — Constructors & Object Initialization
// -------------------------------------------------------------

// 1. Book Class (Default + Parameterized Constructors)
class Book {
  String title;
  String author;
  double price;

  Book() {
      this.title = "Unknown";
      this.author = "Unknown";
      this.price = 0.0;
  }

  Book(String title, String author, double price) {
      this.title = title;
      this.author = author;
      this.price = price;
  }

  void displayBook() {
      System.out.println("Book: " + title + " | Author: " + author + " | Price: " + price);
  }
}

// 2. Circle Class with Constructor Chaining
class Circle {
  double radius;

  Circle() {
      this(1.0);
  }

  Circle(double radius) {
      this.radius = radius;
  }

  void displayCircle() {
      System.out.println("Radius: " + radius);
  }
}

// 3. Person Class with Copy Constructor
class Person {
  String name;
  int age;

  Person(String name, int age) {
      this.name = name;
      this.age = age;
  }

  Person(Person p) {
      this.name = p.name;
      this.age = p.age;
  }

  void displayPerson() {
      System.out.println("Name: " + name + " | Age: " + age);
  }
}

// 4. Hotel Booking System (Default, Parameterized, and Copy Constructors)
class HotelBooking {
  String guestName;
  String roomType;
  int nights;

  HotelBooking() {
      this("Unknown Guest", "Standard", 1);
  }

  HotelBooking(String guestName, String roomType, int nights) {
      this.guestName = guestName;
      this.roomType = roomType;
      this.nights = nights;
  }

  HotelBooking(HotelBooking hb) {
      this.guestName = hb.guestName;
      this.roomType = hb.roomType;
      this.nights = hb.nights;
  }

  void displayBooking() {
      System.out.println("Guest: " + guestName + " | Room: " + roomType + " | Nights: " + nights);
  }
}

// 5. Library Book System with borrow method
class LibraryBook {
  String title;
  String author;
  double price;
  boolean availability;

  LibraryBook(String title, String author, double price, boolean availability) {
      this.title = title;
      this.author = author;
      this.price = price;
      this.availability = availability;
  }

  void borrowBook() {
      if (availability) {
          availability = false;
          System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }
}

// 6. Car Rental System
class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double ratePerDay = 1500;

    CarRental() {
        this("Unknown", "Standard Car", 1);
    }

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double totalCost() {
        return rentalDays * ratePerDay;
    }

    void displayRental() {
        System.out.println("Customer: " + customerName + 
                           " | Car: " + carModel + 
                           " | Days: " + rentalDays + 
                           " | Total: " + totalCost());
    }
}


// -------------------------------------------------------------
// PART 2 — Instance vs Class Variables & Methods
// -------------------------------------------------------------

// 1. Product Inventory
class Product {
    String productName;
    double price;

    static int totalProducts = 0;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    void displayProduct() {
        System.out.println("Product: " + productName + " | Price: " + price);
    }

    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}

// 2. Online Course Management
class Course {
    String courseName;
    int duration;
    double fee;

    static String instituteName = "ABC Institute";

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourse() {
        System.out.println(courseName + " | " + duration + " months | Rs." + fee +
                " | Institute: " + instituteName);
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}

// 3. Vehicle Registration
class Vehicle {
    String ownerName;
    String vehicleType;

    static double registrationFee = 5000;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicle() {
        System.out.println("Owner: " + ownerName + " | Vehicle: " + vehicleType + 
                           " | Fee: Rs." + registrationFee);
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}


// -------------------------------------------------------------
// PART 3 — Access Modifiers
// -------------------------------------------------------------

// 1. University Management System
class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }
}

class PostgraduateStudent extends Student {
    PostgraduateStudent(int roll, String name, double CGPA) {
        super(roll, name, CGPA);
    }

    void displayPGStudent() {
        System.out.println("Roll: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
    }
}

// 2. Book Library System (Access Modifiers)
class BookLib {
    public String ISBN;
    protected String title;
    private String author;

    BookLib(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends BookLib {
    EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    void displayEBook() {
        System.out.println("ISBN: " + ISBN + " | Title: " + title + " | Author: " + getAuthor());
    }
}

// 3. Bank Account Management
class BankAccount {
    public long accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(long accNum, String accHolder, double balance) {
        this.accountNumber = accNum;
        this.accountHolder = accHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        this.balance = amount;
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(long accNum, String accHolder, double balance) {
        super(accNum, accHolder, balance);
    }

    void displaySA() {
        System.out.println("Acc No: " + accountNumber + 
                           " | Holder: " + accountHolder + 
                           " | Balance: " + getBalance());
    }
}

// 4. Employee Records
class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    Employee(int id, String dept, double salary) {
        this.employeeID = id;
        this.department = dept;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    Manager(int id, String dept, double salary) {
        super(id, dept, salary);
    }

    void displayManager() {
        System.out.println("Employee ID: " + employeeID + 
                           " | Department: " + department + 
                           " | Salary: " + getSalary());
    }
}

// -------------------------------------------------------------
// MAIN CLASS TO TEST EVERYTHING
// -------------------------------------------------------------

public class Main {
    public static void main(String[] args) {

        System.out.println("\n--- Testing Constructors Section ---");
        Book b1 = new Book();
        Book b2 = new Book("Java", "Gosling", 500);
        b1.displayBook();
        b2.displayBook();

        Circle c = new Circle(5);
        c.displayCircle();

        Person p1 = new Person("John", 22);
        Person p2 = new Person(p1);
        p2.displayPerson();

        HotelBooking hb = new HotelBooking("Alex", "Deluxe", 3);
        hb.displayBooking();

        LibraryBook lb = new LibraryBook("Python 101", "Guido", 300, true);
        lb.borrowBook();

        CarRental cr = new CarRental("Sam", "BMW", 4);
        cr.displayRental();


        System.out.println("\n--- Testing Class & Instance Variables ---");
        Product pr1 = new Product("Pen", 10);
        Product pr2 = new Product("Notebook", 50);
        pr1.displayProduct();
        pr2.displayProduct();
        Product.displayTotalProducts();

        Course c1 = new Course("Java", 3, 5000);
        c1.displayCourse();
        Course.updateInstituteName("XYZ Academy");
        c1.displayCourse();

        Vehicle v = new Vehicle("Rohan", "Car");
        v.displayVehicle();
        Vehicle.updateRegistrationFee(6000);
        v.displayVehicle();


        System.out.println("\n--- Testing Access Modifier Programs ---");
        PostgraduateStudent pg = new PostgraduateStudent(101, "Alice", 8.5);
        pg.displayPGStudent();

        EBook eb = new EBook("123-XYZ", "OOP Concepts", "John Doe");
        eb.displayEBook();

        SavingsAccount sa = new SavingsAccount(55555, "Rahul", 20000);
        sa.displaySA();

        Manager m = new Manager(1, "IT", 50000);
        m.displayManager();
    }
}