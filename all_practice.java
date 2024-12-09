//public class practice{
//    private int emp_id;
//    private String name;
//    private String designation;
//
//    public practice(int emp_id, String name, String designation){
//        this.emp_id = emp_id;
//        this.name = name;
//        this.designation = designation;
//    }
//
//    public void display(){
//        System.out.println("employee id: " + emp_id);
//        System.out.println("employee name: " + name);
//        System.out.println("employee designation: " + designation);
//    }
//
//    public static void main(String[] args) {
//        practice emp = new practice(4,"tosif","software devloper");
//
//        emp.display();
//    }
//}

//sum using method overloading...

//public class practice{
//    public int sum(int a, int b){
//        return a + b;
//    }
//    public double sum(double a, double b){
//        return a + b;
//    }
//    public double sum(double a, double b, double c){
//        return a + b + c;
//    }
//
//    public static void main(String[] args) {
//        practice prac = new practice();
//
//        System.out.println("sum " + prac.sum(2,4));
//        System.out.println("sum " + prac.sum(2.5,4.87));
//        System.out.println("sum " + prac.sum(2.76,4.54,5.34));
//    }
//}

//create a class called employee with data members e_id, e_name and e_designation define member function called get data
// and put data to access and display value of data member create another class called e_salary with data member salary
// define method get salary and put salary to access and display value of data member of this class e_salary class inherite employee class in java

// Base class Employee
//class Employee {
//    // Data members
//    int e_id;
//    String e_name;
//    String e_designation;
//
//    // Member function to get data
//    void getData(int id, String name, String designation) {
//        e_id = id;
//        e_name = name;
//        e_designation = designation;
//    }
//
//    // Member function to display data
//    void putData() {
//        System.out.println("Employee ID: " + e_id);
//        System.out.println("Employee Name: " + e_name);
//        System.out.println("Employee Designation: " + e_designation);
//    }
//}
//
//// Derived class E_Salary that inherits from Employee class
//class E_Salary extends Employee {
//    // Data member for salary
//    double salary;
//
//    // Member function to get salary
//    void getSalary(double sal) {
//        salary = sal;
//    }
//
//    // Member function to display salary
//    void putSalary() {
//        System.out.println("Employee Salary: " + salary);
//    }
//}
//
//public class practice {
//    public static void main(String[] args) {
//        // Creating an object of the E_Salary class
//        E_Salary emp = new E_Salary();
//
//        // Getting data for the employee
//        emp.getData(101, "John Doe", "Software Engineer");
//
//        // Getting salary for the employee
//        emp.getSalary(75000);
//
//        // Displaying the data
//        emp.putData();
//
//        // Displaying the salary
//        emp.putSalary();
//    }
//}

//QUESTION...
//create a class called account having data members c_id, c_name and account_number define get data method to access value
//        from user create another class called saving_account which inherite account class this class has data members
//        balance  and type_of_account define gatdata method to access value from user and also define display method to
//        display value of c_id, c_name, account_number, balance and type_of_account in java

//import java.util.Scanner;
//
//class Account {
//    // Data members
//    protected int c_id;
//    protected String c_name;
//    protected String account_number;
//
//    // Method to get data from the user
//    public void getData() {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter Customer ID: ");
//        c_id = sc.nextInt();
//        sc.nextLine();  // Consume the newline
//
//        System.out.print("Enter Customer Name: ");
//        c_name = sc.nextLine();
//
//        System.out.print("Enter Account Number: ");
//        account_number = sc.nextLine();
//    }
//}
//
//class SavingAccount extends Account {
//    // Additional data members
//    private double balance;
//    private String type_of_account;
//
//    // Method to get additional data from the user
//    @Override
//    public void getData() {
//        // Call the parent class's getData method
//        super.getData();
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter Balance: ");
//        balance = sc.nextDouble();
//        sc.nextLine();  // Consume the newline
//
//        System.out.print("Enter Type of Account: ");
//        type_of_account = sc.nextLine();
//    }
//
//    // Method to display all details
//    public void display() {
//        System.out.println("Customer ID: " + c_id);
//        System.out.println("Customer Name: " + c_name);
//        System.out.println("Account Number: " + account_number);
//        System.out.println("Balance: " + balance);
//        System.out.println("Type of Account: " + type_of_account);
//    }
//}
//
//public class practice {
//    public static void main(String[] args) {
//        // Create an object of SavingAccount class
//        SavingAccount sa = new SavingAccount();
//
//        // Get data from the user
//        sa.getData();
//
//        // Display the data
//        sa.display();
//    }
//}

//QUESTION...
//write a program to perform following class: 1.student have data members r_no, name function: get data and put data
//2. marks inherite student data member m1,m2,m3 function: get marks and put marks in java

//import java.util.Scanner;
//
//class student {
//   protected int r_no;
//   protected String name;
//
//    public void get_data(){
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("enter roll number: ");
//        r_no = input.nextInt();
//        input.nextLine();
//
//        System.out.print("enter name: ");
//        name = input.nextLine();
//    }
//
//   public void put_data(){
//        System.out.println("roll number: " + r_no);
//        System.out.println("name: " + name);
//    }
//}
//
//class marks extends student{
//   private int subject1,subject2,subject3;
//
//   public void get_marks() {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("enter marks for subject1: ");
//       subject1 = input.nextInt();
//        System.out.println("enter marks for subject2: ");
//       subject2 = input.nextInt();
//        System.out.println("enter marks for subject3: ");
//       subject3 = input.nextInt();
//    }
//
//   public void put_marks() {
//        System.out.println("marks of subject1: " + subject1);
//        System.out.println("marks of subject2: " + subject2);
//        System.out.println("marks of subject3: " + subject3);
//    }
//}
//
//public class practice {
//    public static void main(String[] args) {
//        marks sc = new marks();
//
//        sc.get_data();
//        sc.get_marks();
//
//        sc.put_data();
//        sc.put_marks();
//    }
//}

// // method overriding with example....

// // Superclass
// class Animal {
//    // Method to be overridden
//    void sound() {
//        System.out.println("The animal makes a sound");
//    }
// }

// // Subclass
// class Dog extends Animal {
//    // Overriding the sound method
//    @Override
//    void sound() {
//        System.out.println("The dog barks");
//    }
// }

// // Another Subclass
// class Cat extends Animal {
//    // Overriding the sound method
//    @Override
//    void sound() {
//        System.out.println("The cat meows");
//    }
// }

// public class practice {
//    public static void main(String[] args) {
//        Animal myAnimal = new Animal(); // Create an Animal object
//        Animal myDog = new Dog();       // Create a Dog object
//        Animal myCat = new Cat();       // Create a Cat object

//        myAnimal.sound(); // Calls Animal's sound method
//        myDog.sound();    // Calls Dog's sound method
//        myCat.sound();    // Calls Cat's sound method
//    }
// }

//final method with example in java...

//class vehical {
//    final void startEngine() {
//        System.out.println("engine is starting...");
//    }
//}
//class car extends vehical {
//    void showDetails() {
//        System.out.println("this is car");
//    }
//}
//
//public class practice {
//    public static void main(String[] args) {
//        vehical Myvehical = new vehical();
//        Myvehical.startEngine();
//
//        car MyCar = new car();
//        MyCar.startEngine();
//        MyCar.showDetails();
//    }
//}

//write a java program to create a class name as bank_account with method called deposite and withdraw, create  sub class
// called saving_account that overrides withdraw methods to prevent withdrawls if account balance falls below 100.

// Superclass
//class BankAccount {
//    protected double balance;
//
//    public BankAccount(double initialBalance) {
//        balance = initialBalance;
//    }
//
//    // Method to deposit money into the account
//    public void deposit(double amount) {
//        balance += amount;
//        System.out.println("Deposited: $" + amount);
//    }
//
//    // Method to withdraw money from the account
//    public void withdraw(double amount) {
//        if (amount <= balance) {
//            balance -= amount;
//            System.out.println("Withdrawn: $" + amount);
//        } else {
//            System.out.println("Insufficient balance.");
//        }
//    }
//
//    // Method to check the current balance
//    public double getBalance() {
//        return balance;
//    }
//}
//
//// Subclass
//class SavingsAccount extends BankAccount {
//
//    public SavingsAccount(double initialBalance) {
//        super(initialBalance);
//    }
//
//    // Overriding the withdraw method to prevent balance from falling below $100...
//    @Override
//    public void withdraw(double amount) {
//        if (balance - amount >= 100) {
//            super.withdraw(amount);
//        } else {
//            System.out.println("Cannot withdraw: Balance would fall below $100.");
//        }
//    }
//}
//
//// Main class to test the functionality
//public class practice {
//    public static void main(String[] args) {
//        SavingsAccount savingsAccount = new SavingsAccount(500);
//        savingsAccount.deposit(200);
//        savingsAccount.withdraw(550); // Should fail
//        savingsAccount.withdraw(300); // Should succeed
//        System.out.println("Savings Account Balance: $" + savingsAccount.getBalance());
//    }
//}

//import java.util.Scanner;
//
//class collage {
//    int id,Student_Id;
//    String collage_name,course_name,student_name;
//
//     collage(int student_Id, String student_name){
//        this.Student_Id = student_Id;
//        this.student_name = student_name;
//    }
//    Scanner input = new Scanner(System.in);
//    public void get_data() {
//
//        System.out.println("full fill below details: ");
//        System.out.println("enter collage name: ");
//        collage_name = input.nextLine();
//        System.out.println("enter course name: ");
//        course_name = input.nextLine();
//        System.out.println("enter id: ");
//        id = input.nextInt();
//        System.out.println("enter student id: ");
//        Student_Id = input.nextInt();
//    }
//
//    public void display() {
//        System.out.println("details......");
//        System.out.println("collage name: " + collage_name);
//        System.out.println("course name: " + course_name);
//        System.out.println("id: " + id);
//        System.out.println("student id: " + Student_Id);
//    }
//        }
//
//        public class practice {
//            public static void main(String[] args) {
//                collage c1 = new collage(1, "tosif");
//                collage c2 = new collage(2, "arman");
//                collage c3 = new collage(3, "yasin");
//
//                c1.get_data();
//                c1.display();
//
//                c2.get_data();
//                c2.display();
//
//                c3.get_data();
//                c3.display();
//            }
//}

//method overloading.....

//public class practice {
//    public int add(int a, int b) {
//        return a+b;
//    }
//    public int add(int a, int b, int c) {
//        return a+b+c;
//    }
//    public double add(double a, double b) {
//        return a+b;
//    }
//    void display() {
//        System.out.println("total(int): " + add(5,7));
//        System.out.println("total(int): " + add(5,7, 7));
//        System.out.println("total(int): " + add(5.7,7.6));
//    }
//
//    public static void main(String[] args) {
//        practice total = new practice();
//
//        total.display();
//    }
//}
//method over ridding is the method to overridden a sub class same as it's
//super class it's called...

//class Animal {
//    public void sound(){
//        System.out.println("animal sound ");
//    }
//}
//class dog extends Animal {
//    @Override
//    public void sound() {
//        System.out.println("dog");
//    }
//}
//class cat extends Animal {
//    @Override
//    public void sound() {
//        System.out.println("cat");
//    }
//}
//
//public class practice {
//    public static void main(String[] args) {
//        Animal myAnimal = new Animal();
//        Animal myDog = new dog();
//        Animal myCat = new cat();
//
//        myAnimal.sound();
//        myDog.sound();
//        myCat.sound();
//    }
//}

//constructor...
//class Constructor{
//    String name;
//    int age;
//    public Constructor() {
//        this.name = "arman";
//        this.age = 19;
//    }
//    public Constructor(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//    public Constructor(Constructor cons) {
//        this.name = cons.name;
//        this.age = cons.age;
//    }
//    void display() {
//        System.out.println("name: " + name + ", age: " + age);
//    }
//}
//public class practice {
//    public static void main(String[] args) {
//
//    Constructor Default = new Constructor();
//    Constructor parameter = new Constructor("tosif",20);
//    Constructor copy = new Constructor(parameter);
//
//    Default.display();
//    parameter.display();
//    copy.display();
//    }
//}

//final method...
//class Car {
//    public final void display() {
//        System.out.println("this is car");
//    }
//}
//class bike extends Car {
////    public void display() {
////        System.out.println("this is bike");
////    }
//}
//public class practice {
//    public static void main(String[] args) {
//        Car car = new Car();
//        car.display();//output:  this is car
//
//        bike bi = new bike();
//        bi.display();//output:  this is car
//    }
//}

//EXCEPTION....

//public class practice {
//    public static void main(String[] args) {
//        int[] marks = {56,76,87};
//        try {
//            System.out.println(marks[5]);
//        }
//        catch (Exception exception) {
//
//        }
//        System.out.println("hello");
//    }
//}

//public class practice {
//    public static void main(String[] args) {
//       String[] Charcter = {"M","A","N","T","S","H","A"};
//       int index = 0;
//       while(index < 7) {
//           System.out.print(Charcter[index]);
//           index++;
//       }
//    }
//}

//ARRAY SEARCHING...

//import java.util.Scanner;
//
//public class practice {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int[] arr = {2,45,6,5,75,45,43,21,23,43};
//        System.out.println("PLS ENTER ANY NUMBER: ");
//        int num = input.nextInt();
//        boolean isFound = isFound(arr,num);
//        if (isFound) {
//            System.out.println("found");
//        }else {
//            System.out.println("not found");
//        }
//    }
//    public static boolean isFound(int[] arr, int num) {
//        int index = 0;
//        while(index < arr.length) {
//            if (arr[index] == num) {
//                return true;
//            }
//            index++;
//        }
//        return false;
//    }
//}







