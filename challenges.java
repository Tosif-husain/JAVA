//import java.util.Scanner;
//
//public class challenges {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("ENTER NUMBER TO CHECK: ");
//        int num = sc.nextInt();
//        if (num < 0)
//        {
//            System.out.print("number is negative");
//        }
//        else if (num > 0)
//        {
//            System.out.print("number is positive");
//        }
//        else {
//            System.out.println("number is 0");
//        }
//    }
//}

//import java.util.Scanner;
//
//public class challenges{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("CHECK THE NUMBER IS EVEN OR ODD");
//        System.out.printf("ENTER THE NUMBER TO CHECK EVEN OR ODD: ");
//        int num = sc.nextInt();
//        if (num % 2 != 0)
//        {
//            System.out.printf("NUMBER IS ODD");
//        }
//        else {
//            System.out.printf("NUMBER IS EVEN");
//        }
//    }
//
//}

// import java.util.Scanner;
//
//public class challenges{
//    public static void main(String[] args)
//    {
//        Scanner input = new Scanner(System.in);
//        System.out.println("FIND GRETEST NUMBER FROM USER: ");
//        System.out.printf("ENTER FIRST NUMER: ");
//        int first = input.nextInt();
//
//        System.out.printf("ENTER SECOND NUMBER: ");
//        int second = input.nextInt();
//
//        System.out.printf("ENTER THIRD NUMBER: ");
//        int third = input.nextInt();
//
//        if(first >= second && first >= third)
//        {
//            System.out.print(first+" IS GRETEST NUMBER");
//        }else if (second >= third) {
//            System.out.print(second +" IS THE GRETEST NUMBER");
//        }else
//        {
//            System.out.printf(third + " IS THE GRETEST NUMBER");
//        }
//    }
//}


//import java.util.Scanner;
//
//public class challenges{
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("CHECKING A LEAP YEAR:");
//        System.out.printf("PLS ENTER THE YEAR YOU WANT TO CHECK IT: ");
//        int year = input.nextInt();
//
//        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
//        {
//            System.out.printf("YOUR YEAR IS A LEAP YEAR");
//
//        } else {
//            System.out.printf("YOUR YEAR IS NOT A LEAP YEAR");
//        }
//    }
//}


//import java.util.Scanner;
//
//public class challenges{
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("CHECKING THR GRADE");
//        System.out.printf("PLS ENTER YOUR PERCENTAGE TO CHECK YOUR GARDE");
//        double grade = input.nextDouble();
//
//        if (grade > 90)
//        {
//            System.out.printf("YOUR GRADE IS A+ ");
//        } else if (grade > 75) {
//            System.out.printf("YOUR GRADE IS B+ ");
//        } else if (grade > 60) {
//            System.out.printf("YOUR GRADE IS C+ ");
//        } else if (grade > 30) {
//            System.out.printf("YOUR GRADE IS D+ ");
//        } else {
//            System.out.printf("YOU'RE FAIL ");
//        }
//    }
//}

//import java.util.Scanner;
//
//public class challenges{
//    public static void main(String[] args) {
//        int first = getNumber();
//        int second = getNumber();
//
//        int sum = first + second;
//        System.out.println("total: "+sum);
//
//    }
//
//public static int getNumber()
//{
//    Scanner input = new Scanner(System.in);
//    System.out.println("ENTER NUMBER: ");
//
//    int number = input.nextInt();
//
//    return number;
//}
//}

public class challenges {
    public static void main(String[] args) {
        int num = SumTwo(99,1);
        System.out.print(num);
    }
    public static int SumTwo(int first, int second)
    {
        int sum = first + second;

        return sum;
    }
}

