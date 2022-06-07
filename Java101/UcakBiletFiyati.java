import java.util.Scanner;

public class UcakBiletFiyati {
    public static void main(String[] args) {
        int mesafe, yas, tip;
        double fiyat;

        Scanner sc = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = sc.nextInt();
        System.out.print("Yasinizi giriniz : ");
        yas = sc.nextInt();
        System.out.print("Yolculuk tipini giriniz : (1 => Tek Yon, 2 => Gidis Donus) : ");
        tip = sc.nextInt();
        sc.close();

        if (mesafe > 0 && yas > 0 && (tip == 1 || tip == 2)) {
            fiyat = mesafe * 0.1;

            if (yas < 12)
                fiyat *= 0.5;
            else if (yas >= 12 && yas < 24)
                fiyat *= 0.9;
            else if (yas >= 65)
                fiyat *= 0.7;

            if (tip == 2) {
                fiyat *= 0.8;
                fiyat *= 2;
            }

            System.out.println("\n\nToplam Tutar = " + fiyat + " TL");
        } else
            System.out.println("Hatali Veri Girdiniz !");
    }
}
