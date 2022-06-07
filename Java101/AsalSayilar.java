public class AsalSayilar {
    public static void main(String[] args) {
        String asallar = "";
        for (int i = 2; i < 100; i++) {
            int sayac = 0;
            for (int j = i; j > 0; j--) {
                if (i % j == 0)
                    sayac++;
            }

            if (sayac == 2)
                asallar += i + " ";
        }

        System.out.println(asallar);
    }
}
