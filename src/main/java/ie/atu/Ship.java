package ie.atu;

public super class Ship
{
    private String ship;
    private String year;
    private int number;

    public Ship() {
    }

    public Ship(String ship, String year, int number) {
        this.ship = ship;
        this.year = year;
        this.number = number;
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

    @Override
    public String toString() {
        return "Ship{" +
                "ship='" + ship + '\'' +
                ", year='" + year + '\'' +
                ", number=" + number +
                '}';
    }
}
