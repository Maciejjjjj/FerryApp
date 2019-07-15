package ticket;

import java.util.ArrayList;
import java.util.List;

public class TicketPriceSum {

    private static List<Ticket> ticketList = new ArrayList<>();


    public static void add(Ticket ticket) {
        ticketList.add(ticket);
    }

    public static double getTotalCost() {
        double priceSum = 0;
        for (Ticket ticketPrice : ticketList) {
            priceSum += ticketPrice.getPrice();
        }
        return priceSum;
    }

}
