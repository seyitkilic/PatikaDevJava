package entities.concretes.insurance;

import entities.abstracts.Insurance;

import java.util.Date;

public class CarInsurance extends Insurance {
    public CarInsurance(String insuranceName, int insurancePrice, Date startDate, Date finishDate) {
        super(insuranceName, insurancePrice, startDate, finishDate);
    }

    @Override
    public double calculate() {
        return 1200;
    }
}
