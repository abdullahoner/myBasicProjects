package OkulProjesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OgretmenMenu implements  I_Islemler {
    List<Ogretmen> ogretmenList=new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    void ogretmenMenu() {
        System.out.println("==========ISLEMLER==========\n" +
                "1- EKLEME\n" +
                "2- ARAMA\n" +
                "3- LISTELEME\n" +
                "4 -SILME\n" +
                "Q - CIKIS\n" +
                "SECIMINIZ : ");

        while (true) {
            char secim = scan.next().toUpperCase().charAt(0);
            switch (secim) {
                case '1': {
                    ekleme();
                }
                case '2': {
                    arama();
                }
                case '3': {
                    listeleme();
                }
                case '4': {
                    silme();
                }
                case 'Q': {
                    cikis();
                }
            }
        }
    }

    @Override
    public void ekleme() {
        Scanner scan=new Scanner(System.in);
        System.out.println("isim giriniz : ");
        String isim=scan.nextLine();
        System.out.println("Soyisim giriniz : ");
        String soyisim=scan.nextLine();
        System.out.println("TC No giriniz : ");
        String tcNo=scan.next();
        System.out.println("Yas giriniz : ");
        int yas=scan.nextInt();
        System.out.println("Sicil No giriniz : ");
        int sicilNo=scan.nextInt();
        System.out.println("Bolum giriniz : ");
        String bolum=scan.next();
        Ogretmen ogretmen=new Ogretmen(isim,soyisim,tcNo,yas,bolum,sicilNo);
        ogretmenList.add(ogretmen);
        ogretmenMenu();
    }

    @Override
    public void arama() {
        Scanner scan = new Scanner(System.in);
        if (!ogretmenList.isEmpty()) {
            System.out.println("arama yapilacak Tc No giriniz");
            String aranacakTc = scan.next();

            for (Ogretmen each : ogretmenList
            ) {
                if (each.getTcNo().equals(aranacakTc)) {
                    System.out.println(each.toString());

                }
            }

            ogretmenMenu();

        } else {
            System.out.println("liste bos");
            ogretmenMenu();

        }

    }

    @Override
    public void listeleme() {
        Scanner scan=new Scanner(System.in);
        if (!ogretmenList.isEmpty()) {
            for (Ogretmen each : ogretmenList
            ) {
                System.out.println(each.toString());
            }

            ogretmenMenu();
        } else {
            System.out.println("liste bostur");
            ogretmenMenu();
        }
    }

    @Override
    public void silme() {
        if (!ogretmenList.isEmpty()) {
            System.out.println("silme yapilacak Tc No giriniz");
            String aranacakTc = scan.next();

            for (int i = 0; i < ogretmenList.size(); i++) {

                if (aranacakTc.equals(ogretmenList.get(i).getTcNo())) {
                    ogretmenList.remove(i);
                    ogretmenMenu();
                }

            }
        }
    }

    @Override
    public void cikis() {
        AnaMenu a=new AnaMenu();
        a.anamenu();
    }
}
