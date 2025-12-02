import java.util.*;

// ===============================================================
//               ASSISTED PROBLEM 1: LIBRARY (Aggregation)
// ===============================================================
class A1_Book {
    String title;
    String author;

    A1_Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class A1_Library {
    String name;
    ArrayList<A1_Book> books = new ArrayList<>();

    A1_Library(String name) {
        this.name = name;
    }

    void addBook(A1_Book b) {
        books.add(b);
    }

    void showBooks() {
        System.out.println("Library: " + name);
        for (A1_Book b : books)
            System.out.println("  " + b.title + " by " + b.author);
    }
}

// ===============================================================
//        ASSISTED PROBLEM 2: BANK–CUSTOMER (Association)
// ===============================================================
class A2_Account {
    int accNo;
    double balance;

    A2_Account(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }
}

class A2_Bank {
    String name;
    A2_Bank(String name) { this.name = name; }

    A2_Account openAccount(int accNo, double initialDeposit) {
        return new A2_Account(accNo, initialDeposit);
    }
}

class A2_Customer {
    String name;
    ArrayList<A2_Account> accounts = new ArrayList<>();

    A2_Customer(String name) {
        this.name = name;
    }

    void addAccount(A2_Account acc) {
        accounts.add(acc);
    }

    void viewBalance() {
        System.out.println("Customer: " + name);
        for (A2_Account a : accounts)
            System.out.println("  Account " + a.accNo + ": " + a.balance);
    }
}

// ===============================================================
//        ASSISTED PROBLEM 3: COMPANY (Composition)
// ===============================================================
class A3_Employee {
    String name;

    A3_Employee(String name) {
        this.name = name;
    }
}

class A3_Department {
    String deptName;
    ArrayList<A3_Employee> employees = new ArrayList<>();

    A3_Department(String deptName) {
        this.deptName = deptName;
    }

    void addEmployee(A3_Employee e) {
        employees.add(e);
    }
}

class A3_Company {
    String name;
    ArrayList<A3_Department> departments = new ArrayList<>();

    A3_Company(String name) {
        this.name = name;
    }

    void addDepartment(A3_Department d) {
        departments.add(d);
    }

    void deleteCompany() {
        departments.clear();  // employees also deleted
        System.out.println("Company " + name + " deleted with all departments.");
    }
}

// ===============================================================
//           SELF PROBLEM 1: SCHOOL–STUDENTS–COURSES
// ===============================================================
class S1_Course {
    String name;
    ArrayList<S1_Student> students = new ArrayList<>();

    S1_Course(String name) { this.name = name; }

    void addStudent(S1_Student s) {
        students.add(s);
    }
}

class S1_Student {
    String name;
    ArrayList<S1_Course> courses = new ArrayList<>();

    S1_Student(String name) { this.name = name; }

    void enroll(S1_Course c) {
        courses.add(c);
        c.addStudent(this);
    }

    void showCourses() {
        System.out.println(name + " enrolled in:");
        for (S1_Course c : courses)
            System.out.println("  " + c.name);
    }
}

class S1_School {
    String name;
    ArrayList<S1_Student> students = new ArrayList<>();

    S1_School(String name) { this.name = name; }

    void addStudent(S1_Student s) { students.add(s); }
}

// ===============================================================
//       SELF PROBLEM 2: UNIVERSITY, DEPARTMENTS, FACULTY
// ===============================================================
class S2_Faculty {
    String name;
    S2_Faculty(String name) { this.name = name; }
}

class S2_Department {
    String name;

    S2_Department(String name) { this.name = name; }
}

class S2_University {
    String name;
    ArrayList<S2_Department> departments = new ArrayList<>();
    ArrayList<S2_Faculty> faculty = new ArrayList<>();

    S2_University(String name) { this.name = name; }

    void addDepartment(S2_Department d) { departments.add(d); }
    void addFaculty(S2_Faculty f) { faculty.add(f); }

    void deleteUniversity() {
        departments.clear(); // composition
        System.out.println("University " + name + " deleted.");
    }
}

// ===============================================================
//            SELF PROBLEM 3: HOSPITAL–DOCTORS–PATIENTS
// ===============================================================
class S3_Patient {
    String name;
    S3_Patient(String name) { this.name = name; }
}

class S3_Doctor {
    String name;

    S3_Doctor(String name) { this.name = name; }

    void consult(S3_Patient p) {
        System.out.println("Doctor " + name + " is consulting patient " + p.name);
    }
}

class S3_Hospital {
    String name;
    ArrayList<S3_Doctor> doctors = new ArrayList<>();
    ArrayList<S3_Patient> patients = new ArrayList<>();

    S3_Hospital(String name) { this.name = name; }

    void addDoctor(S3_Doctor d) { doctors.add(d); }
    void addPatient(S3_Patient p) { patients.add(p); }
}

// ===============================================================
//      SELF PROBLEM 4: E-COMMERCE (Order, Customer, Products)
// ===============================================================
class S4_Product {
    String name;
    double price;

    S4_Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class S4_Order {
    int orderId;
    ArrayList<S4_Product> products = new ArrayList<>();

    S4_Order(int id) { this.orderId = id; }

    void addProduct(S4_Product p) { products.add(p); }
}

class S4_Customer {
    String name;

    S4_Customer(String name) { this.name = name; }

    S4_Order placeOrder(int id) {
        return new S4_Order(id);
    }
}

// ===============================================================
// SELF PROBLEM 5: UNIVERSITY MANAGEMENT SYSTEM
// ===============================================================
class S5_Professor {
    String name;
    S5_Professor(String name) { this.name = name; }
}

class S5_Course {
    String name;
    S5_Professor professor;
    ArrayList<S5_Student> students = new ArrayList<>();

    S5_Course(String name) { this.name = name; }

    void assignProfessor(S5_Professor p) {
        this.professor = p;
    }

    void addStudent(S5_Student s) { students.add(s); }
}

class S5_Student {
    String name;
    ArrayList<S5_Course> courses = new ArrayList<>();

    S5_Student(String name) { this.name = name; }

    void enrollCourse(S5_Course c) {
        courses.add(c);
        c.addStudent(this);
    }
}

// ===============================================================
//                         MAIN CLASS
// ===============================================================
public class AllOOPRelationships {
    public static void main(String[] args) {

        System.out.println("===== Assisted Problem 1: Library (Aggregation) =====");
        A1_Book b1 = new A1_Book("Java", "James Gosling");
        A1_Book b2 = new A1_Book("Python", "Guido van Rossum");

        A1_Library lib = new A1_Library("City Library");
        lib.addBook(b1);
        lib.addBook(b2);
        lib.showBooks();

        System.out.println("\n===== Assisted Problem 2: Bank (Association) =====");
        A2_Bank bank = new A2_Bank("SBI");
        A2_Customer cust = new A2_Customer("Arjun");

        A2_Account acc1 = bank.openAccount(101, 5000);
        cust.addAccount(acc1);
        cust.viewBalance();

        System.out.println("\n===== Assisted Problem 3: Company (Composition) =====");
        A3_Company comp = new A3_Company("Infosys");
        A3_Department d1 = new A3_Department("IT");
        d1.addEmployee(new A3_Employee("John"));
        comp.addDepartment(d1);
        comp.deleteCompany();

        System.out.println("\n===== Self Problem 1: School (Aggregation + Association) =====");
        S1_School school = new S1_School("Green Valley School");
        S1_Student s1 = new S1_Student("Rita");
        S1_Course c1 = new S1_Course("Maths");
        s1.enroll(c1);
        school.addStudent(s1);
        s1.showCourses();

        System.out.println("\n===== Self Problem 2: University (Composition + Aggregation) =====");
        S2_University uni = new S2_University("Oxford");
        uni.addDepartment(new S2_Department("Science"));
        uni.addFaculty(new S2_Faculty("Dr. Smith"));
        uni.deleteUniversity();

        System.out.println("\n===== Self Problem 3: Hospital (Association) =====");
        S3_Hospital hospital = new S3_Hospital("City Hospital");
        S3_Doctor doc = new S3_Doctor("Dr. Rahul");
        S3_Patient pat = new S3_Patient("Meena");
        hospital.addDoctor(doc);
        hospital.addPatient(pat);
        doc.consult(pat);

        System.out.println("\n===== Self Problem 4: E-commerce (Aggregation) =====");
        S4_Customer ecust = new S4_Customer("Karan");
        S4_Order order = ecust.placeOrder(1);
        order.addProduct(new S4_Product("Laptop", 50000));
        order.addProduct(new S4_Product("Mouse", 500));

        System.out.println("Order placed with ID: " + order.orderId);

        System.out.println("\n===== Self Problem 5: University Management =====");
        S5_Student st = new S5_Student("Anjali");
        S5_Course co = new S5_Course("Physics");
        S5_Professor prof = new S5_Professor("Dr. Einstein");
        co.assignProfessor(prof);
        st.enrollCourse(co);
        System.out.println(st.name + " enrolled in course taught by " + co.professor.name);
    }
}
