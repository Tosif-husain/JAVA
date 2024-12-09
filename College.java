import java.util.Scanner;

class Society {
    String soc_name;
    String soc_address;
    int no_of_blocks;

    // Method to accept society details
    void set_society() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Society Name: ");
        soc_name = sc.nextLine();
        System.out.print("Enter Society Address: ");
        soc_address = sc.nextLine();
        System.out.print("Enter Number of Blocks: ");
        no_of_blocks = sc.nextInt();
    }
}

class Block extends Society {
    int block_no;
    String house_type;

    // Method to accept block details
    void set_block() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Block Number: ");
        block_no = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter House Type (2BHK/3BHK): ");
        house_type = sc.nextLine();
        if (house_type.equalsIgnoreCase("1BHK")) {
            System.out.println("Error: 1BHK is not allowed.");
        }
    }
}

class House extends Block {
    String owner_name;
    String owner_ph;

    // Method to accept house details
    void set_house() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Owner Name: ");
        owner_name = sc.nextLine();
        System.out.print("Enter Owner Phone Number: ");
        owner_ph = sc.nextLine();
    }
}

class CalculateMaintenance extends Block {
    // Method to calculate and display maintenance charges
    void calculate() {
        if (house_type.equalsIgnoreCase("2BHK")) {
            System.out.println("Maintenance Charges for 2BHK: Rs. 60000 per year.");
        } else if (house_type.equalsIgnoreCase("3BHK")) {
            System.out.println("Maintenance Charges for 3BHK: Rs. 84000 per year.");
        }
    }
}

public class College {
    public static void main(String[] args) {
        CalculateMaintenance obj = new CalculateMaintenance();
        House h = new House();


        // Set society details
        System.out.println("Enter Society Details:");
        obj.set_society();

        // Set block details
        System.out.println("\nEnter Block Details:");
        obj.set_block();

        // Set house details
        System.out.println("\nEnter House Details:");
        h.set_house();

        // Calculate and display maintenance
        System.out.println("\nCalculating Maintenance Charges:");
        obj.calculate();
    }
}
