import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int fib1 = 1, fib2 = 1, fib3, sayi;

        Scanner sc = new Scanner(System.in);
        System.out.print("Eleman sayisini gir : ");
        sayi = sc.nextInt();
        sc.close();

        System.out.print(fib1 + " " + fib2 + " ");

        for (int i = 0; i < sayi - 2; i++) {
            fib3 = fib1 + fib2;

            fib1 = fib2;
            fib2 = fib3;

            System.out.print(fib3 + " ");
        }
    }
}
