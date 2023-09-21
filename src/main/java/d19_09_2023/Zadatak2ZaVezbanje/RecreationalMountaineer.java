package d19_09_2023.Zadatak2ZaVezbanje;

public class RecreationalMountaineer extends Mountaineer{
    private int equipmentWeight;
    private String county;
    private int maxClimbHeight;

    public RecreationalMountaineer(String fullName, int equipmentWeight, String county, int maxClimbHeight) {
        super(fullName);
        this.equipmentWeight = equipmentWeight;
        this.county = county;
        this.maxClimbHeight = maxClimbHeight;
    }

    @Override
    public boolean successfulClimb(Mountain mountain) {
        return mountain.getHeight() < (this.maxClimbHeight - this.equipmentWeight * 50);
    }

    @Override
    public int membershipFee() {
        return 1000;
    }

    @Override
    public void printInfo() {
        System.out.println("Recreational mountaineer, id: " + this.getId());
        System.out.println("Name: "+ this.fullName);
        System.out.println("County: " + this.county);
    }


//    getters & setters

    public int getEquipmentWeight() {
        return equipmentWeight;
    }

    public String getCounty() {
        return county;
    }

    public int getMaxClimbHeight() {
        return maxClimbHeight;
    }
}
