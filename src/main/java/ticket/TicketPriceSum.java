package ticket;

import java.util.ArrayList;
import java.util.List;

public class TicketPriceSum {

    // Poczytać o kontruktorach!!!

    // Przekazać obiekt ticketList do miejsca gdzie chce go wykorzystać, chodzi konstruktor (za jego pomoca muszę to przekazać)

    public List<Ticket> ticketList = new ArrayList<>();



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
