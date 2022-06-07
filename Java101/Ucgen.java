import java.util.Scanner;

public class Ucgen {
    public static void main(String[] args) {
        int a, b, c, cevre, u;
        double alankare, alan;
        Scanner input = new Scanner(System.in);
        System.out.println("Ucgenin kenarlarini giriniz: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        input.close();

        cevre = a + b + c;
        System.out.println("Ucgenin cevresi:  " + cevre);
        u = cevre / 2;
        alankare = (u * (u - a) * (u - b) * (u - c));
        alan = Math.sqrt(alankare);
        System.out.println("Ucgenin alani: " + alan);
    }
}