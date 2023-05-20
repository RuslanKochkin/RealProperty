public class Forest extends RealProperty{
    private final boolean isProtectedZone;

    public Forest(Person owner, String cadastralNumber, double price, double area, String address, boolean isProtectedZone) {
        super(owner, cadastralNumber, price, area, address);
        this.isProtectedZone = isProtectedZone;
    }
    @Override
    public double property() {
        return getPrice() * 1.20 - getPrice();
    }
    public boolean isProtectedZone(Forest forest){
        return isProtectedZone;
    }
    @Override
    public String toString() {
        return "Forest owner " + getOwner() +
                ":" + getCadastralNumber() +
                " price " + getPrice() +
                " area " + getArea() + ". ProtectedZone " + isProtectedZone +
                " address " + getAddress() +
                ".\n";
    }
}
