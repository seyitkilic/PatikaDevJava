package Week1;

import java.util.Scanner;

public class Week1 {
    static String str1 = "code";
    static String[] stringArray = { "Java", "Python", "Bootcamp", "Patika", "JavaScript", "Evam" };
    // static degisken tanimlamalari

    public static void main(String[] args) {
        int counter, i = 0;
        String inputString = "";
        // degisken tanimlamalari

        Scanner sc = new Scanner(System.in);
        System.out.print("Kac tane kelime girelecegini yaziniz: ");
        counter = sc.nextInt();
        // kullanicinin kac adet kelime girisi yapacaginin bilgisi yine kullanicidan
        // alindi

        String[] inputStringArr = new String[counter];
        // bir String array i olusturuldu

        while (i < counter) {
            System.out.print("Bir kelime giriniz: ");
            inputString = sc.nextLine();
            // dongunun her adiminda kullanici bir şeyler yaziyor,
            // yazilan şeyler kelime, cumle veya bosluk olabilir

            inputStringArr[i] = inputString;
            // kullanicinin yazdigi her deger olusturulan String arsray icinde depolaniyor

            i++;
        }

        sc.close();

        System.out.println(firstMethod(inputStringArr));
    }

    public static String firstMethod(String[] array) {
        /*
         * Dönüş tipi String olan ve String[] parametre alan metod
         */

        String result = "";

        for (var i : array) {
            if (i.contains("atik"))
                // String lerin contains metodu ile String in belirtilen String i icerip
                // icermedigi
                // sonucunu boolean veri tipi seklinde donderir
                result = i;
        }

        if (result.isEmpty())
            return "Tanimli value yi iceren bir deger yok";
        else
            return "Tanımlı value yi iceren String deger: " + result;
    }
}
