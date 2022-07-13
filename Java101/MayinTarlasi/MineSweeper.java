import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    private int row; // satir sayisi
    private int column; // sutun sayisi
    private String[][] withMine; // hile, mayinlarin gosterimi
    private String[][] withoutMine; // mayinsiz sekilde haritanin gosterimi
    private boolean isFinish = false; // oyunun bitip bitmediginin kontrolu
    private int winCondition; // oyunu kazanmak icin acilmasi gereken blok sayisi
 
    public MineSweeper(int row, int column){
        /*
         * Constructor metot
         */
        this.row = row;
        this.column = column;
        this.withMine = new String[row][column];
        this.withoutMine = new String[row][column];
    }

    private void ffill(){
        /*
         * hem mayinli gosterimi hem de mayinsiz gosterimi 
         * tamamen - lerden olusacak sekilde dolduran metot
         */
        for (int i = 0; i < withMine.length; i++) {
            for (int j = 0; j < withMine[i].length; j++) {
                withMine[i][j] = "-";
                withoutMine[i][j] = "-";
            }
        }
    }

    public void mineLocations(){
        /*
         * Rastgele olacak sekilde verilen sayida noktayi mayinli hale (*) getiren metot 
         */
        Random random = new Random();

        int mineCounter = (this.row * this.column) / 4; // mayin sayisi
        // kazanma ihtimali: eger kullanici tum kareleri hicbir mayina basmadan acarsa
        // kazanir. 
        this.winCondition = (this.row * this.column) - mineCounter; 

        for (int i = 0; i < mineCounter; i++) {
            int x = random.nextInt(this.row);
            int y = random.nextInt(this.column);

            if (withMine[x][y] == "*")
                i--;
            else
                withMine[x][y] = "*";
        }
    }

    public void print(String[][] matris){
        /*
         * Verilen matrisi uygun sekilde ekrana basan metot
         */
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j]);
            }
            System.out.println();
        }
    }

    public void print(boolean isMine){
        /*
         * Ekrana basilacak olan matrisin secildigi metot
         */
        if (isMine){
            System.out.println("Mayinlarin Konumu ");
            print(withMine);
            System.out.println("------------------------");
            System.out.println("Mayin Tarlasina Hosgeldin");
        }
        else{
            System.out.println("------------------------");
            print(withoutMine);
        }
    }

    public int controller(int x, int y){
        /*
         * Kullanicinin sectigi noktanin cevresindeki mayinlari sayan 
         * ve bu sayiyi donduren metot
         */
        int count = 0;
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if ((x + i < 0) || (y + j < 0) || (x + i >= row) || 
                    (y + j >= column) || (i == 0 && y == 0))
                        continue;
                if (withMine[x+i][y+j].equals("*"))
                    count++;
            }
        }

        return count;
    }


    public void start(){
        /*
         * Tasarlanan oyunun govdesi. Metotlarin birlestigi ve kullanildigi nokta
         */
        ffill();
        mineLocations();
        print(true);
        Scanner sc = new Scanner(System.in);

        while(!isFinish){
            print(false);
            System.out.print("Satir Giriniz: ");
            int satir = sc.nextInt();

            System.out.print("Sutun giriniz: ");
            int sutun = sc.nextInt();

            if ((satir < 0) || (satir >= row) || (sutun < 0) || (sutun >= column)){
                System.out.println("Hatali deger girdiniz, Tekrar Deneyiniz");
                continue;
            }
            else{
                if (withMine[satir][sutun].equals("*")){
                    System.out.println("------------------------");
                    System.out.println("Game OVER!!!");
                    isFinish = true;
                    break;
                }
                else{
                    winCondition--;

                    if(winCondition <= 0){
                        System.out.println("------------------------");
                        System.out.println("Tebrikler!!!");
                        System.out.println("Oyunu Kazandiniz");
                        
                        isFinish = true;
                        break;
                    }
                    else{
                        int count = controller(satir, sutun);
                        withoutMine[satir][sutun] = String.valueOf(count);
                    }
                }
            }
        }
        sc.close();
    }
}
