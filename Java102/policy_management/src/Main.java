import business.concretes.AddressManager;
import core.InvalidAuthenticationStatus;
import entities.abstracts.Address;
import entities.abstracts.Insurance;
import entities.abstracts.User;
import entities.concretes.account.Enterprise;
import entities.concretes.address.BusinessAddress;
import entities.concretes.address.HomeAddress;
import entities.concretes.insurance.CarInsurance;
import entities.concretes.insurance.HealthInsurance;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InvalidAuthenticationStatus {
        Address homeAddress = new HomeAddress("kayseri", "talas", "efe caddesi", "prestij apt", 8);
        Address businessAddress = new BusinessAddress("Kayseri", "Alparslan", "Köşk", "Ümit", 0);

        ArrayList<Address> addressList = new ArrayList<>();
        addressList.add(homeAddress);
        addressList.add(businessAddress);

        List<Insurance> insuranceList = new ArrayList<>();
        insuranceList.add(new CarInsurance("araba", 3600, new Date(), new Date()));
        insuranceList.add(new HealthInsurance("sağlık", 5000, new Date(), new Date()));

        User user = new User("seyit", "kılıç", "seyit@kilic.com", "1234", "software developer", addressList);

        AddressManager addressManager = new AddressManager();

        Enterprise enterprise = new Enterprise(user, addressManager);
        enterprise.setInsuranceList(insuranceList);

//        System.out.println(enterprise.login("seyit", "1234"));

        System.out.println(enterprise.login("seyit@kilic.com", "1234"));
        enterprise.showUserInfo();

        System.out.println("------------------");
        System.out.println("Sahip Olunan Sigorta Listesi");
        for (Insurance insurance : enterprise.getInsuranceList()) {
            System.out.println(insurance.getInsuranceName() + ", fiyat : " + insurance.getInsurancePrice());
        }
    }
}