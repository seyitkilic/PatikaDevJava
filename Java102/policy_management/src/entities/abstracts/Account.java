package entities.abstracts;

import business.concretes.AddressManager;
import core.InvalidAuthenticationStatus;

import java.time.LocalDateTime;
import java.util.List;

public abstract class Account implements Comparable {
    private User user;
    private List<Insurance> insuranceList;
    private EnumAuthenticationStatus status;
    private AddressManager addressManager;

    public Account(User user, AddressManager addressManager) {
        this.user = user;
        this.addressManager = addressManager;
    }

    public void showUserInfo() {
        System.out.println("----------------Kullanıcı bilgileri-------------------");
        System.out.println("Adı: " + this.user.getName());
        System.out.println("Soyadı: " + this.user.getSurname());
        System.out.println("Mesleği: " + this.user.getJob());
        System.out.println("Son aktif olduğu zaman " + this.user.getLastLogin());
        System.out.println("---adres bilgileri---");
        for (Address address : this.user.getUserAddress())
            System.out.println(address.toString());
        System.out.println("------------------");
    }

    public EnumAuthenticationStatus login(String eMail, String password) throws InvalidAuthenticationStatus {
        if (this.user.getEmail().equals(eMail) && this.user.getPassword().equals(password)) {
            this.user.setLastLogin(LocalDateTime.now());
            status = EnumAuthenticationStatus.success;
        } else {
            status = EnumAuthenticationStatus.fail;
            throw new InvalidAuthenticationStatus("Böyle bir kullanıcı bulunmamaktadır");
        }

        return status;
    }

    public void addAddress() {
        addressManager.addAddress(this.user);
    }

    public void deleteAddress() {
        addressManager.deleteAddress(this.user);
    }

    @Override
    public int hashCode() {
        return this.user.getEmail().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        User user1 = (User) obj;
        return user1.getEmail().equals(this.user.getName());
    }

    @Override
    public int compareTo(Object o) {
        Account account = (Account) o;
        return this.user.getName().compareTo(account.getUser().getName());
    }

    public abstract double addInsurancePolicy();

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Insurance> getInsuranceList() {
        return insuranceList;
    }

    public void setInsuranceList(List<Insurance> insuranceList) {
        this.insuranceList = insuranceList;
    }

    public EnumAuthenticationStatus getStatus() {
        return status;
    }

    public void setStatus(EnumAuthenticationStatus status) {
        this.status = status;
    }
}
