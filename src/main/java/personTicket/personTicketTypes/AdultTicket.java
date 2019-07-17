package personTicket.personTicketTypes;

import ticket.Ticket;

public class AdultTicket implements Ticket {
    public double getPrice() {
        return 10.00;
    }

    @Override
    public String getType() {
        return "Person";
    }

    @Override
    public String getSubType() {
        return "Adult";
    }
}
