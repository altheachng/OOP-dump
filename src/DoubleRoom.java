public class DoubleRoom extends Reservation implements Reservable{
    //constructor
    public DoubleRoom() {
        isCheckedIn = false;
    }

    @Override
    public void checkIn() {
        if (!isCheckedIn){
            isCheckedIn = true;
            System.out.println("Guest " + guestname + " is checked in to Double Room" + roomNumber + "!");
        }
    }

    @Override
    public void checkOut() {
        if (isCheckedIn) {
            System.out.println("Guest " + guestname + " checked out from Double Room " + roomNumber + "!");
            isCheckedIn= false;
        } else {
            System.out.println("Room is already available.");
        }
    }

    @Override
    public void getDetails() {
        System.out.println("Guest: " + guestname);
        System.out.println("Checked: " + (isCheckedIn ? "In" : "Out"));
        System.out.println("Room type: Double Room");
        System.out.println("Room Number: " + roomNumber);
    }
}
