import java.util.Scanner;
public class Main {

    private int reservationCount = 0;
    private static int maximum = 100;
    private Reservation[] reservations = new Reservation[maximum];


    public void addSingleRoomReservation(String guestName, int roomNumber) {
        if (reservationCount < maximum) {
            Reservation reservation = new SingleRoom();
            reservation.setName(guestName);
            reservation.roomNumber = roomNumber;
            reservations[reservationCount++] = reservation;
            System.out.println("Reservation registered for " + guestName + " in Single Room " + roomNumber + ".");
        } else {
            System.out.println("Maximum reservations has been reached. Sorry!");
        }
    }

    public void addDoubleRoomReservation(String guestName, int roomNumber) {
        if (reservationCount < maximum) {
            Reservation reservation = new DoubleRoom();
            reservation.setName(guestName);
            reservation.roomNumber = roomNumber;
            reservations[reservationCount++] = reservation;
            System.out.println("Reservation registered for " + guestName + " in Double Room " + roomNumber + ".");
        } else {
            System.out.println("Maximum reservations reached. Cannot add more.");
        }
    }

    public void menucheckIn(int index) {
        if (index >= 0 && index < reservationCount) {
            Reservation reservation = reservations[index];
            reservation.checkIn();
        } else {
            System.out.println("Invalid reservation index.");
        }
    }

    public void menucheckOut(int index) {
        if (index >= 0 && index < reservationCount) {
            Reservation reservation = reservations[index];
            reservation.checkOut();
        } else {
            System.out.println("Invalid reservation index.");
        }
    }

    public void displayReservationDetails() {
        if (reservationCount == 0) {
            System.out.println("No reservations available.");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the reservation index (0 for the first reservation): ");
            int index = scanner.nextInt();

            if (index >= 0 && index < reservationCount) {
                Reservation reservation = reservations[index];
                reservation.getDetails();
            } else {
                System.out.println("Invalid reservation index.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        int choice;

        do {
            System.out.println("Welcome to Panini's Hotel!");
            System.out.println("1. Add Single Room Reservation");
            System.out.println("2. Add Double Room Reservation");
            System.out.println("3. Check In");
            System.out.println("4. Check Out");
            System.out.println("5. View Reservation Details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter guest name: ");
                    String guestName = scanner.nextLine();
                    System.out.print("Enter room number: ");
                    int roomNumber = scanner.nextInt();
                    scanner.nextLine();
                    main.addSingleRoomReservation(guestName, roomNumber);
                    break;

                case 2:
                    System.out.print("Enter guest name: ");
                    guestName = scanner.nextLine();

                    System.out.print("Enter room number: ");
                    roomNumber = scanner.nextInt();
                    scanner.nextLine();
                    main.addDoubleRoomReservation(guestName, roomNumber);
                    break;

                case 3:
                    System.out.print("Enter reservation index to check in (0 for the first reservation): ");
                    int index = scanner.nextInt();
                    main.menucheckIn(index);
                    break;

                case 4:
                    System.out.print("Enter reservation index to check out (0 for the first reservation): ");
                    index = scanner.nextInt();
                    main.menucheckOut(index);
                    break;

                case 5:
                    main.displayReservationDetails();
                    break;

                case 6:
                    System.out.println("Thank you for checking in Panini's Hotel!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
