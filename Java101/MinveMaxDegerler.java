import java.util.Scanner;

public class MinveMaxDegerler {
    public static void main(String[] args) {
        // girilen n adet sayidan en buyuk ve en kucuk olanlarini gosteren program

        int i, adet, sayi, buyuk = -100000, kucuk = 100000;

        System.out.print("Kac tane sayi gireceksiniz : ");
        Scanner sc = new Scanner(System.in);
        adet = sc.nextInt();

        i = 0;
        while (i < adet) {
            System.out.print(i + 1 + ". Sayiyi giriniz : ");
            sayi = sc.nextInt();

            if (buyuk < sayi)
                buyuk = sayi;
            if (kucuk > sayi)
                kucuk = sayi;

            i++;
        }
        sc.close();
        System.out.println("En buyuk sayi : " + buyuk);
        System.out.println("En kucuk sayi : " + kucuk);
    }
}
