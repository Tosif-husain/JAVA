import java.util.Scanner;

public class relational {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to driving license program: ");
        System.out.print("ENTER YOUR AGE: ");
        int age = sc.nextInt();
        if (age >= 18)
        {
            System.out.println("you are eligible to drive ");
        }
        else {
            System.out.println("you are not eligible to drive");
        }

    }
}
