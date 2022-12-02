package OkulProjesi01;

import java.util.Scanner;

public class AnaMenu {

    void anamenu(){

        System.out.println("================================\n" +
                "OGRENCI VE OGREMEN YONETIM PANELİ\n" +
                "================================\n" +
                "1- OGRENCI ISLEMLERI\n" +
                "2- OGRETMEN ISLEMLERI\n" +
                "Q- CIKIS\n" +
                "SECIMINIZ: ");

        Scanner scan=new Scanner(System.in);


        while (true){
            char secim=scan.next().toUpperCase().charAt(0);
            switch (secim){
                case '1':{
                    OgrenciMenu ogrenci=new OgrenciMenu();
                    ogrenci.ogrMenu();

                }
                case '2':{
                    OgretmenMenu ogretmen=new OgretmenMenu();
                    ogretmen.ogretmenMenu();
                }
                case 'Q':{
                    System.exit(0);

                } default:{
                    System.out.println("gecerli deger giriniz...");
                    anamenu();
                }
            }
        }

    }
}
