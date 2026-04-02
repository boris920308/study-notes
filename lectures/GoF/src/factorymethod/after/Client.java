package factorymethod.after;

public class Client {

    public static void main(String[] args) {
        Ship whiteship = new WhiteShipFactory().orderShip("WhiteShip", "hoon@mail.com");
        System.out.println(whiteship);

        Ship blackship = new BlackShipFactory().orderShip("BlackShip", "hoon@mail.com");
        System.out.println(blackship);
    }

}
