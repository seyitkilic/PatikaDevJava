package entities.abstracts;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class User {
    private static LocalDateTime lastLogin;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String job;
    private ArrayList<Address> userAddress;

    public User(String name, String surname, String email, String password, String job, ArrayList<Address> userAddress) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.job = job;
        this.userAddress = userAddress;
    }

    public static LocalDateTime getLastLogin() {
        return lastLogin;
    }

    public static void setLastLogin(LocalDateTime lastLogin) {
        User.lastLogin = lastLogin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public ArrayList<Address> getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(ArrayList<Address> userAddress) {
        this.userAddress = userAddress;
    }
}
