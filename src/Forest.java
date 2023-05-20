public class Forest extends RealProperty{
    private boolean isProtectedZone;

    public Forest(Person owner, String cadastralNumber, String address, double price, double area, boolean isProtectedZone) {
        super(owner, cadastralNumber, address, price, area);
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
                " address " + getAddress() +
                " price " + getPrice() +
                " area " + getArea() + ". ProtectedZone " + isProtectedZone +
                ".\n";
    }
}
