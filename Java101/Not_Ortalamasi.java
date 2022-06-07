import java.util.Scanner;

public class Not_Ortalamasi {
    public static void main(String[] args) {
        int d1, d2, d3, d4, d5;
        float sum, mean;

        Scanner input = new Scanner(System.in);

        System.out.println("5 dersin notlarini gir");
        d1 = input.nextInt();
        d2 = input.nextInt();
        d3 = input.nextInt();
        d4 = input.nextInt();
        d5 = input.nextInt();

        sum = d1 + d2 + d3 + d4 + d5;
        mean = sum / 5;

        boolean condition = mean > 60;

        System.out.println("Not ortalamaniz -> " + mean);
        System.out.println(condition ? "Sinifi Gectiniz" : "Sinifta Kaldiniz");

        input.close();
    }
}