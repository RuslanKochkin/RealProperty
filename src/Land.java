public class Land extends RealProperty{
    private LandPurpose purpose;

    public Land(Person owner, String cadastralNumber, String address, double price, double area, LandPurpose purpose) {
        super(owner, cadastralNumber, address, price, area);
        this.purpose = purpose;
    }
    @Override
    public double property() {
        return getPrice() * 1.15 - getPrice();
    }
    public LandPurpose getPurpose() {
        return purpose;
    }
    public String toString() {
        return "Land owner " + getOwner() +
                ":" + getCadastralNumber() +
                " address " + getAddress() +
                " price " + getPrice() +
                " area " + getArea() + "  " + purpose +
                ".\n";
    }
}
