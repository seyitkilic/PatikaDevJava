package entities.abstracts;

import java.util.Date;

public abstract class Insurance {
    private String insuranceName;
    private int insurancePrice;
    private Date startDate;
    private Date finishDate;

    public Insurance(String insuranceName, int insurancePrice, Date startDate, Date finishDate) {
        this.insuranceName = insuranceName;
        this.insurancePrice = insurancePrice;
        this.startDate = startDate;
        this.finishDate = finishDate;
    }

    public abstract double calculate();

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public int getInsurancePrice() {
        return insurancePrice;
    }

    public void setInsurancePrice(int insurancePrice) {
        this.insurancePrice = insurancePrice;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }
}
