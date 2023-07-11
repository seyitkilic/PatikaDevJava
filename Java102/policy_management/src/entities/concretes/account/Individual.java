package entities.concretes.account;

import business.concretes.AddressManager;
import entities.abstracts.Account;
import entities.abstracts.Insurance;
import entities.abstracts.User;

public class Individual extends Account {
    public Individual(User user, AddressManager addressManager) {
        super(user, addressManager);
    }

    @Override
    public double addInsurancePolicy() {
        double price = 0;

        for (Insurance insurance : getInsuranceList()) {
            price += insurance.calculate();
        }

        return price * 1.1;
    }
}
