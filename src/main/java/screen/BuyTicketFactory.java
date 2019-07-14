package screen;

import buyVehicleTicket.BuyVehicleTicket;
import personTicket.BuyPersonTicket;

public class BuyTicketFactory {

    public void buyPersonTicket() {
        BuyPersonTicket buyPersonTicket = new BuyPersonTicket();
        buyPersonTicket.interact();
    }

    public void buyVehicleTicket() {
        BuyVehicleTicket buyVehicleTicket = new BuyVehicleTicket();
        buyVehicleTicket.interact();
    }

    public void buyCargoTicket() {

    }

}
