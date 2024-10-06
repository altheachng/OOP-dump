public class VIPPassenger extends RegularPassenger {
    private double VIPSurcharge = 100; // Default surcharge for VIP passengers



    // Getter for VIPSurcharge
    public double getVIPSurcharge() {
        return VIPSurcharge;
    }

    // Setter for VIPSurcharge
    public void setVIPSurcharge(double VIPSurcharge) {
        this.VIPSurcharge = VIPSurcharge;
    }

    // Method to calculate the total ticket price for VIP
    public double calculateVIPTotalTicketPrice() {
        // Total price is the base ticket price plus VIP surcharge
        return getTotalTicketPrice() + VIPSurcharge;
    }
}
