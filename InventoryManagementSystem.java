import java.util.Scanner;

public class InventoryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int productCount = 0;


        System.out.print("Number of products: ");
        productCount = scanner.nextInt();

        //initialize arrays
        String productInput[] = new String[productCount];
        double priceInput[] = new double[productCount];
        int quantityInput[] = new int[productCount];

        for (int i = 0; i < productCount; i++) {
            scanner = new Scanner(System.in);
            System.out.print("Enter product " + (i + 1) + ": ");
            productInput[i] = scanner.nextLine();


            System.out.print("Enter price for product " + productInput[i] + ": ");
            priceInput[i] = scanner.nextDouble();

            System.out.print("Enter quantity for product " + productInput[i] + ": ");
            quantityInput[i] = scanner.nextInt();


        }
        do {
            System.out.println("What do you want to do next?: ");

            System.out.println("1. Purchase Products");
            System.out.println("2. Check Available Stock");
            System.out.println("3. Exit program");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner = new Scanner(System.in);
                    System.out.print("What product do you wish to purchase?: ");
                    String productPurchase = scanner.nextLine();

                    for (int j = 0; j < productCount; j++) {
                        if (productPurchase.equalsIgnoreCase(productInput[j])) {
                            System.out.println("How many " + productPurchase + " do you wish to purchase?: ");
                            int purchaseQuantity = scanner.nextInt();
                            quantityInput[j] -= purchaseQuantity;

                            System.out.println("You have purchased " + purchaseQuantity + " " + productInput[j] + ".");

                        }

                    }
                    break;
                case 2:
                    scanner = new Scanner(System.in);
                    System.out.print("What product do you wish to check the stock of?: ");
                    String producttoCheck = scanner.nextLine();

                    for (int j = 0; j < productCount; j++) {
                        if (producttoCheck.equalsIgnoreCase(productInput[j])) {
                            System.out.println(producttoCheck + " has " + quantityInput[j] + " stocks available.");

                        }
                        break;

                    }

            }


        }  while (true) ;

    }
}
