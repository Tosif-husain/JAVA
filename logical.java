//import java.util.Scanner;
//
//public class logical {
//    public static void main(String[] args) {
//        Scanner input  = new Scanner(System.in);
//        System.out.println("WELCOME TO TICKET DISCOUNT PAGE");
//        System.out.print("PLEASE ENTER YOUR AGE: ");
//        int age = input.nextInt();
//        System.out.print("ARE YOU FEMALE? (TRUE / FALSE) ");
//        boolean isFemale = input.nextBoolean();
//
//        if(age > 5){
//            System.out.println("YOU GOT 75% DISCOUNT");
//        } else if (isFemale) {
//            System.out.println("YOU GOT 50% DISCOUNT");
//        } else if (age > 60 && !isFemale) {
//            System.out.println("YOU GOT 25% DISCOUNT");
//        }else {
//            System.out.println("SORRY YOU GOT NOTHING");
//        }
//    }
//}

import java.util.Scanner;

public class logical{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
        System.out.print("PLS ENTER YOUR AGE: ");
        int age = input.nextInt();
        System.out.print("ARE YOU FEMALE? (TRUE / FALSE) ");
        boolean isFemale = input.nextBoolean();
        if (age < 5){
            System.out.println("you got 75% discount");
        } else if (isFemale) {
            System.out.println("you got 50% discount");
        } else if (age > 60 && !isFemale) {
            System.out.println("you got 25% discount");
        }else {
            System.out.println("sorry you got nothing");
        }
    }
}
