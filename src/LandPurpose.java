public enum LandPurpose {
    AGRICULTURAL("земли сельскохозяйственного"), SETTLEMENTS("земли населенных пунктов"),INDUSTRIAL("земли промышленности");
    private  String purpose;

    LandPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getPurpose() {
        return purpose;
    }

    @Override
    public String toString() {
        return"\""+purpose+"\"" ;
    }
}
