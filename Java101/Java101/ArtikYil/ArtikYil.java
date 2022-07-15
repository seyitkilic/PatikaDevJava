import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        // artik yili hesaplayan program
        int yil;

        Scanner sc = new Scanner(System.in);
        System.out.print("Yil Giriniz : ");
        yil = sc.nextInt();
        sc.close();

        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0)
                    System.out.println(yil + " bir artik yildir !");
                else
                    System.out.println(yil + " bir artik yil degildir !");
            } else
                System.out.println(yil + " bir artik yildir !");
        } else
            System.out.println(yil + " bir artik yil degildir !");
    }
}
