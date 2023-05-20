import java.util.ArrayList;
import java.util.List;

public class House extends RealProperty{
    private  List<Person> personListHom = new ArrayList<>();
    private  int floors;

    public House(Person owner, String cadastralNumber, double price, double area, String address, List<Person> personList, int floors) {
        super(owner, cadastralNumber, price, area, address);
        this.personListHom = personList;
        this.floors = floors;
    }

    @Override
    public double property() {
        return getPrice() * 1.10 - getPrice();
    }

    public List<Person> getPersonListHom() {
        return personListHom;
    }

    public int getRooms() {
        return floors;
    }
    @Override
    public String toString() {
        return "Home owner " + getOwner() +
                ":" + getCadastralNumber() +
                " price " + getPrice() +
                " area " + getArea() + " floors " + floors + " Person " + personListHom +
                " address " + getAddress() +
                ".\n";
    }

}
