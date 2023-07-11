package entities.concretes.insurance;

import entities.abstracts.Insurance;

import java.util.Date;

public class ResidenceInsurance extends Insurance {
    public ResidenceInsurance(String insuranceName, int insurancePrice, Date startDate, Date finishDate) {
        super(insuranceName, insurancePrice, startDate, finishDate);
    }

    @Override
    public double calculate() {
        return 2000;
    }
}
