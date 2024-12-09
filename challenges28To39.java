//CHALLENGE NUMBER 28...

//import java.util.Scanner;
//
//public class challenges28To39{
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("PLS ENTER NUMBER ");
//        int multiplication = input.nextInt();
//        MultiplicationTwoNumber(multiplication);
//
//    }
//    public static void MultiplicationTwoNumber(int num)
//    {
////        int i = 1;
////        while(i <= 10)
////        {
////            System.out.println(num + " X " + i + " = " + (num * i));
////            i++;
////        }
//        for (int i = 1; i <= 10; i++)
//        {
//            System.out.println(num + " X " + i + " = " + (num * i));
//        }
//    }
//}

//CHALLENGE NUMBER 29...

//import java.util.Scanner;
//
//public class challenges28To39{
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.printf("PLS ENTER NUMBER: ");
//        int num = input.nextInt();
//        int sum = oddSum(num);
//        System.out.println("OddSum till " + num + " is " + sum);
//
//    }
//
//    public static int oddSum(int num)
//    {
//        int sum = 0;
//        int i = 1;
//        while(i <= num)
//        {
//            sum += i;
//            i += 2;
//        }
//        return sum;
//    }
//}

//CHALLENGE NUMBER 30...

//import java.util.Scanner;
//
//public class challenges28To39 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.printf("PLS ENTER NUMBER: ");
//        int num = input.nextInt();
//        long fact = factorial(num);
//        System.out.printf("factorial is: " + fact);
//    }
//
//    public static long factorial(int num)
//    {
//     if (num < 2)
//     {
//         return 1;
//     }
//     long fact = 1;
//     int i = 2;
//     while(i <= num)
//     {
//       fact *= i;
//       i++;
//     }
//        return fact;
//    }
//}

//CHALLENGE NUMBER 31...

//import java.util.Scanner;
//
//public class challenges28To39 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.printf("PLS ENTER NUMBER FOR DIGITS: ");
//        int num = input.nextInt();
//        int sum = SumOfDigits(num);
//        System.out.printf("sum of digits: " + sum);
//    }
//    public static int SumOfDigits(int num)
//    {
//      int sum = 0;
//      while(num > 0)
//      {
//          sum += num % 10;
//          num /= 10;
//      }
//      return sum;
//    }
//}

//CHALLENGE NUMBER 32...

//import java.util.Scanner;
//
//public class challenges28To39 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("PROGRAM OF LCM ");
//        System.out.print("PLS ENTER FIRST NUMBER: ");
//        int first = input.nextInt();
//        System.out.print("PLS ENTER SECOND NUMBER: ");
//        int second = input.nextInt();
//
//        int lcm = lcm(first,second);
//        System.out.println("LCM OF YOUR TWO NUMBER IS: " + lcm);
//    }
//    public static int lcm(int first, int second) {
//
//        // FIRST TRICK TO RUN CODE...
//        int i = 1;
//        while (true) {
//            int factor = first * i;
//            if (factor % second == 0) {
//                return factor;
//            }
//            i++;
//        }

        // SECOND TRICK TO RUN CODE...
//        for (int i = 1; i <= second; i++)
//        {
//            int factor = first * i;
//            if (factor % second == 0)
//            {
//                return factor;
//            }
//        }
//        return 0; //UNREACHABLE...

//    }
//}

//CHALLENGE NUMBER 33...

//import java.util.Scanner;
//
//public class challenges28To39 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("PROGRAM OF GCD");
//        System.out.print("enter first number: ");
//        int first = input.nextInt();
//
//        System.out.print("enter second number: ");
//        int second = input.nextInt();
//
//        int gcd = gcd(first, second);
//        System.out.print("GCD OF 2 NUMBERS IS: " + gcd);
//
//    }
//    public static int gcd(int num1, int num2)
//    {
//       int gcd = 1;
//       int least = least(num1, num2);
//       for (int i = 2; i <= least; i++)
//       {
//         if (num1 % i == 0 && num2 % i == 0)
//         {
//             gcd = i;
//         }
//       }
//
//       return gcd;
//    }
//
//    public static int least(int num1, int num2)
//    {
//        if(num1 < num2)
//        {
//            return num1;
//        }
//        else {
//            return num2;
//        }
//    }
//}








