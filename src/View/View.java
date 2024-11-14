package View;

import java.util.ArrayList;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

import Model.*;
import Controller.*;

public class View {
    static ArrayList<Train> listTrain = new ArrayList<>();
    static ArrayList<Reservation> listReservation = new ArrayList<>();
    static ArrayList<GroupReservation> listGroup = new ArrayList<>();   
    static ArrayList<OnlinePayment> listOnlinePayment = new ArrayList<>();
    static ArrayList<Passenger> listPassenger = new ArrayList<>();
    static ArrayList<Ticket> listTicket = new ArrayList<>();

    static void createDummy() throws ParseException {
        // Train
        listTrain.add(new Train(1001, "Argo Bromo", TrainType.STANDARD));
        listTrain.add(new Train(1002, "Komuter Lokal", TrainType.FASTTRAIN));
        listTrain.add(new Train(1003, "Barang Ekspres", TrainType.FASTTRAIN));
        listTrain.add(new Train(1004, "Gajayana", TrainType.FASTTRAIN));
        listTrain.add(new Train(1005, "Malioboro Express", TrainType.STANDARD));

        // Reservation
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Reservation reservation1 = new Reservation(
                "RSV001",
                dateFormat.parse("15-11-2024"));

        Reservation reservation2 = new Reservation(
                "RSV002",
                dateFormat.parse("16-11-2024"));

        Reservation reservation3 = new Reservation(
                "RSV003",
                dateFormat.parse("17-11-2024"));

        Reservation reservation4 = new Reservation(
                "RSV004",
                dateFormat.parse("18-11-2024"));

        Reservation reservation5 = new Reservation(
                "RSV005",
                dateFormat.parse("19-11-2024"));

        // Menambahkan ke listReservation
        listReservation.add(reservation1);
        listReservation.add(reservation2);
        listReservation.add(reservation3);
        listReservation.add(reservation4);
        listReservation.add(reservation5);

        // Online Payment
        listOnlinePayment.add(new OnlinePayment("TRX001", "PAYPAL"));
        listOnlinePayment.add(new OnlinePayment("TRX002", "PAYPAL"));
        listOnlinePayment.add(new OnlinePayment("TRX003", "DOKU"));
        listOnlinePayment.add(new OnlinePayment("TRX004", "DOKU"));
        listOnlinePayment.add(new OnlinePayment("TRX005", "XENDIT"));

        // Passenger
        listPassenger.add(new Passenger("PSG001", "Budi Santoso", "Male", 25));
        listPassenger.add(new Passenger("PSG002", "Siti Rahmawati", "Female", 30));
        listPassenger.add(new Passenger("PSG003", "Ahmad Rahman", "Male", 45));
        listPassenger.add(new Passenger("PSG004", "Dewi Anjani", "Female", 22));
        listPassenger.add(new Passenger("PSG005", "Rudi Hermawan", "Male", 35));
        
        //Ticket
        listTicket.add(new Ticket("TICKET123", "A1", ClassType.FIRST_CLASS, TicketStatus.PAID, 350000.00, listTrain.get(0), reservation1, listPassenger.get(0)));
        listTicket.add(new Ticket("TICKET124", "B2", ClassType.BUSINESS_CLASS, TicketStatus.AWAITING_PAYMENT, 250000.00, listTrain.get(1), reservation2, listPassenger.get(1)));

        //Group Reservation
        GroupReservation group = new GroupReservation("Bahagia", 1, listReservation);

    }

    static Controller controller = new Controller();
    public static void main(String[] args) throws ParseException {
        createDummy();
        controller.getTrainDetails(listTrain, 1001); // method class train
        System.out.println();
        controller.getPassengerInfo(listPassenger, "PSG001");
        System.out.println();
        controller.getTicketStatus(listTicket, "TICKET123");
    }

    public void menu(){
        System.out.println("Selamat Datang");

        System.out.println("Silakan Pilih Menu");
        System.out.println("1.Get Train Details");
        System.out.println("2.Get Passenger Info");
        System.out.println("3.Print Ticket");
        System.out.println("4.Get Ticket Status");
        System.out.println("5.Make Payment");

        System.out.println();

        Scanner scan = new Scanner(System.in);
        int menu = scan.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Silakan Masukkan Train Number : (1001)");
                int trainNumber = scan.nextInt();
                controller.getTrainDetails(listTrain, trainNumber);
                break;
            case 2:
                System.out.println("Silakan Masukkan Passenger ID : (PSG001)");
                String passengerID = scan.nextLine();
                controller.getPassengerInfo(listPassenger, passengerID);
                break;
            case 3:
                System.out.println("Silakan Masukkan Ticket ID : (TICKET123)");
                String ticketID = scan.nextLine();
                controller.printTicket(listTicket, ticketID);
                break;
            case 4:
                System.out.println("Silakan Masukkan Ticket ID : (TICKET123)");
                String ticketIDD = scan.nextLine();
                controller.getTicketStatus(listTicket, ticketIDD);
                break;
            case 5:
                System.out.println("Silakan Pilih Class Type (nomor) ");
                System.out.println("1. First Class \n2. Business  \n3. Economy");
                int tipeClass = scan.nextInt();
                System.out.println("Silakan Pilih Train Type");
                System.out.println("1. Standard \n2. Fast Train");
                int tipeTrain = scan.nextInt();

                TrainType trainType = TrainType.FASTTRAIN;
                ClassType classType = ClassType.BUSINESS_CLASS;

                switch (tipeClass) {
                    case 1:
                        classType = ClassType.FIRST_CLASS;
                        break;
                    case 2:
                        classType = ClassType.BUSINESS_CLASS;
                        break;
                    case 3:
                        classType = ClassType.ECONOMY_CLASS;
                        break;
                    default:
                        break;
                }
                switch (tipeTrain) {
                    case 1:
                        trainType = TrainType.STANDARD;
                        break;
                    case 2:
                        trainType = TrainType.FASTTRAIN;
                        break;
                    default:
                        break;
                }
                double harga = controller.makePayment(classType, trainType);
                System.out.println("Harganya adalah " + harga);
                break;
            default:
                break;

        }
        scan.close();
    }

    

}