import java.util.Arrays;

public class ArrayCount {
    public static void main(String[] args) {
        /*
         * Verilen dizideki hangi elemanin kac defa tekrar ettigini bulan program
         */
        int[] dizi = { 10, 20, 20, 10, 10, 20, 5, 20 };
        boolean[] visited = new boolean[dizi.length];
        Arrays.fill(visited, false);

        System.out.println("Dizi : " + Arrays.toString(dizi));
        System.out.println("Tekrar Sayilari");

        for (int i = 0; i < dizi.length; i++) {
            if (visited[i] == true)
                continue;

            int counter = 1;
            for (int j = i + 1; j < visited.length; j++) {
                if (dizi[i] == dizi[j]) {
                    visited[j] = true;
                    counter++;
                }
            }

            System.out.println(dizi[i] + " Sayisi " + counter + " kere tekrar etti");
        }
    }
}
