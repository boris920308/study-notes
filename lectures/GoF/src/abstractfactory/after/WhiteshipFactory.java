package abstractfactory.after;

import abstractfactory.DefaultShipFactory;
import abstractfactory.Ship;
import abstractfactory.WhiteShip;

public class WhiteshipFactory extends DefaultShipFactory {
    // client 코드에 해당.

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }


}
