public class Garage extends RealProperty {
    private  int PSpaces;

    public Garage(Person owner, String cadastralNumber, double price, double area,String address, int PSpaces) {
        super(owner, cadastralNumber, price, area, address);
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
                " price " + getPrice() +
                " area " + getArea() + ".  машиномест  " + PSpaces +
                " address " + getAddress() +
                ".\n";
    }
}
