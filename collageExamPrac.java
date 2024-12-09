import org.w3c.dom.ls.LSOutput;

import java.awt.print.Book;
import java.sql.SQLOutput;
import java.util.Scanner;

//Write a program in Java to find minimum of three numbers using conditional operator...
//public class collageExamPrac {
//    public static void main(String[] args) {
//        int a = 30, b = 12, c = 2;
//        if (a > b && a > c)
//        {
//            System.out.println(a);
//            if (b > a && b > c)
//            {
//                System.out.println(b);
//            }
//            if (c > a && c > b)
//            {
//                System.out.println(c);
//            }
//        }
//    }
//}
//
//
// public class collageExamPrac {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("ENTER FIRST NNUMBER: ");
//        int first = input.nextInt();
//
//        System.out.println("ENTER SECOND NNUMBER: ");
//        int second = input.nextInt();
//
//        System.out.println("ENTER THIRD NNUMBER: ");
//        int third = input.nextInt();
//
//        System.out.println("ENTER FOURTH NNUMBER: ");
//        int fourth = input.nextInt();
//
//        int maxNumber = first;
//
//        if (second > maxNumber)
//        {
//            maxNumber = second;
//        }
//        if (third> maxNumber)
//        {
//            maxNumber = third;
//        }
//        if (fourth > maxNumber) {
//            maxNumber = fourth;
//        }
//        System.out.println("MAX NUMBER IS: " + maxNumber);
//    }
//
//}

//public class collageExamPrac {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("CHOOSE AN GIVEN OPERATION ");
//        System.out.println("1.ADDITION");
//        System.out.println("2.SUBTARACTION");
//        System.out.print("ENTER YOUR CHOICE: ");
//        int choice = input.nextInt();
//
//        System.out.println("ENTER FIRST NUMBER: ");
//        double Num1 = input.nextDouble();
//
//        System.out.println("ENTER SECOND NUMBER: ");
//        double Num2 = input.nextDouble();
//
//        double result = 0;
//
//        switch (choice)
//        {
//            case 1:
//                result = Num1 +Num2;
//                System.out.println("ADDITION IS "+result);
//                break;
//            case 2:
//                result = Num1 - Num2;
//                System.out.println("SUBTRACTION IS IS "+result);
//                break;
//            default:
//                System.out.println("INVALID TRY AGAIN");
//                break;
//        }
//    }
//}

//public class collageExamPrac {
//    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 10; i<=20; i++)
//        {
//            sum += i;
//        }
//        System.out.println("sum "+sum);
//        int sum = 0;
//        int i = 10;
//        while (i <= 20)
//        {
//            sum += i;
//            i++;
//        }
//        System.out.println("sum "+sum);
//        int sum = 0;
//        int i = 10;
//        do {
//            sum+= i;
//            i++;
//        }while (i<=20);
//        System.out.println("sum "+sum);
//    }
//}

//class Student{
//        String name;
//        int age;
//
//    void getDetails()
//    {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("enter name: ");
//        name = input.nextLine();
//
//        System.out.println("enter age: ");
//        age = input.nextInt();
//    }
//    void displayDetails()
//    {
//        System.out.println("NAME "+ name);
//        System.out.println("AGE: "+ age);
//    }
//}
//
//public class collageExamPrac {
//    public static void main(String[] args) {
//        Student student1 = new Student();
//        Student student2 = new Student();
//        Student student3 = new Student();
//
//        System.out.println("enter details for student1: ");
//        student1.getDetails();
//
//        System.out.println("enter details for student2: ");
//        student2.getDetails();
//
//        System.out.println("enter details for student3: ");
//        student3.getDetails();
//
//        System.out.println("\n details of student1: ");
//        student1.displayDetails();
//
//        System.out.println("\n details of student2: ");
//        student2.displayDetails();
//
//        System.out.println("\n details of student3: ");
//        student3.displayDetails();
//    }
//}

//class Books
//{
//    String BookName;
//    String Author;
//    double price;
//
//    void Getdetails()
//    {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("ENTER BOOK NAME: ");
//        BookName = input.nextLine();
//
//        System.out.println("ENTER AUTHOR NAME: ");
//        Author = input.nextLine();
//
//        System.out.println("ENTER PRICE: ");
//        price = input.nextDouble();
//    }
//
//    void DisplayDetails()
//    {
//        System.out.println("BOOK NAME IS: " + BookName);
//        System.out.println("AUTHOR NAME IS: " + Author);
//        System.out.println("PRICE IS: " + price);
//    }
//}
//
//public class collageExamPrac {
//    public static void main(String[] args) {
//        Books detailsOfBook1 = new Books();
//        Books detailsOfBook2 = new Books();
//        Books detailsOfBook3 = new Books();
//
//        System.out.println("enter details for book1: ");
//        detailsOfBook1.Getdetails();
//
//        System.out.println("enter details for book2: ");
//        detailsOfBook2.Getdetails();
//
//        System.out.println("enter details for book3: ");
//        detailsOfBook3.Getdetails();
//
//        System.out.println("details of book1: ");
//        detailsOfBook1.DisplayDetails();
//
//        System.out.println("details of book2: ");
//        detailsOfBook2.DisplayDetails();
//
//        System.out.println("details of book3: ");
//        detailsOfBook3.DisplayDetails();
//    }
//}

//class Student {
//    // Instance variables
//    String name;
//    int age;
//
//    // Default constructor
//    Student() {
//        this.name = "Unknown";
//        this.age = 0;
//    }
//
//    // Parameterized constructor
//    Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    // Copy constructor
//    Student(Student otherStudent) {
//        this.name = otherStudent.name;
//        this.age = otherStudent.age;
//    }
//
//    // Method to display the details
//    void displayDetails() {
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//    }
//}
//
//public class collageExamPrac {
//    public static void main(String[] args) {
//        // Create object using default constructor
//        Student student1 = new Student();
//
//        // Create object using parameterized constructor
//        Student student2 = new Student("Alice", 20);
//
//        // Create object using copy constructor
//        Student student3 = new Student(student2);
//
//        // Display details for each student
//        System.out.println("Details of Student 1 (Default Constructor):");
//        student1.displayDetails();
//
//        System.out.println("\nDetails of Student 2 (Parameterized Constructor):");
//        student2.displayDetails();
//
//        System.out.println("\nDetails of Student 3 (Copy Constructor):");
//        student3.displayDetails();
//    }
//}

//Create a Calculator class to add two int and to add two floats. Use method overloading

//public class collageExamPrac {
//    int add(int a, int b)
//    {
//        return a + b;
//    }
//    float add(float a, float b)
//    {
//        return a + b;
//    }
//
//    public static void main(String[] args) {
//        collageExamPrac claculate = new collageExamPrac();
//
//        int sumInt = claculate.add(12,45);
//        float sumFloat = claculate.add(2.4f, 43.4f);
//
//        System.out.println("sum of integer: " + sumInt);
//        System.out.println("sum of float: " + sumFloat);
//    }
//}

//Write a java program to define a class, define instance methods and overload them and use
//them for dynamic method invocation

//class shape
//{
//    public double area(double length, double width)
//    {
//        return length * width;
//    }
//    public double area(double side)
//    {
//        return side * side;
//    }
//    public double area(double redius, boolean IsCircle)
//    {
//        return Math.PI * redius * redius;
//    }
//}
//
//public class collageExamPrac{
//    public static void main(String[] args) {
//        shape calculate = new shape();
//
//        double rectAngle = calculate.area(32,3);
//        double square = calculate.area(4);
//        double circle = calculate.area(3,true);
//
//        System.out.println("rectangle: " + rectAngle);
//        System.out.println("square: " + square);
//        System.out.println("circle: " + circle);
//    }
//}

//Write a calculator program to add, subtract, multiply and division of two integers, two floats and
//twodouble number using method overloading and static methods

//public class collageExamPrac
//{
//    public static int add(int a, int b)
//    {
//        return a + b;
//    }
//    public static float add(float a, float b)
//    {
//        return a + b;
//    }
//    public static double add(double a, double b)
//    {
//        return a + b;
//    }
//
//    //subtraction...
//    public static int sub (int a, int b)
//    {
//        return a - b;
//    }
//    public static float sub (float a, float b)
//    {
//        return a - b;
//    }
//    public static double sub (double a, double b)
//    {
//        return a - b;
//    }
//
//    //multiplication...
//    public static int mul (int a, int b)
//    {
//        return a * b;
//    }
//    public static float mul (float a, float b)
//    {
//        return a * b;
//    }
//    public static double mul (double a, double b)
//    {
//        return a * b;
//    }
//
//    //division...
//    public static int div (int a, int b)
//    {
//        if (b != 0)
//        {
//            return a / b;
//        }
//        else
//            return -1;
//    }
//    public static float div (float a, float b)
//    {
//        if (b != 0)
//        {
//            return a / b;
//        }
//        else
//            return -1;
//    }
//    public static double div (double a, double b)
//    {
//        if (b != 0)
//        {
//            return a / b;
//        }
//        else
//            return -1;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("int addition: " + add(10,20));
//        System.out.println("int subtraction: " + sub(10,20));
//        System.out.println("int multiplication: " + mul(10,20));
//        System.out.println("int div: " + div(10,20));
//
//        System.out.println("float addition: " + add(10.4f,20.5f));
//        System.out.println("float subtraction: " + sub(10.5f,20.5f));
//        System.out.println("float multiplication: " + mul(10.5f,20.5f));
//        System.out.println("float div: " + div(10.5f,20.5f));
//
//        System.out.println("double addition: " + add(10.4,20.5));
//        System.out.println("double subtraction: " + sub(10.5,20.6));
//        System.out.println("double multiplication: " + mul(10.5,20.5));
//        System.out.println("double div: " + div(10.5,20.5));
//    }
//}

//QUESTION NO 4....
// Create a class called ‘Travel” having members (cutomer_name, to_city,
//from_city, distance(in kilometer)). “Travel” class has following methods.
//        a. get_detail() : Accept all the value from the user.
//        b. convert() : to convert kilometers into mile.
//        (Formula - miles = (0.6213711922 * km))
//        c. convert(km) : to convert kilometer into meter.
//        (Formula – meter=(km * 1000))
//        d. put_details() : Display all details such as customer_name,
//        to_city,
//        from_city, distance_in_km, distance_in_meter,
//distance_in_miles in java in simple code

//class Travel{
//    private String customer_name;
//    private String To_city;
//    private String From_city;
//    private double Distance_KM;
//    private double Distance_meter;
//    private double Distance_miles;
//
//    public void get_details() {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("ENTER CUSTOMER NAME: ");
//        customer_name = input.nextLine();
//
//        System.out.println("ENTER CITY TO: ");
//        To_city = input.nextLine();
//
//        System.out.println("ENTER CITY FROM: ");
//        From_city = input.nextLine();
//
//        System.out.println("ENTER DISTANCE IN (KILOMETER): ");
//        Distance_KM = input.nextDouble();
//    }
//
//        public void convert()
//        {
//            Distance_miles = (0.6213711922 * Distance_KM);
//        }
//
//        public void convert2() {
//            Distance_meter = 1000 * Distance_KM;
//        }
//
//        public void put_details()
//        {
//            System.out.println("\ntravel details:");
//            System.out.println("CUSTOMER NAME: " + customer_name);
//            System.out.println("CITY FROM: " + From_city);
//            System.out.println("CITY TO: " + To_city);
//            System.out.println("DISTANCE IN KM: " + Distance_KM);
//            System.out.println("DISTANCE IN MILES " + Distance_miles);
//            System.out.println("DISTANCE IN METER: " + Distance_meter);
//        }
//
//    public static void main(String[] args) {
//        Travel travel = new Travel();
//
//        travel.get_details();
//
//        travel.convert();
//        travel.convert2();
//        travel.put_details();
//    }
//
//}

//QUESTION NO 5....
//Create a class called ‘tour” having members (cutomer_name, to_city,
//                                             from_city, status). Set “inactive” as a default value of status. “tour”
//class has following methods.
//        a. get_detail() : Accept all the value from the user.
//        b. change_status() : to change status to active from inactive.
//        c. put_details() : Display all details such as customer_name,
//        to_city,
//from_city, status.

import java.util.Scanner;

//class Tour {
//    // Members of the class
//    private String customer_name;
//    private String to_city;
//    private String from_city;
//    private String status;
//
//    // Constructor to set default value for status
//    public Tour() {
//        this.status = "inactive";
//    }
//
//    // Method to accept details from the user
//    public void get_detail() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter customer name: ");
//        this.customer_name = scanner.nextLine();
//
//        System.out.print("Enter the city you are traveling to: ");
//        this.to_city = scanner.nextLine();
//
//        System.out.print("Enter the city you are traveling from: ");
//        this.from_city = scanner.nextLine();
//    }
//
//    // Method to change status from inactive to active
//    public void change_status() {
//        this.status = "active";
//    }
//
//    // Method to display all details
//    public void put_details() {
//        System.out.println("Customer Name: " + this.customer_name);
//        System.out.println("To City: " + this.to_city);
//        System.out.println("From City: " + this.from_city);
//        System.out.println("Status: " + this.status);
//    }
//
//    // Main method to test the Tour class
//    public static void main(String[] args) {
//        Tour tour = new Tour(); // Create a new Tour object
//        tour.get_detail();      // Get details from the user
//        tour.put_details();     // Display the details
//
//        tour.change_status();   // Change status to active
//        System.out.println("\nAfter changing status:");
//        tour.put_details();     // Display the details again with updated status
//    }
//}


//QUESTION 6...
//Create a class called “area ”. Create following methods in class.
//        a. area() : Calculate area of square. (formula : A=a*a)
//        b. area(int r) : Calculate area of circle. Formula : 3.14*r*r)
//        c. Disp_res() : display result of area of square and circle.

//class Area
//{
//    private int area_Square;
//    private double area_Circle;
//
//    public void Area(int side)
//    {
//        area_Square = side * side;
//    }
//
//    public void Area(double radius)
//    {
//        area_Circle = Math.PI * radius * radius;
//    }
//
//    public void dips()
//    {
//        System.out.println("area of square: " + area_Square);
//        System.out.println("area of circle: " + area_Circle);
//    }
//
//    public static void main(String[] args) {
//        Area area = new Area();
//
//        area.Area(4);
//
//        area.Area(7.0);
//
//        area.dips();
//    }
//}





