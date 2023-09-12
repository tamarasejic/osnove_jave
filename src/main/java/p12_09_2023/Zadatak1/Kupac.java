package p12_09_2023.Zadatak1;

public class Kupac {
    private String fullName;
    private ClanskaKarta membershipCard;

    public Kupac (String fullName, ClanskaKarta membershipCard) {
        this.fullName = fullName;
        this.membershipCard = membershipCard;
    }

    public void printInfo () {
        System.out.println(this.fullName + " - " + this.membershipCard.getCardNo());
    }

//    getters

    public String getFullName () {
        return this.fullName;
    }

    public ClanskaKarta getMembershipCard  () {
        return this.membershipCard;
    }

}
