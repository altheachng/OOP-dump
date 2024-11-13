import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class SeatReservationSystemQueue {

        // Maximum number of seats available
        private static final int MAX_SEATS = 10;
        private static final String[] seats = new String[MAX_SEATS]; // Seat array
        private static final Queue<String> reservationQueue = new LinkedList<>(); // Queue to hold customer names

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Initialize all seats to "available"
            for (int i = 0; i < MAX_SEATS; i++) {
                seats[i] = "Available";
            }

            while (true) {
                System.out.println("\nSeat Reservation System");
                System.out.println("1. Reserve a Seat");
                System.out.println("2. Cancel Reservation");
                System.out.println("3. View Reservations");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (choice) {
                    case 1:
                        reserveSeat(scanner);
                        break;
                    case 2:
                        cancelReservation(scanner);
                        break;
                    case 3:
                        viewReservations();
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }

        // Method to reserve a seat
        private static void reserveSeat(Scanner scanner) {
            System.out.print("Enter your name to reserve a seat: ");
            String customerName = scanner.nextLine();

            // Find the first available seat
            int seatNumber = findAvailableSeat();
            if (seatNumber != -1) {
                seats[seatNumber] = customerName;
                reservationQueue.add(customerName);
                System.out.println("Seat reserved for " + customerName + " at Seat #" + (seatNumber + 1));
            } else {
                System.out.println("All seats are reserved. Please wait for cancellations.");
            }
        }

        // Method to cancel a reservation
        private static void cancelReservation(Scanner scanner) {
            System.out.print("Enter your name to cancel your reservation: ");
            String customerName = scanner.nextLine();

            // Check if the customer has a reservation
            boolean found = false;
            for (int i = 0; i < MAX_SEATS; i++) {
                if (seats[i].equalsIgnoreCase(customerName)) {
                    seats[i] = "Available";
                    found = true;
                    System.out.println("Reservation canceled for " + customerName);
                    break;
                }
            }

            if (found) {
                reservationQueue.remove(customerName);
            } else {
                System.out.println("No reservation found under your name.");
            }
        }

        // Method to view all reservations
        private static void viewReservations() {
            System.out.println("\nCurrent Reservations:");
            for (int i = 0; i < MAX_SEATS; i++) {
                if (!seats[i].equals("Available")) {
                    System.out.println("Seat #" + (i + 1) + " - " + seats[i]);
                } else {
                    System.out.println("Seat #" + (i + 1) + " - Available");
                }
            }
        }

        // Utility method to find the first available seat
        private static int findAvailableSeat() {
            for (int i = 0; i < MAX_SEATS; i++) {
                if (seats[i].equals("Available")) {
                    return i;
                }
            }
            return -1; // No available seats
        }

    }

