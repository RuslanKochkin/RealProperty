import java.util.ArrayList;
import java.util.List;

public class Apartment extends RealProperty{
   private  List<Person> personList = new ArrayList<>();
   private int rooms;

   public Apartment(Person owner, String cadastralNumber, String address, double price, double area, List<Person> personList, int rooms) {
      super(owner, cadastralNumber, address, price, area);
      this.personList = personList;
      this.rooms = rooms;
   }

   public Apartment(Person owner, String cadastralNumber, String address, double price, double area, int rooms) {
      super(owner, cadastralNumber, address, price, area);
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
              " address " + getAddress() +
              " price " + getPrice() +
              " area " + getArea() + " rooms " + getRooms() + " Person " + getPersonList() +
              ".\n";
   }
}
