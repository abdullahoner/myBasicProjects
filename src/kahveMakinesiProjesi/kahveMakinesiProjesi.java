package kahveMakinesiProjesi;

import java.util.Scanner;

public class kahveMakinesiProjesi {
    static String secim;
    static String boyut;
    static String  seker;
    static String  sut;
    public static void main(String[] args) {
        int sayac = 0;

        do {
            sayac = 0;
            String secim=hangiKahveyiIstersiniz();

            if (secim.equalsIgnoreCase("turk kahvesi")){
                System.out.println("Türk kahvesi hazırlanıyor...");
            }

            else if (secim.equalsIgnoreCase("filtre kahve")){
                System.out.println("filtre kahvesi hazırlanıyor...");
            }

            else if (secim.equalsIgnoreCase("Espresso")){
                System.out.println("Espresso hazırlanıyor...");
            }
            else {
                System.out.println("Hatalı tuşlama yaptınız!");
                sayac++;
            }
        }while (sayac !=0);

        sutIstermisiniz();
        sekerIstermisin();
        hangiBoyIstersiniz();
        sonuc();
    }
    private static void sonuc() {
        System.out.println(secim+" "+ boyut+" hazırdır afiyet olsun");
    }

    private static void hangiBoyIstersiniz() {
        boyut ="";
        Scanner scan = new Scanner(System.in);
        System.out.println("Hangi boyutta olsun? (Buyuk boy - orta boy - kuçuk boy olarak giriniz.) :");
        boyut= scan.nextLine();
        if (boyut.equalsIgnoreCase("buyuk boy")){
            System.out.println(boyut+ " kahveniz hazırlanıyor...");
        } else if (boyut.equalsIgnoreCase("orta boy")){
            System.out.println(boyut+ " kahveniz hazırlanıyor...");
        }else if (boyut.equalsIgnoreCase("kucuk boy")){
            System.out.println(boyut+ " kahveniz hazırlanıyor...");
        }else {
            System.out.println("hatalı giriş");
        }
    }

    public static void sekerIstermisin() {
        Scanner scan = new Scanner(System.in);
        System.out.println("seker eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız)");

        seker = scan.nextLine();
        int sekerS=0;

        if (seker.equalsIgnoreCase("evet")){
            System.out.println("kaç şeker istiyorsunuz");
            sekerS= scan.nextInt();
            String bos= scan.nextLine();
            System.out.println(sekerS+ " seker ekleniyor...");

        }  else {
            System.out.println("seker eklenmiyor.");
        }
    }
    public static void sutIstermisiniz() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız)");

        sut = scan.nextLine();

        if (sut.equalsIgnoreCase("evet")){
            System.out.println("Süt ekleniyor...");
        }else {
            System.out.println("Süt eklenmiyor.");
        }
    }
    public static String hangiKahveyiIstersiniz() {
        Scanner scan =new Scanner(System.in);

        System.out.println("Hangi kahveyi istersiniz\n" +
                "1.Türk kahvesi\n" +
                "2.Filtre Kahve\n" +
                "3.Espresso");
        secim = scan.nextLine();

        return secim;
    }
}
