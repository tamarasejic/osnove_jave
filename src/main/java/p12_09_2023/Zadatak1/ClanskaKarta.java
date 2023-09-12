package p12_09_2023.Zadatak1;

public class ClanskaKarta {
    private int discount;
    private String cardNo;

    public ClanskaKarta (String cardNo) {
        this.cardNo = cardNo;
    }


//    getters & setters
    public int getDiscount () {
        return this.discount;
    }
    public void setDiscount (int discount) {
        this.discount = discount;
    }

    public String getCardNo () {
        return this.cardNo;
    }

}
