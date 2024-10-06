import java.util.ArrayList;
import java.util.Scanner;


public class SeatReservationSystem {
    public static void main(String[] args) {
int choice;
        ArrayList<RegularPassenger> regularPassengerList = new ArrayList<>();
        ArrayList<VIPPassenger> VIPPassengerList = new ArrayList<>();


Scanner scanner = new Scanner (System.in);
        while (true) {
            System.out.println("Welcome to Panini's Airline Seat Reservation System! Please select an operation.");

            System.out.println("1. Book Regular Seat");
            System.out.println("2. Book VIP Seat");
            System.out.println("3. Check Seat Availability");
            System.out.println("4. Cancel Seat Booking");
            System.out.println("5. Search for Passenger");
            System.out.println("6. Save and exit..");
            System.out.print("Enter your operation of choice: ");
            choice = scanner.nextInt();



            switch (choice) {
                case 1:
                    RegularPassenger passenger1 = new RegularPassenger();

                    passenger1.askName();
                    passenger1.askAge();
                    passenger1.askSeats();
                    passenger1.askTicketPrice();
                    regularPassengerList.add(passenger1);
                    System.out.println("Seat " + passenger1.seatRow + ", " + passenger1.seatColumn + " has been booked successfully for " + passenger1.getPassengerName() + ".");
break;
                case 2:
                    VIPPassenger passenger2 = new VIPPassenger();
                    passenger2.askName();
                    passenger2.askAge();
                    passenger2.askSeats();
                    passenger2.askTicketPrice();
                    System.out.println("VIP Surcharge: $100");
                    VIPPassengerList.add(passenger2);
                    System.out.println("VIP Seat " + passenger2.seatRow + ", " + passenger2.seatColumn + " has been booked successfully for " + passenger2.getPassengerName() + ".");
                    break;

                case 5:

                    boolean passengerFound = false;


                    System.out.print("Enter the name of the passenger you want to search for: ");
                    String passengerSearchName = scanner.next();

                    for (RegularPassenger searchPassenger : regularPassengerList) {
                        if (passengerSearchName.equalsIgnoreCase(searchPassenger.getPassengerName())) {
                            System.out.println(searchPassenger.getPassengerName() + "'s details should be displayed.");
                            System.out.println("Regular Seat: " + searchPassenger.getSeatRow() + ", " + searchPassenger.getSeatColumn() );
                            System.out.println("Regular Ticket: $ " + searchPassenger.getTotalTicketPrice());
                            passengerFound = true;
                            break;
                        }

                        if (!passengerFound) {
                            for (VIPPassenger searchVIPPassenger : VIPPassengerList) {
                                if (passengerSearchName.equalsIgnoreCase(searchVIPPassenger.getPassengerName())) {
                                    System.out.println(searchVIPPassenger.getPassengerName() + "'s details should be displayed.");
                                    System.out.println("VIP Seat: " + searchVIPPassenger.getSeatRow() + ", " + searchVIPPassenger.getSeatColumn() );
                                    System.out.println("VIP Ticket: $ " + (searchVIPPassenger.getTotalTicketPrice() + 100));
                                }


                            }
                        }
                    }
            }
        }
    }
}
