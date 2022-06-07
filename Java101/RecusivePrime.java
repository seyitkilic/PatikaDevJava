import java.util.Scanner;

public class RecusivePrime {
    public static void primeAsal(int a, int b) {

        if (a == b) {
            System.out.println(a + " Sayisi Asaldir");
            return;
        }

        if (a % b == 0) {
            System.out.println(a + " Sayisi Asal degildir");
            return;
        }

        primeAsal(a, b + 1);
    }

    public static void main(String[] args) {
        // Recursive fonksiyonlar ile kullanicinin girdigi bir sayinin asal olup
        // olmadigini kontrol eden program
        int sayi;

        Scanner sc = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        sayi = sc.nextInt();
        sc.close();

        primeAsal(sayi, 2);
    }
}
