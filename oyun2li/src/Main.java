
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int say;

        say = 1 + rand.nextInt(20);
        int tahmin;

        int i;
        i = 1;
        System.out.println("0 ile 20 arasında bir sayı tahmin edin ;");

        do {

            tahmin = scanner.nextInt();
            if (tahmin == say) {
                System.out.println("TEBRİKLER bildiniz");
                break;

            }
            if (tahmin >= 21) {
                System.out.println(" LÜTFEN 0 ile 20 ARARSINDA bir sayı tahmin edin ;");
            }


            if (i >= 3) {  System.out.println("HAHAHA kaybettin" + " " + " aklımdaki sayı" + " " + say + " " + "dı/du");
                System.out.println(" oyun zor ise  evet yazın");
                String sec = scanner.next(); int say2 = 1 + rand.nextInt(10);
                if (sec.equals("evet")) {
                    System.out.println("LÜTFEN 0 ile 10 ARARSINDA bir sayı tahmin edin ;");
                    tahmin = scanner.nextInt();

                    if (tahmin == say2) {
                        System.out.println("TEBRİKLER bildiniz");

                    }
                    if (tahmin >= 21) {
                        System.out.println("LÜTFEN 0 ile 20 ARARSINDA bir sayı tahmin edin ;");

                    }
                    if (tahmin != say2) {
                        System.out.println("HAHAHA kaybettin" + " " + " aklımdaki sayı" + " " + say2 + " " + "dı/du");

                    }

                }
                else   {
                    System.out.println("sen bilirsin");
                }
                            break; }
            else {
                System.out.println("Bilemediniz " + (3 - i) + " hakkınız kaldı");
                i++;

            }

        } while (i <= 3);
    }
}



