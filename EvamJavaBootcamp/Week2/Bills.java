package Week2;

import java.util.Date;

public class Bills {

    String memberCode;
    double amount;
    Date processDate;
    int billType;
    int id;

    public Bills() {
        /*
         * boş constructor
         */
    }

    public Bills(String memberCode, double amount, Date processDate, int billType, int id) {
        /*
         * Constructor metod
         */
        this.memberCode = memberCode;
        this.amount = amount;
        this.processDate = processDate;
        this.billType = billType;
        this.id = id;
    }

    // Getters and Setters
    public String getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(String memberCode) {
        this.memberCode = memberCode;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getProcessDate() {
        return processDate;
    }

    public void setProcessDate(Date processDate) {
        this.processDate = processDate;
    }

    public int getBillType() {
        return billType;
    }

    public void setBillType(int billType) {
        this.billType = billType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
