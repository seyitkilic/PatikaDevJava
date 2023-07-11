package entities.concretes.insurance;

import entities.abstracts.Insurance;

import java.util.Date;

public class TravelInsurance extends Insurance {
    public TravelInsurance(String insuranceName, int insurancePrice, Date startDate, Date finishDate) {
        super(insuranceName, insurancePrice, startDate, finishDate);
    }

    @Override
    public double calculate() {
        return 700;
    }
}
