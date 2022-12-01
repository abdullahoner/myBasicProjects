package OkulProjesi;

import java.util.Scanner;

public class anaMenu {
  static   Scanner s =new Scanner(System.in);
    public static void anaMenu() throws InterruptedException {

        String tercih="";
        do {
            System.out.println("============= PROJE OKUL =============\n" +
                "============== ANA MENU ==============\n" +
                "\n" +
                "\t   1- Okul Bilgileri Goruntule\n" +
                "\t   2- Ogretmen Menu\n" +
                "\t   3- Ogrenci Menu\t\t \n" +
                "\t   Q- ÇIKIŞ\n" +
                    "======================================");
            System.out.print("yapmak istediginiz islemi seciniz : ");
            tercih = s.nextLine().toUpperCase();


            switch (tercih) {
                case "1": {
                    okulBilgileriniYazdir();
                    break;
                }
                case "2": {
                    ogretmen.ogretmenislemleri();
                    break;
                }
                case "3": {
                    ogrenci.ogrenciMenu();
                    break;
                }
                case "Q": {
                    projeDurdur();
                }
                default: {
                    anaMenu();
                }
            }
        }while (!tercih.equalsIgnoreCase("Q"));
        projeDurdur();
        }

    private static void okulBilgileriniYazdir() throws InterruptedException {
        System.out.println("============= PROJE OKUL =============" +
                "\n Okul adı : "  +okul.okulAdi+
                "\n Okul adresi : "+okul.okulAdresi+
                "\n Okul tel No : "+okul.okulTel);
        Thread.sleep(3000);

    }
    public static void projeDurdur(){
        System.out.println("GULE GULE");
        System.exit(0);
    }
}
