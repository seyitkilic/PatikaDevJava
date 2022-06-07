import java.util.Scanner;

public class KDV_Tutari {
    public static void main(String[] args) {
        double tutar, oran, fiyat, tutarKdv;

        Scanner input = new Scanner(System.in);

        System.out.print("Miktari gir -> ");
        tutar = input.nextDouble();
        input.close();

        oran = 0;

        if (tutar > 1000)
            oran = 0.08;
        else if (tutar < 0)
            System.out.println("Hata! Negatif Olamaz");
        else
            oran = 0.18;

        fiyat = tutar + tutar * oran;
        tutarKdv = tutar * oran;

        System.out.println("KDV li fiyat -> " + fiyat);
        System.out.println("KDV tutari -> " + tutarKdv);
        System.out.println("KDV hariç fiyat -> " + tutar);
        System.out.println("KDV Orani -> " + oran * 100);

    }
}
