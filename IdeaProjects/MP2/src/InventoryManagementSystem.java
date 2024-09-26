import java.util.Scanner;

public class InventoryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int productCount = 0;
        String productInput[] = new String[productCount];
        double priceInput = 0;
        int quantity = 0;

        System.out.print("Number of products: ");
        productCount = scanner.nextInt();

        for (int i = 0; i <= productCount; i++){
            System.out.println("Enter product " + (i+1) + ": ");
        }
    }

}
