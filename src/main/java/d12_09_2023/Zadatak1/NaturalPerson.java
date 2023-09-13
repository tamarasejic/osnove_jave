package d12_09_2023.Zadatak1;

public class NaturalPerson {
    private String fullName;
    private int idCardNo;
    private String jmbg;
    private boolean isReturningCustomer;

    public NaturalPerson (String fullName, int idCardNo, String jmbg) {
        this.fullName = fullName;
        this.idCardNo = idCardNo;
        this.jmbg = jmbg;
    }

    public NaturalPerson (String fullName, int idCardNo, String jmbg, boolean isReturningCustomer) {
        this.fullName = fullName;
        this.idCardNo = idCardNo;
        this.jmbg = jmbg;
        this.isReturningCustomer = isReturningCustomer;
    }

    public void printInfo() {
        System.out.print(this.fullName + ", " +  this.idCardNo + ",");
    }

//    getters & setters
    public String getFullName () {
        return this.fullName;
    }
    public void setFullName (String fullName) {
        this.fullName = fullName;
    }

    public int getIdCardNo () {
        return this.idCardNo;
    }
    public void setIdCardNo (int idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getJmbg () {
        return this.jmbg;
    }

    public boolean isReturningCustomer () {
        return this.isReturningCustomer;
    }
    public void setReturningCustomer (boolean isReturningCustomer) {
        this.isReturningCustomer = isReturningCustomer;
    }
}
