package screen;

import java.util.Scanner;

public class MainScreen implements Screen {

    private final Scanner scanner = new Scanner(System.in);

    public void interact() {

        System.out.println("Type 'START' to buy a ticket.");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("START")) {

            TicketTypeScreen newScreen = new TicketTypeScreen();
            newScreen.interact();

        } else {
            interact();
        }

    }


}
