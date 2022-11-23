package OkulProjesi;

import java.util.Scanner;

public class AnaMenu {

    void anamenu(){
        System.out.println("================================\n" +
                "OGRENCI VE OGREMEN YONETIM PANELİ\n" +
                "================================\n" +
                "1- OGRENCI ISLEMLERI\n" +
                "2- OGRETME ISLEMLERI\n" +
                "Q- CIKIS\n" +
                "SECIMINIZ: ");
        Scanner scan=new Scanner(System.in);


        while (true){
            char secim=scan.next().toUpperCase().charAt(0);
            switch (secim){
                case '1':{

                }
                case '2':{

                }
                case 'Q':{

                } default:{
                    System.out.println("gecerli deger giriniz...");
                    anamenu();
                }
            }
        }

    }
}
