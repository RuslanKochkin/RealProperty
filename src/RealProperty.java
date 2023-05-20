public abstract class RealProperty{
    private final Person owner;
    private final String cadastralNumber;
    private final String address;
    private final double price;
    private final double area;
    public RealProperty(Person owner, String cadastralNumber, String address, double price, double area) {
        this.owner = owner;
        this.cadastralNumber = cadastralNumber;
        this.address = address;
        this.price = price;
        this.area = area;
    }

    public abstract double property();

    public Person getOwner() {
        return owner;
    }

    public String getCadastralNumber() {
        return cadastralNumber;
    }

    public double getPrice() {
        return price;
    }

    public double getArea() {
        return area;
    }

    public String getAddress() {
        return address;
    }

    public double getPropertyTax() {
        return getPropertyTax();
    }

    @Override
    public String toString() {
        return "owner " + owner +
                ":" + cadastralNumber +
                " address " + address +
                " price " + price +
                " area " + area +
                "\n";
    }
}
