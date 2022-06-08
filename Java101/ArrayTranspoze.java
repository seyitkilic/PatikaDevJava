public class ArrayTranspoze {
    public static void main(String[] args) {
        /*
         * Verilen matrisin transpozesini alan program
         */
        int[][] matris = { { 2, 3, 4 }, { 5, 6, 4 } };

        System.out.println("Matris: ");
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }

        int[][] tempMatris = new int[matris[0].length][matris.length];
        System.out.println("Transpoze: ");
        for (int i = 0; i < matris[0].length; i++) {
            for (int j = 0; j < matris.length; j++) {
                tempMatris[i][j] = matris[j][i];
                System.out.print(tempMatris[i][j] + " ");
            }
            System.out.println();
        }
    }
}
