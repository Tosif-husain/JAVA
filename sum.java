import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO OUR CALCULATOR ");
        System.out.printf("PLS ENTER FIRST NUMBER: ");
        int FirstNum = input.nextInt();
        System.out.printf("PLS ENTER SECOND NUMBER: ");
        int secNum = input.nextInt();
        int sum = FirstNum + secNum;
        System.out.print("YOUR SUM = ");
    }
}
