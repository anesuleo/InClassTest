package ie.atu;

public class Ferry extends Ship
{
    private int passengers;

    public Ferry(int passengers) {
        this.passengers = passengers;
    }

    public Ferry(String ship, String year, int number, int passengers) {
        super(ship, year, number);
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }



}
