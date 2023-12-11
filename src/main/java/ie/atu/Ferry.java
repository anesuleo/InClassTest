package ie.atu;

public class Ferry extends Ship
{
    private int passengers;

    public Ferry(){
    }

    public Ferry(String name, String year, int number, int passengers) {
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }


    @Override
    public String toString() {
        return "Ferry{" + super.toString() +
                "passengers=" + passengers +
                '}';
    }
}
