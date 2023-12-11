package ie.atu;

public class Trawler extends Ship
{
    private int tonnage;

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    public Trawler() {
    }

    public Trawler(String ship, String year, int number, int tonnage) {
        super(ship, year, number);
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Trawler{" + super.toString() +
                "tonnage=" + tonnage +
                '}';
    }
}
