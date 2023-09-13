package d12_09_2023.Zadatak3;

public class Transaction {
    private String id;
    private Account sender;
    private Account receiver;

    public Transaction (String id) {
        this.id = id;
    }

    public Transaction (String id, Account sender, Account receiver) {
        this.id = id;
        this.sender = sender;
        this.receiver = receiver;
    }

    public double transactionFee (double payment) {
        if (payment < 4500) {
            return 45;
        } else {
            return payment * 0.01;
        }
    }

    public void startTransaction(double payment) {
        double totalPayment = payment +  this.transactionFee(payment);
        if (totalPayment <= this.sender.getCurrentFunds()) {
            this.sender.payOut(totalPayment);
            this.receiver.payIn(payment);
            System.out.println("Successfully transferred " + payment + " rsd.");
        } else {
            System.out.println("Transaction canceled. Not enough funds available.");
        }
    }

    public void printInfo() {
        System.out.println(this.id);
        System.out.println("From Account: " + this.sender.getOwnerFullName() +  " - " + this.sender.getNumberId());
        System.out.println("To Account: " + this.receiver.getOwnerFullName() +  " - " + this.receiver.getNumberId());
        System.out.println();
    }

//    getters & setters
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Account getSender() {
        return this.sender;
    }
    public void setSender(Account sender) {
        this.sender = sender;
    }

    public Account getReceiver() {
        return this.receiver;
    }
    public void setReceiver(Account receiver) {
        this.receiver = receiver;
    }
}
