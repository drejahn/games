
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


            if (i >= 3) {
                System.out.println(" bir şans daha istiyorsanız evet yazın");
                String sec = scanner.next();
                if (sec.equals("evet")) {
                    System.out.println("son şansınız");
                    tahmin = scanner.nextInt();
                    if (tahmin == say) {
                        System.out.println("TEBRİKLER bildiniz");

                    }
                    if (tahmin>=21) {
                        System.out.println("LÜTFEN 0 ile 20 ARARSINDA bir sayı tahmin edin ;");

                    }
                    if (tahmin != say) {

                        System.out.println("HAHAHA kaybettin" + " " + " aklımdaki sayı" + " " + say + " " + "dı/du");

                    }
                    else {
                        System.out.println("sen bilirsin");
                    }
                }
            break; }


            else {
                    System.out.println("Bilemediniz " + (3 - i) + " hakkınız kaldı");
                    i++;

                }

            } while (i <= 3);
        }
    }




