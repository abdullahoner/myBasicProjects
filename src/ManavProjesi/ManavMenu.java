package ManavProjesi;

import java.util.Scanner;

public class ManavMenu {
   static Scanner scan=new Scanner(System.in);
    public static void menu(){

        System.out.println("*****JAVA MANAV'A HOSGELDİNİZ*****\n" +
                "Almak istediğiniz ürün kodunu giriniz\n" +
                "1- SOGAN\n" +
                "2- ELMA\n" +
                "3- ARMUT\n" +
                "4- PATATES\n" +
                "5- PATLICAN\n" +
                "Q- ALISVERISI BITIR");
        System.out.print("ne almak istersiniz ?");
        char secim= 0;

            secim = scan.next().charAt(0);

        switch (secim){
            case '1':{
                urun1.getSogan();
                menu();
            }
            case '2':{
                urun2.getElma();
                menu();
            }
            case '3':{
                urun3.getArmut();
                menu();
            }
            case '4':{
                urun4.getPatates();
                menu();
            }
            case '5':{
                urun5.getPatlican();
                menu();
            }
            case 'Q':{
            Cikis.getBitir();
            } default:{
                menu();
            }

        }

    }
}
