package Model;

import java.util.List;

public class GroupReservation {
    String groupName;
    int numberofPassengers;
    List<Reservation> listReservations;
    public GroupReservation(String groupName, int numberofPassengers, List<Reservation> listReservations) {
        this.groupName = groupName;
        this.numberofPassengers = numberofPassengers;
        this.listReservations = listReservations;
    }
    public String getGroupName() {
        return groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public int getNumberofPassengers() {
        return numberofPassengers;
    }
    public void setNumberofPassengers(int numberofPassengers) {
        this.numberofPassengers = numberofPassengers;
    }
    public List<Reservation> getListReservations() {
        return listReservations;
    }
    public void setListReservations(List<Reservation> listReservations) {
        this.listReservations = listReservations;
    }
    
}
