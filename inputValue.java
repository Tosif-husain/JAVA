import java.util.Scanner;

public class inputValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER YOUR NAME: ");
        String name = input.nextLine();
        System.out.println("welcome "+name);

        System.out.print("pls enter you age: ");
        int age = input.nextInt();
        System.out.println("your age "+ age);
        System.out.printf("thanks " + name);
    }
}
