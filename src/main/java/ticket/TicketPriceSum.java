package ticket;

import screen.MainScreen;

import java.util.ArrayList;
import java.util.List;

public class TicketPriceSum {

    private static TicketPriceSum instance;

    public static TicketPriceSum INSTANCE() {
        if (instance == null) {
            instance = new TicketPriceSum();
        }
        return instance;
    }

    private List<Ticket> ticketList;

    public TicketPriceSum() {
        ticketList = new ArrayList<>();
    }

    public void add(Ticket ticket) {
        ticketList.add(ticket);
    }

    public void printList() {

        int i = 1;
        for (Ticket ticket : ticketList) {

            System.out.println(i + ". "
                    + ticket.getType() + ", "
                    + ticket.getSubType() + ", "
                    + ticket.getPrice() + "$.");
            i++;
        }
    }

    public double getTotalCost() {
        double priceSum = 0;
        for (Ticket ticketPrice : ticketList) {
            priceSum += ticketPrice.getPrice();
        }
        return priceSum;
    }

}
