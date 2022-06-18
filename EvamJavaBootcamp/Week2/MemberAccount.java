package Week2;

public class MemberAccount {

    String phoneNumber;
    String name;
    String surName;
    String code;
    double balance;
    int id;

    public MemberAccount() {
        /*
         * Boş Constructor
         */
    }

    public MemberAccount(String phoneNumber, String name, String surName, String code, double balance, int id) {
        /*
         * Constructor Metodu
         */
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.surName = surName;
        this.code = code;
        this.balance = balance;
        this.id = id;
    }

    // Getters and Setters
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String memberCode() {
        // kullanicinin id + isminin ilk 2 harfinden olusan memberCode bilgisini veren
        // metod
        return this.id + this.name.substring(0, 2);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}