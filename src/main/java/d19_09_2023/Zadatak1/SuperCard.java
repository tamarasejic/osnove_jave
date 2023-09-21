package d19_09_2023.Zadatak1;

public class SuperCard {
    private String cardNo;
    private String ownerFullName;
    private double discount;

    public SuperCard() {
    }

    public SuperCard(String cardNo, String ownerFullName, double discount) {
        this.cardNo = cardNo;
        this.ownerFullName = ownerFullName;
        this.discount = discount;
    }

    public void printInfo() {
        System.out.println(this.cardNo + ", " + this.ownerFullName);
    }


    //    getters & setters

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getOwnerFullName() {
        return ownerFullName;
    }

    public void setOwnerFullName(String ownerFullName) {
        this.ownerFullName = ownerFullName;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
