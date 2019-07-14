package personTicket;

import screen.MainScreen;
import screen.Screen;
import screen.TicketTypeScreen;
import ticket.Ticket;
import ticket.TicketFactory;

import java.util.Scanner;

public class BuyPersonTicket implements Screen {

    private final Scanner scanner = new Scanner(System.in);

    public void interact() {
        String response;
        System.out.println("Type your age please or type 'RETURN' to return.");

        response = scanner.next();
        if (response.equalsIgnoreCase("RETURN")) {
            TicketTypeScreen ticketTypeScreen = new TicketTypeScreen();
            ticketTypeScreen.interact();
        } else if (response.matches("\\d+")) {

            TicketFactory ticketFactory = new TicketFactory();
            int age = Integer.parseInt(response);
            Ticket ticket = ticketFactory.createPersonTicket(age);

            System.out.println("Ticket price: " + ticket.getPrice() + "$");
            MainScreen mainScreen = new MainScreen();
            mainScreen.interact();
        } else {
            System.out.println("Wrong age, try again.");
            interact();
        }
    }
}
