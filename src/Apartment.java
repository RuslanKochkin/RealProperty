import java.util.List;

public class Apartment extends RealProperty {
    private final List<Person> personList;
    private final int rooms;

    public Apartment(Person owner, String cadastralNumber, int price, double area, String address, List<Person> personList, int rooms) {
        super(owner, cadastralNumber,price, area, address);
        this.personList = personList;
        this.rooms = rooms;
    }
    public List<Person> getPersonList() {
        return personList;
    }

    public int getRooms() {
        return rooms;
    }

    @Override
    public double property() {
        return getPrice() * 1.05 - getPrice();
    }

    @Override
    public String toString() {
        return "Apartment owner " + getOwner() +
                ":" + getCadastralNumber() +
                " price " + getPrice() +
                " area " + getArea() + " rooms " + getRooms() + " Person " + getPersonList() +
                " address " + getAddress() +
                ".\n";
    }

}
