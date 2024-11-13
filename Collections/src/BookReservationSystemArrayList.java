import java.util.ArrayList;
import java.util.Scanner;

public class BookReservationSystemArrayList {
    private static ArrayList<String> reservedBooks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nBook Reservation System");
            System.out.println("1. Reserve a Book");
            System.out.println("2. Cancel Reservation");
            System.out.println("3. Search for a Book");
            System.out.println("4. View All Reservations");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    reserveBook(scanner);
                    break;
                case 2:
                    cancelReservation(scanner);
                    break;
                case 3:
                    searchBook(scanner);
                    break;
                case 4:
                    viewReservations();
                    break;
                case 5:
                    System.out.println("Exiting the system...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to reserve a book
    private static void reserveBook(Scanner scanner) {
        System.out.print("Enter the book title to reserve: ");
        String bookTitle = scanner.nextLine();

        if (reservedBooks.contains(bookTitle)) {
            System.out.println("Book already reserved.");
        } else {
            reservedBooks.add(bookTitle);
            System.out.println("Book reserved successfully: " + bookTitle);
        }
    }

    // Method to cancel a reservation
    private static void cancelReservation(Scanner scanner) {
        System.out.print("Enter the book title to cancel the reservation: ");
        String bookTitle = scanner.nextLine();

        if (reservedBooks.remove(bookTitle)) {
            System.out.println("Reservation canceled for: " + bookTitle);
        } else {
            System.out.println("Book not found in reservations.");
        }
    }

    // Method to search for a specific book
    private static void searchBook(Scanner scanner) {
        System.out.print("Enter the book title to search: ");
        String bookTitle = scanner.nextLine();

        if (reservedBooks.contains(bookTitle)) {
            System.out.println("Book found in reservations: " + bookTitle);
        } else {
            System.out.println("Book not found.");
        }
    }

    // Method to view all reserved books
    private static void viewReservations() {
        if (reservedBooks.isEmpty()) {
            System.out.println("No books reserved.");
        } else {
            System.out.println("\nList of Reserved Books:");
            for (String book : reservedBooks) {
                System.out.println(book);
            }
        }
    }
}
