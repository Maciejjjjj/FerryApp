package vehicleTicket.vehicleTicketTypes;

import ticket.Ticket;

import java.util.Scanner;

public class TruckTicket implements Ticket {

    private final Scanner scanner = new Scanner(System.in);

    public double getPrice() {
        System.out.println("Please enter truck weight [tons]:");
        double weight = scanner.nextDouble();
        return weight * 10.00;
    }
}
