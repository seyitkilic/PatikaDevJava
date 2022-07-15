import java.util.Scanner;

public class RecursivePattern {
    public static void main(String[] args) {
        /*
         * Girilen sayi 0 veya negatif olana kadar 5 er 5 er azalan, daha sonra da
         * tekrar
         * girilen sayiya ulasana kadar 5 er 5 er artan bir oruntunun Recursive
         * fonksiyon ile yapilmis programi
         * Ornegin girilen sayi 16 ise cikti - 16 11 6 1 -4 1 6 11 16 seklinde olur
         */
        int sayi;

        Scanner sc = new Scanner(System.in);
        System.out.print("N Sayisi: ");
        sayi = sc.nextInt();
        sc.close();

        System.out.println(patternMethod(sayi, true, sayi));
    }

    public static String patternMethod(int a, boolean yon, int ilkDeger) {

        if (a <= 0) {
            yon = false;
        }

        if (yon)
            return a + " " + patternMethod(a - 5, yon, ilkDeger);
        else {
            if (a > ilkDeger)
                return " ";
            return a + " " + patternMethod(a + 5, yon, ilkDeger);
        }
    }
}
