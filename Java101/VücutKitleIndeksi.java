import java.util.Scanner;

public class VücutKitleIndeksi {
    public static void main(String[] args) {
        int kilo;
        double vki, boy;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = input.nextInt();
        input.close();

        vki = kilo / (boy * boy);

        System.out.println("Vucut Kitle Indeksiniz : " + vki);
    }
}
