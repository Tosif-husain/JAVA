import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to swapping\n\n");

        System.out.println("enter value of a: ");
        int a = input.nextInt();

        System.out.println("enter value of b: ");
        int b = input.nextInt();


        int c = a;
        a = b;
        b = c;

        System.out.println("your result is...");
        System.out.println("value of a: "+a);
        System.out.println("value of b: "+b);
    }
}

