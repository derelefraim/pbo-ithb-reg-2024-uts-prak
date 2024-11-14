package Controller;

import java.util.ArrayList;
import java.util.Iterator;
// Asumsi method di class diagram berada di controller
import Model.*;
public class Controller {
    public void getTrainDetails(ArrayList<Train> listTrain, int trainNumber){
        Iterator<Train> iteratorTrain = listTrain.iterator();
        Train train;
        if (iteratorTrain.hasNext()) {
            train = iteratorTrain.next();
            if (train.getTrainNumber() == trainNumber) {
                System.out.println("Nama kereta : " + train.getTrainName());
                System.out.println("Nomor Kereta : " + train.getTrainNumber());
                System.out.println("Type Kereta : " + train.getTrainRype()); // maaf ko, typo
                return;
            }
        }
        System.out.println("Maaf, nomor kereta yang kamu mau tidak tersedia");
    }

    public void getPassengerInfo(ArrayList<Passenger> listPassenger, String id){
        Iterator<Passenger> iteratorPassenger = listPassenger.iterator();
        Passenger Passenger;
        if (iteratorPassenger.hasNext()) {
            Passenger = iteratorPassenger.next();
            if (Passenger.getPassengerID() == id) {
                System.out.println("PASSENGER INFO");
                System.out.println("Nama Passenger :  " + Passenger.getPassengerName());
                System.out.println("ID Passenger : " + Passenger.getPassengerID());
                System.out.println("Gender Passenger : " + Passenger.getPassengerGender());
                System.out.println("Age Passenger : " + Passenger.getPassengerAge());
                return;
            }
        }
        System.out.println("Maaf, id Passenger yang kamu mau tidak tersedia");

    }

    public void printTicket(ArrayList<Ticket> listTicket, String ticketID){
        Iterator<Ticket> iteratorTicket = listTicket.iterator();
        Ticket Ticket;
        if (iteratorTicket.hasNext()) {
            Ticket = iteratorTicket.next();
            if (Ticket.getTicketID() == ticketID) {
                System.out.println("TICKET INFO");
                System.out.println("ID Ticket : " + Ticket.getTicketID());
                System.out.println("Harga Ticket :  " + Ticket.getPrice());
                System.out.println("Seat Number Ticket : " + Ticket.getSeatNumber());
                System.out.println("Class Ticket : " + Ticket.getClass());
                return;
            }
        }
        System.out.println("Maaf, id Ticket yang kamu mau tidak tersedia");
    }

    public void getTicketStatus(ArrayList<Ticket> listTicket, String ticketID){
        Iterator<Ticket> iteratorTicket = listTicket.iterator();
        Ticket Ticket;
        if (iteratorTicket.hasNext()) {
            Ticket = iteratorTicket.next();
            if (Ticket.getTicketID() == ticketID) {
                System.out.println("INFO TICKET");
                System.out.println("ID Ticket : " + Ticket.getTicketID());
                System.out.println("Status Ticket :  " + Ticket.getStatus());
                return;
            }
        }
        System.out.println("Maaf, id Ticket yang kamu mau tidak tersedia");
    }

    public double makePayment(ClassType ct, TrainType tt){
        if (tt == TrainType.FASTTRAIN) {
            if (ct == ClassType.BUSINESS_CLASS) {
                return 500000;
            }else if (ct == ClassType.ECONOMY_CLASS){
                return 400000;
            }else{
                return 600000;
            }    
        }else
        if (ct == ClassType.BUSINESS_CLASS) {
            return 250000;
        }else if (ct == ClassType.ECONOMY_CLASS){
            return 175000;
        }else{
            return 350000;
        }    
    }

}
