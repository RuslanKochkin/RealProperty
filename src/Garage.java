public class Garage extends RealProperty {
    private  int PSpaces;

    public Garage(Person owner, String cadastralNumber, String address, double price, double area, int PSpaces) {
        super(owner, cadastralNumber, address, price, area);
        this.PSpaces = PSpaces;
    }

    @Override
    public double property() {
        return getPrice() * 1.05 - getPrice();
    }

    @Override
    public String toString() {
        return "Garage owner " + getOwner() +
                ":" + getCadastralNumber() +
                " address " + getAddress() +
                " price " + getPrice() +
                " area " + getArea() + ".  машиномест  " + PSpaces +
                ".\n";
    }
}
