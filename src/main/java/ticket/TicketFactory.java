package ticket;

import personTicket.PersonType;
import personTicket.personTicketTypes.AdultTicket;
import personTicket.personTicketTypes.ChildTicket;
import personTicket.personTicketTypes.SeniorTicket;
import personTicket.personTicketTypes.YoungTicket;


public class TicketFactory {

    public Ticket createPersonTicket(int age) {

        PersonType personType;

        if (age >= 0 && age < 3) {
            personType = PersonType.CHILD;
        } else if (age >= 3 && age < 18) {
            personType = PersonType.YOUNG;
        } else if (age >= 18 && age < 70) {
            personType = PersonType.ADULT;
        } else {
            personType = PersonType.SENIOR;
        }

        switch (personType) {
            case CHILD:
                ChildTicket childTicket = new ChildTicket();
                return childTicket;
            case YOUNG:
                YoungTicket youngTicket = new YoungTicket();
                return youngTicket;
            case ADULT:
                AdultTicket adultTicket = new AdultTicket();
                return adultTicket;
            default:
                SeniorTicket seniorTicket = new SeniorTicket();
                return seniorTicket;
        }
    }
}
