import java.util.Scanner;

public class TersUcgenYapimi {
    public static void main(String[] args) {
        int basamak;

        Scanner sc = new Scanner(System.in);
        System.out.print("Basamak sayisi : ");
        basamak = sc.nextInt();
        sc.close();

        for (int i = basamak; i > 0; i--) {
            for (int j = basamak - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = (2 * i) - 1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
