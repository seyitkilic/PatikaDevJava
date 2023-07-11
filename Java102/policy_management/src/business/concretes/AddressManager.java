package business.concretes;

import business.abstracts.AddressService;
import entities.abstracts.Address;
import entities.abstracts.User;
import entities.concretes.address.BusinessAddress;
import entities.concretes.address.HomeAddress;

import java.util.Scanner;

public class AddressManager implements AddressService {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void addAddress(User user) {
        Address address;

        System.out.print("Lütfen şehir giriniz: ");
        String city = scanner.nextLine();
        System.out.print("Lütfen ilçe  giriniz: ");
        String town = scanner.nextLine();
        System.out.print("Lütfen mahalle giriniz: ");
        String neighborhood = scanner.nextLine();
        System.out.print("Lütfen sokak giriniz: ");
        String street = scanner.nextLine();
        System.out.print("Lütfen bina adı/ Şirket adı giriniz: ");
        String buildOrCompanyName = scanner.nextLine();
        System.out.print("Lütfen kapı numarası/ şirket bina numarası giriniz: ");
        int doorOrComplexNumber = scanner.nextInt();

        System.out.println("Girdiğiniz adresin ev adresi olduğunu doğrulamak için (1) iş adresi olduğunu doğrulamak için (2) tuşlayın");
        int choose = scanner.nextInt();

        while (choose < 1 || choose > 2) {
            System.out.println("Lütfen geçerli bir seçim yapınız ");
            choose = scanner.nextInt();
        }

        if (choose == 1) address = new HomeAddress(city, town, street, buildOrCompanyName, doorOrComplexNumber);
        else address = new BusinessAddress(city, town, street, buildOrCompanyName, doorOrComplexNumber);

        user.getUserAddress().add(address);
    }

    @Override
    public void deleteAddress(User user) {
        System.out.print("Lütfen şehir giriniz: ");
        String city = scanner.nextLine();
        System.out.print("Lütfen ilçe  giriniz: ");
        String town = scanner.nextLine();
        System.out.print("Lütfen mahalle giriniz: ");
        String neighborhood = scanner.nextLine();
        System.out.print("Lütfen sokak giriniz: ");
        String street = scanner.nextLine();
        System.out.print("Lütfen bina adı/ Şirket adı giriniz: ");
        String buildOrCompanyName = scanner.nextLine();
        System.out.print("Lütfen kapı numarası/ şirket bina numarası giriniz: ");
        int doorOrComplexNumber = scanner.nextInt();
        String addresToDeleted = city + "/" + town + "/" + neighborhood + "/" + street + "/" + buildOrCompanyName + "/" + doorOrComplexNumber;

        if (user.getUserAddress().stream().map(Object::toString).map(String::toUpperCase).anyMatch(addresToDeleted.toUpperCase()::equals)) {
            for (int i = 0; i < user.getUserAddress().size(); i++) {
                if (user.getUserAddress().get(i).toString().toLowerCase().equals(addresToDeleted.toString().toLowerCase())) {
                    user.getUserAddress().remove(user.getUserAddress().get(i));
                    System.out.println("Adres başarı ile silindi..");
                }
            }
        } else System.out.println("Böyle bir adres bulunmamaktadır");
    }
}
