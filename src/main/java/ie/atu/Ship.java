package ie.atu;
public class Ship
{
    private String name;
    private String year;
    private int number;

    public Ship(){
    }

    public Ship(String ship, String year, int number) {
        this.name = "";
        this.year = "";
        this.number = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void vesselDetails()
    {

    }


    @Override
    public String toString() {
        return "Ship{" +
                "ship='" + name + '\'' +
                ", year='" + year + '\'' +
                ", number=" + number +
                '}';
    }
}
