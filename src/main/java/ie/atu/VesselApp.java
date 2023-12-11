package ie.atu;

public class VesselApp {
    public static void main(String[] args) {

    Ship vessel1 = new Ship("Bernard", "2003", 6);
    Ferry vessel2 = new Ferry();
    Trawler vessel3 = new Trawler();

    vessel2.setShip("Calvin");
    vessel2.setYear("2008");
    vessel2.setNumber(5);
    vessel2.setPassenger();

    }
}