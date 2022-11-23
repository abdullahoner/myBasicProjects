package OkulProjesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OgrenciMenu implements I_Islemler{
    List<Ogrenci> ogrenciList=new ArrayList<>();
    Scanner scan=new Scanner(System.in);

    void ogrMenu(){
        System.out.println("==========ISLEMLER==========\n" +
                "1- EKLEME\n" +
                "2- ARAMA\n" +
                "3- LISTELEME\n" +
                "4 -SILME\n" +
                "Q - CIKIS\n" +
                "SECIMINIZ : ");

        while (true){
            char secim=scan.next().toUpperCase().charAt(0);
            switch (secim){
                case '1':{
                    ekleme();
                }
                case '2':{
                    arama();
                }
                case '3':{

                }
                case '4':{

                }
                case 'Q':{

                }
            }
        }
    }
    @Override
    public void ekleme() {
        System.out.println("isim giriniz : ");
        String isim=scan.nextLine();
        System.out.println("Soyisim giriniz : ");
        String soyisim=scan.nextLine();
        System.out.println("TC No giriniz : ");
        String tcNo=scan.next();
        System.out.println("Yas giriniz : ");
        int yas=scan.nextInt();
        System.out.println("Ogrenci No giriniz : ");
        int ogrNo=scan.nextInt();
        System.out.println("Ogrenci Sınıfı giriniz : ");
        String sinif=scan.next();
        Ogrenci ogrenci=new Ogrenci(isim,soyisim,tcNo,yas,sinif,ogrNo);
        ogrenciList.add(ogrenci);
        ogrMenu();
    }

    @Override
    public void arama() {
        if (!ogrenciList.isEmpty()){
            System.out.println("arama yapmak istediginiz TC No'yu giriniz");
            String aranacakTc=scan.next();
            for (Ogrenci each:ogrenciList) {
                if (each.getTcNo().equals(aranacakTc)){
                    System.out.println(each.toString());

                }
            }
            ogrMenu();
        }else {
            System.out.println("Ogrenci Listesi bos");
            ogrMenu();
        }
    }

    @Override
    public void listeleme() {
        if (!ogrenciList.isEmpty()){
            for (Ogrenci each:ogrenciList) {
                System.out.println(each.toString());

                }
            ogrMenu();
        }else {
            System.out.println("Ogrenci Listesi bos");
            ogrMenu();
        }
    }

    @Override
    public void silme() {
        if (!ogrenciList.isEmpty()){
            System.out.println("Silme islemi yapmak istediginiz TC No'yu giriniz");
            String aranacakTc=scan.next();
            for (int i = 0; i <ogrenciList.size() ; i++) {
                if (aranacakTc.equals(ogrenciList.get(i).getTcNo())){
                    ogrenciList.remove(i);
                    ogrMenu();
                }
            }
            }else {
            System.out.println("Ogrenci Listesi bos");
            ogrMenu();
        }
    }
    @Override
    public void cikis() {
        AnaMenu a=new AnaMenu();
        a.anamenu();
    }
}
