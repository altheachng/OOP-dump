public abstract class Reservation {
    protected String guestname;
    protected int roomNumber;
    protected boolean isCheckedIn;

//methods to be overridden
    public abstract void checkIn();
    public abstract void checkOut();
    public abstract void getDetails();


    protected void setName(String name){
        this.guestname = name;
    }

    protected String getName(){
        return guestname;
    }


 protected boolean getisCheckedin(){
        return isCheckedIn;
 }


}
