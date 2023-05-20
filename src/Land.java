public class Land extends RealProperty{
    private LandPurpose purpose;

    public Land(Person owner, String cadastralNumber, double price, double area,String address,LandPurpose purpose) {
        super(owner, cadastralNumber, price, area, address);
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
                " price " + getPrice() +
                " area " + getArea() + "  " + purpose +
                " address " + getAddress() +
                ".\n";
    }
}
