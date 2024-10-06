import java.util.ArrayList;
import java.util.Scanner;

public class RegularPassenger {
    private String passengerName;
    private int passengerAge;
    private int[][] passengerSeats;

    private double totalTicketPrice;
    public int seatRow;
    public int seatColumn;

    ArrayList<String> passengerNamesList = new ArrayList<String>();



    //constructor
  public RegularPassenger(){
      this.passengerName="";
      this.passengerAge = 0;
      this.seatRow = 0;
      this.seatColumn = 0;
      this.totalTicketPrice = 0;


  }
    //getters
    public String getPassengerName(){
        return passengerName;
    }

    public int getPassengerAge() {
        return passengerAge;
    }

    public double getTotalTicketPrice() {
        return totalTicketPrice;
    }

    public int getSeatColumn() {
        return seatColumn;
    }

    public int getSeatRow() {
        return seatRow;
    }

    //setters
    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public void setPassengerAge(int passengerAge) {
        this.passengerAge = passengerAge;
    }

    public void setPassengerSeats(int[][] passengerSeats) {
        this.passengerSeats = passengerSeats;
    }

    public void setTotalTicketPrice(double totalTicketPrice) {
        this.totalTicketPrice = totalTicketPrice;
    }

    //method(s)
    public void askName() {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter your name: ");
        passengerName = scanner.next();
        passengerNamesList.add(passengerName);
    }

    public void askAge() {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter your age: ");
        passengerAge = scanner.nextInt();
    }

    public void askSeats() {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter your seat row: ");
        seatRow = scanner.nextInt();
        System.out.print("Enter your seat column: ");
        seatColumn = scanner.nextInt();


        passengerSeats = new int[seatRow][seatColumn];
    }

    public int [][] getPassengerSeats() {
        return passengerSeats;
    }
    public void askTicketPrice(){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter your ticket price: $");
        totalTicketPrice = scanner.nextDouble();

    }


}
