import java.util.Scanner;

public class RecursivePower {
    static int power(int a, int b) {
        if (b == 0)
            return 1;

        return a * power(a, b - 1);
    }

    public static void main(String[] args) {
        // recursive fonksiyon kullanarak kullanicinin girdigi taban ve us
        // degerlerine gore us alma islemi yapan program
        int taban, us;

        Scanner sc = new Scanner(System.in);
        System.out.print("Taban degerini giriniz: ");
        taban = sc.nextInt();
        System.out.print("Us degerini giriniz: ");
        us = sc.nextInt();
        sc.close();

        System.out.println(power(taban, us));
    }
}
