package Model;

public class Passenger {
   String passengerID;
   String passengerName;
   String passengerGender;
   int passengerAge;
public String getPassengerID() {
    return passengerID;
}
public void setPassengerID(String passengerID) {
    this.passengerID = passengerID;
}
public String getPassengerName() {
    return passengerName;
}
public void setPassengerName(String passengerName) {
    this.passengerName = passengerName;
}
public String getPassengerGender() {
    return passengerGender;
}
public void setPassengerGender(String passengerGender) {
    this.passengerGender = passengerGender;
}
public int getPassengerAge() {
    return passengerAge;
}
public void setPassengerAge(int passengerAge) {
    this.passengerAge = passengerAge;
}
public Passenger(String passengerID, String passengerName, String passengerGender, int passengerAge) {
    this.passengerID = passengerID;
    this.passengerName = passengerName;
    this.passengerGender = passengerGender;
    this.passengerAge = passengerAge;
} 
}
