

public class SingleRoom extends Reservation implements Reservable  {

    //constructor
    public SingleRoom() {
       isCheckedIn = false;
   }

    @Override
    public void checkIn() {
    if (!isCheckedIn){
        isCheckedIn = true;
        System.out.println("Guest " + guestname + " is checked in to Single Room " + roomNumber + "!");
    }
    }

    @Override
    public void checkOut() {
        if (isCheckedIn) {
            isCheckedIn = false;
            System.out.println("Guest " + guestname + " is checked out from Single Room " + roomNumber + "!");
            isCheckedIn = false;
        } else {
            System.out.println("Room is already available.");
        }
    }

    @Override
    public void getDetails() {
        System.out.println("Guest: " + guestname);
        System.out.println("Checked: " + (isCheckedIn ? " In" : " Out"));
        System.out.println("Room type: Single Room");
        System.out.println("Room Number: " + roomNumber);
    }


}
