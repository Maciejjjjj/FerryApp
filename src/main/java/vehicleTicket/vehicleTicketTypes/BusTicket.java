package vehicleTicket.vehicleTicketTypes;

import ticket.Ticket;

import java.util.Scanner;

public class BusTicket implements Ticket {

    private final Scanner scanner = new Scanner(System.in);

    public double getPrice() {
        System.out.println("Please enter bus length [meters]:");
        double length = scanner.nextDouble();
        return length * 5.0;
    }
}
