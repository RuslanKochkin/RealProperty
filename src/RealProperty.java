public abstract class RealProperty{
    private final Person owner;
    private  String cadastralNumber;
    private final double price;
    private final double area;
    String address;
    public RealProperty(Person owner, String cadastralNumber, double price, double area, String address) {
        this.owner = owner;
        this.cadastralNumber = cadastralNumber;
        this.price = price;
        this.area = area;
        this.address = address;
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

    @Override
    public String toString() {
        return "owner " + owner +
                ":" + cadastralNumber +
                " price " + price +
                " area " + area +
                "address " + address +
                "\n";
    }
}