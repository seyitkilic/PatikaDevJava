import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        // girilen sayinin mukemmel sayi olup olmadiginin kontrolunu yapan program
        int sayi, toplam = 0, i = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        sayi = sc.nextInt();
        sc.close();

        while (i < sayi) {
            if (sayi % i == 0)
                toplam += i;
            i++;
        }

        if (toplam == sayi)
            System.out.println(sayi + " Mukemmel sayidir");
        else
            System.out.println(sayi + " Mukemmel sayi degildir");
    }
}
