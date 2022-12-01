package OkulProjesi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ogrenci {
    static Map<String,String> ogrenciMap = new HashMap<>();
    static Scanner s=new Scanner(System.in);
    public static void ogrenciEkle(){
        ogrenciMap.put("123456987411","Ali, Can, 2008, 3569, 12, A");
        ogrenciMap.put("123456987412","Veli, Yan, 2008, 3559, 12, B");
        ogrenciMap.put("123456987413","Ayse, Can, 2007, 4569, 12, A");
        ogrenciMap.put("123456987414","Ali, San, 2009, 1569, 11, A");
        ogrenciMap.put("123456987415","Alp, Yan, 2009, 3769, 11, A");
    }
    public static void ogrenciMenu() throws InterruptedException {
        String tercih="";
  do {        System.out.println("============= PROJE OKUL =============\n" +
        "=========== OGRENCI MENU ============\n" +
        "\t   1- Ogrenci Listesi Yazdir\n" +
        "\t   2- Soyisimden Ogrenci Bulma\n" +
        "\t   3- Sinif ve Sube Ile Ogrenci Bulma\n" +
        "\t   4- Bilgilerini Girerek Ogrenci Ekleme\n" +
        "\t   5- Kimlik No Ile Kayit Silme \t\n" +
        "\t   A- ANAMENU\n" +
        "\t   Q- ÇIKIŞ");
    System.out.print("giris yapınız : ");
     tercih= s.nextLine().toUpperCase();
    switch (tercih){
        case "1":{
            ogrenciListesiYazdir();
            break;
        }case "2":{
            soyIsimdenOgrenciBulma();
            break;
        }case "3":{
            sinifVeyaSubeIleOgrenciBulma();
            break;
        }case "4":{
            ogrenciEkleme();
            break;
        }case "5":{
            tcNoIleKayitSilme();
            break;
        }case "A":{
            anaMenu.anaMenu();
            break;
        }case "Q":{
            anaMenu.projeDurdur();
            break;
        } default:{
            System.out.println("geçerli kodlama yapınız");
        }
    }

    }while (!tercih.equalsIgnoreCase("Q"));
     anaMenu.projeDurdur();
    }

    private static void ogrenciEkleme() throws InterruptedException {
        Scanner s=new Scanner(System.in);
        System.out.println("Tc no");
        String tcNo=s.nextLine();
        System.out.println("isim");
        String isim=s.nextLine();
        System.out.println("soyisim");
        String soyisim=s.nextLine();
        System.out.println("Dogum yili");
        String dYili=s.nextLine();
        System.out.println("okul No");
        String okulNo=s.nextLine();
        System.out.println("sınıf");
        String sinif=s.nextLine();
        System.out.println("sube ");
        String sube=s.nextLine();
        String bilgi =isim+", "+soyisim+", "+dYili+", "+okulNo+", "+sinif+", "+sube;
        ogrenciMap.put(tcNo,bilgi);


    }

    private static void tcNoIleKayitSilme() throws InterruptedException {

        System.out.println("TC no giriniz");
        String tcNo=s.nextLine();
        String silinecekValue = ogrenciMap.get(tcNo);

        String sonucValue=  ogrenciMap.remove(tcNo);

        try {
            boolean sonuc = sonucValue.equals(silinecekValue);
        } catch (Exception e) {
            System.out.println("girdiginiz TC Noya ait ogretmen bulunamadi.");
        }
        Thread.sleep(1000);

    }

    private static void sinifVeyaSubeIleOgrenciBulma() throws InterruptedException {
        Scanner s=new Scanner(System.in);
        Set<Map.Entry<String,String>> ogrenciEntry=ogrenciMap.entrySet();
        System.out.println("sinif giriniz");
        String sinif=s.nextLine();
        System.out.println("sube giriniz");
        String sube=s.nextLine();
        String value;
        String eachKey;
        String[] valueArr;
        System.out.println("============= YILDIZ KOLEJI =============\n" +
                "=========== OGRENCI LISTESI ============\n" +
                "Tc No        Isim   Soyisim   D Yili  Okul No  Sinif  Sube");

        for (Map.Entry<String,String> eachEntry: ogrenciEntry) {
            eachKey=eachEntry.getKey();
            value= eachEntry.getValue();
            valueArr=value.split(", ");
            if (sinif.equalsIgnoreCase(valueArr[4]) && sube.equalsIgnoreCase(valueArr[5])){
                System.out.printf("%-12s %-6s %-9s %-7s %-8s %-5s %-2s \n",eachKey,valueArr[0],valueArr[1],valueArr[2],valueArr[3],
                        valueArr[4],valueArr[5]); }
        }
        Thread.sleep(1000);

    }

    private static void soyIsimdenOgrenciBulma() throws InterruptedException {
        Set<Map.Entry<String,String>> ogrenciEntry= ogrenciMap.entrySet();
        Scanner s=new Scanner(System.in);
        System.out.println("soyisim giriniz");
        String soyIsim=s.nextLine();
        String value;
        String[] valueArr;



        System.out.println("============= YILDIZ KOLEJI =============\n" +
                "=========== OGRENCI LISTESI ============\n" +
                "Tc No        Isim   Soyisim   D Yili  Okul No  Sinif  Sube");

        for (Map.Entry<String,String> eachEntry: ogrenciEntry) {
            String eachKey=eachEntry.getKey();
            value=eachEntry.getValue();
            valueArr=value.split(", ");

            if (valueArr[1].equalsIgnoreCase(soyIsim)){
                System.out.printf("%-12s %-6s %-9s %-7s %-8s %-5s %-2s \n",eachKey,valueArr[0],valueArr[1],valueArr[2],valueArr[3],
                        valueArr[4],valueArr[5]);
            }
        }
        Thread.sleep(1000);

    }

    private static void ogrenciListesiYazdir() throws InterruptedException {

        Set<Map.Entry<String,String>> myEntrySet = ogrenciMap.entrySet();

        System.out.println("============= YILDIZ KOLEJI =============\n" +
                "=========== OGRENCI LISTESI ============\n" +
                "Tc No        Isim   Soyisim   D Yili  Okul No  Sinif  Sube");
        for (Map.Entry<String,String> each:  myEntrySet
        ) {

            String eachKey= each.getKey();
            String eachValue=each.getValue();
            String eachValueArr[]=eachValue.split(", ");
            System.out.printf("%-12s %-6s %-9s %-7s %-8s %-5s %-2s \n",eachKey,eachValueArr[0],eachValueArr[1],eachValueArr[2],eachValueArr[3],
                    eachValueArr[4],eachValueArr[5]);

        }
        Thread.sleep(5000);
    }
}
