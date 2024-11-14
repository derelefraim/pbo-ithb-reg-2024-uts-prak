package Model;

public class Ticket {
    String ticketID;
    String seatNumber;
    ClassType classType;
    TicketStatus status;
    double price;
    Train train;
    Reservation reservation;
    Passenger passenger;
    public String getTicketID() {
        return ticketID;
    }
    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }
    public String getSeatNumber() {
        return seatNumber;
    }
    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }
    public ClassType getClassType() {
        return classType;
    }
    public void setClassType(ClassType classType) {
        this.classType = classType;
    }
    public TicketStatus getStatus() {
        return status;
    }
    public void setStatus(TicketStatus status) {
        this.status = status;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Train getTrain() {
        return train;
    }
    public void setTrain(Train train) {
        this.train = train;
    }
    public Reservation getReservation() {
        return reservation;
    }
    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
    public Passenger getPassenger() {
        return passenger;
    }
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
    public Ticket(String ticketID, String seatNumber, ClassType classType, TicketStatus status, double price,
            Train train, Reservation reservation, Passenger passenger) {
        this.ticketID = ticketID;
        this.seatNumber = seatNumber;
        this.classType = classType;
        this.status = status;
        this.price = price;
        this.train = train;
        this.reservation = reservation;
        this.passenger = passenger;
    }
}
