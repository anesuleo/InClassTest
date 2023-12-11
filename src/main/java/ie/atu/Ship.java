package ie.atu;

public class Ship
{
    private String ship;
    private String year;
    private int number;

    public Ship(String ship, String year, int number) {
        this.ship = "";
        this.year = "";
        this.number = 0;
    }

    public String getShip() {
        return ship;
    }

    public void setShip(String ship) {
        this.ship = ship;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
