public class AirlineTickets {
    public double regularTicketPrice;
    public double VIPTicketPrice;

    public AirlineTickets (RegularPassenger price){
        this.regularTicketPrice = price.getTotalTicketPrice();
    }


    public double getRegularTicketPrice() {
        return regularTicketPrice;
    }

    public double getVIPTicketPrice() {
        return VIPTicketPrice;
    }

    public void setRegularTicketPrice(double regularTicketPrice) {
        this.regularTicketPrice = regularTicketPrice;
    }

    public void setVIPTicketPrice(double VIPTicketPrice) {
        this.VIPTicketPrice = VIPTicketPrice;
    }

}
