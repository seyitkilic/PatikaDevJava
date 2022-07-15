import java.util.Arrays;
import java.util.Scanner;

public class ArrayOrder {
    public static void main(String[] args) {
        /*
         * Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız.
         * Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.
         */
        int boyut;

        Scanner sc = new Scanner(System.in);
        System.out.print("Dizinin Boyutu n : ");
        boyut = sc.nextInt();

        int[] dizi = new int[boyut];

        System.out.println("Dizinin elemanlarini giriniz : ");
        int i = 0;
        while (i < boyut) {
            System.out.print(i + 1 + "Elemani : ");
            dizi[i] = sc.nextInt();

            i++;
        }
        sc.close();

        Arrays.sort(dizi);

        System.out.print("Siralama : ");

        for (int j : dizi) {
            System.out.print(j + " ");
        }

    }
}
