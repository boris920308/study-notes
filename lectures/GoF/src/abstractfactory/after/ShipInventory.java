package abstractfactory.after;


import abstractfactory.Ship;
import abstractfactory.ShipFactory;

public class ShipInventory {
    public static void main(String[] args) {
        ShipFactory proShipFactory = new WhiteshipFactory(new WhiteshipPartsProFactory());
        Ship proShip = proShipFactory.createShip();
        System.out.println(proShip.getAnchor().getClass());
        System.out.println(proShip.getWheel().getClass());

        ShipFactory shipFactory = new WhiteshipFactory(new WhiteshipPartsFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());

    }
}
