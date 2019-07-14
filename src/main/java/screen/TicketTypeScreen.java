package screen;

import java.util.Scanner;

public class TicketTypeScreen implements Screen {

    private final Scanner scanner = new Scanner(System.in);

    public void interact() {
        System.out.println("Choose ticket type, press:\n" +
                "1- person\n" +
                "2- vehicle\n" +
                "3- cargo\n" +
                "0- to EXIT");

        int response = scanner.nextInt();
        BuyTicketFactory buyTicketFactory = new BuyTicketFactory();

        if (response == 1) {
            buyTicketFactory.buyPersonTicket();
        }

        if (response == 2) {
            buyTicketFactory.buyVehicleTicket();
        }

        if (response == 3) {
            buyTicketFactory.buyCargoTicket();
        }
        if (response == 0) {
            System.exit(0);
        } else {
            interact();
        }

    }
}
