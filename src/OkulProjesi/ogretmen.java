package OkulProjesi;

import java.util.*;

public class ogretmen {
    static Scanner s=new Scanner(System.in);
    static Map<String,String> ogretmenlerMap=new HashMap<>();
    public static void ogretmenEkle() {
        ogretmenlerMap.put("123456987411","Ali, Can, 1980, Matematik");
        ogretmenlerMap.put("123456987412","Veli, Yan, 1981, Fizik");
        ogretmenlerMap.put("123456987413","Ayse, Can, 1982, Kimya");
        ogretmenlerMap.put("123456987414","Ali, San, 1983, Kimya");
        ogretmenlerMap.put("123456987415","Alp, Yan, 1984, Matematik");
    }

    public static void ogretmenislemleri() throws InterruptedException {
        String tercih="";
        do {
            System.out.println("============= PROJE OKUL =============\n" +
                    "=========== OGRETMEN MENU ============\n" +
                    "\n" +
                    "\t   1- Ogretmenler Listesi Yazdir\t\n" +
                    "\t   2- Soyisimden Ogretmen Bulma\n" +
                    "\t   3- Branstan Ogretmen Bulma\n" +
                    "\t   4- Bilgilerini Girerek Ogretmen Ekleme\n" +
                    "\t   5- Kimlik No Ile Kayit Silme \t\n" +
                    "\t   A- ANAMENU\n" +
                    "\t   Q- ÇIKIŞ\n");
            System.out.print("seciminizi yapınız : ");

             tercih = s.nextLine().toUpperCase();

            switch (tercih) {
                case "1": {
                    ogretmenListesiYazdir();
                    break;
                }
                case "2": {
                    soyIsimdenOgretmenBulma();
                    break;
                }
                case "3": {
                    branstanOgretmenBulma();
                    break;
                }
                case "4": {
                    ogretmenEkleme();
                    break;
                }
                case "5": {
                    kayitSilme();
                    break;
                }
                case "A": {
                    anaMenu.anaMenu();
                }
                case "Q": {
                    System.exit(0);
                }
                default: {
                    System.out.println("hatalı tuslama yaptınız");
                }
            }
        }while (!tercih.equalsIgnoreCase("Q")) ;
        anaMenu.projeDurdur();
    }

    public static void kayitSilme() {
        System.out.println("Silinecek ogretmen kimlik no giriniz");
        String silinecekOgretmen=s.nextLine();

        String silinecekValue=ogretmenlerMap.get(silinecekOgretmen);

        String sonucValue= ogretmenlerMap.remove(silinecekOgretmen);

        try {
            boolean sonuc = sonucValue.equals(silinecekValue);
        } catch (Exception e) {
            System.out.println("Istediginiz Tc numarasi ile ogretmen bulunamadi");
        }
    }

    private static void ogretmenEkleme() throws InterruptedException {
        Scanner s=new Scanner(System.in);
        System.out.println("Tc no");
        String tcNo=s.nextLine();
        System.out.println("isim");
        String isim=s.nextLine();
        System.out.println("soyisim");
        String soyisim=s.nextLine();
        System.out.println("Dogum yili");
        String dYili=s.nextLine();
        System.out.println("Brans");
        String brans=s.nextLine();
        String bilgi =isim+", "+soyisim+", "+dYili+", "+brans;
        ogretmenlerMap.put(tcNo,bilgi);
        //Thread.sleep(5000);
        ogretmenislemleri();

    }

    private static void branstanOgretmenBulma() throws InterruptedException {
        Scanner s=new Scanner(System.in);

        System.out.println("bransi giriniz");
        String brans=s.nextLine();
        String value;
        String eachKey;
        String[] valueArr;

        Set<Map.Entry<String,String>> ogretmenEntry=ogretmenlerMap.entrySet();

        System.out.println("============= PROJE OKUL =============\n" +
                "====== BRANS ILE OGRETMEN ARAMA ========\n"+
                "TcNo        Isim   Soyisim   D.Yili  Brans");

        for (Map.Entry<String,String> eachEntry: ogretmenEntry) {
          eachKey=eachEntry.getKey();
         value= eachEntry.getValue();
         valueArr=value.split(", ");
            if (brans.equalsIgnoreCase(valueArr[3])){
                System.out.printf("%11s %-6s  %-8s %4s    %s \n" , eachKey,valueArr[0],valueArr[1],
                        valueArr[2],valueArr[3]);
            }
        }
        //Thread.sleep(5000);
        ogretmenislemleri();
    }

    private static void soyIsimdenOgretmenBulma() throws InterruptedException {
        Scanner s=new Scanner(System.in);
        System.out.println("soyisim giriniz");
        String soyIsim=s.nextLine();
        String value;
        String[] valueArr;

   Set<Map.Entry<String,String>> ogretmenEntry= ogretmenlerMap.entrySet();

        System.out.println("============= PROJE OKUL =============\n" +
                "====== SOYISIM ILE OGRETMEN ARAMA ========\n"+
                "TcNo        Isim   Soyisim   D.Yili  Brans");

        for (Map.Entry<String,String> eachEntry: ogretmenEntry) {
           String eachKey=eachEntry.getKey();
            value=eachEntry.getValue();
            valueArr=value.split(", ");

            if (valueArr[1].equalsIgnoreCase(soyIsim)){
                System.out.printf("%11s %-6s  %-8s %4s    %s \n" , eachKey,valueArr[0],valueArr[1],
                        valueArr[2],valueArr[3]);
            }
        }
        //Thread.sleep(5000);
        ogretmenislemleri();
    }

    private static void ogretmenListesiYazdir() throws InterruptedException {

        Set<Map.Entry<String,String>> ogretmenEntrySet= ogretmenlerMap.entrySet();
        System.out.println("============= PROJE OKUL =============\n" +
                "=========== OGRETMEN LISTESI ============\n"+
                "TcNo        Isim   Soyisim   D.Yili  Brans");

        for (Map.Entry<String,String> each: ogretmenEntrySet
        ) {
            String eachKey=each.getKey();
            String eachValue=each.getValue();

            String eachValuarr[]=eachValue.split(", ");
            System.out.printf("%11s %-6s  %-8s %4s    %s \n" , eachKey,eachValuarr[0],eachValuarr[1],
                    eachValuarr[2],eachValuarr[3]);
        }
        Thread.sleep(1000);

    }


}

