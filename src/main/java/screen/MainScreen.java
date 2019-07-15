package screen;


import ticket.TicketPriceSum;

import java.util.Scanner;

public class MainScreen implements Screen {


    private final Scanner scanner = new Scanner(System.in);

    public void interact() {

        System.out.println("Type 'START' to buy a ticket,\n" +
                "'SUM' to see total price,\n" +
                "or 'EXIT' to exit.");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("START")) {

            TicketTypeScreen newScreen = new TicketTypeScreen();
            newScreen.interact();
        } else if (response.equalsIgnoreCase("SUM")) {
            System.out.println("Your total price is: " + TicketPriceSum.getTotalCost() +"$\n");
            interact();
        } else if (response.equalsIgnoreCase("EXIT")) {
            System.exit(0);
        } else {
            interact();
        }
    }
}
