package Week2;

import java.util.Date;

public class Payment {
    double amount;
    Date paymentDate;
    boolean status;
    int id;
    int memberid;

    public Payment() {
        /*
         * boş Constructor
         */
    }

    public Payment(double amount, Date paymentDate, boolean status, int id, int memberid) {
        /*
         * Constructor metod
         */
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.status = status;
        this.id = id;
        this.memberid = memberid;
    }

    // Getters and Setters
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMemberid(int memberid) {
        this.memberid = memberid;
    }

    public int getMemberid() {
        return memberid;
    }

}
