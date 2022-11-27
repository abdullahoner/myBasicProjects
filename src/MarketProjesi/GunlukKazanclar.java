package MarketProjesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GunlukKazanclar {

        Random r=new  Random();
        int pazartesi=r.nextInt(1000)+1;
        String p_tesiKazanc="Pazartesi Gunu Cirsou : "+ pazartesi;
        int sali=r.nextInt(1000)+1;
        String saliKazanc="Sali Gunu Cirsou : "+ sali;
        int carsamba=r.nextInt(1000)+1;
        String carsambaKazanc="Carsamba Gunu Cirsou : "+ carsamba;
        int persembe=r.nextInt(1000)+1;
        String persembeKazanc="Persembe Gunu Cirsou : "+ persembe;
        int cuma=r.nextInt(1000)+1;
    String cumaKazanc="Cuma Gunu Cirsou : "+ cuma;
        int cumartesi=r.nextInt(1000)+1;
        String c_tesiKazanc = "Cumartesi Gunu Cirsou : "+ cumartesi;
        int pazar=r.nextInt(1000)+1;
    String pazarKazanc = "Pazar Gunu Cirsou : "+ pazar;


 int toplam;
    protected  void gunclukKazanclariListele(){
        System.out.println(" p.tesi cirosu   : "+pazartesi+"$"+
                "\n salı cirosu     : "+sali+"$"+
                "\n çarşamba cirosu : "+carsamba+"$"+
                "\n perşembe cirosu : "+persembe+"$"+
                "\n cuma cirosu     : "+cuma+"$"+
                "\n c.tesi cirosu   : "+cumartesi+"$"+
                "\n pazar cirosu    : "+pazar+"$");
    }
    protected void ortalamaKazancHesapla(){
        int kazanclarToplami =pazartesi+sali+carsamba+persembe+cuma+cumartesi+pazar;
        int kazancOrtalamasi= kazanclarToplami /7;
        System.out.println("haftalık kazancınız : "+kazanclarToplami+"$");
        System.out.println("haftalık kazanc ortalamanız : "+kazancOrtalamasi+"$");

    }
    protected  void getOrtalamaUstuGunler() {
        String [] arrGunler = {"Pazartesi","Salı","Carsamba","Persembe","Cuma","Cumartesi","Pazar"};
        int kazanclarToplami =pazartesi+sali+carsamba+persembe+cuma+cumartesi+pazar;
        int kazancOrtalamasi= kazanclarToplami /7;
        List<Integer> gunler=new ArrayList<>();
        gunler.add(pazartesi);
        gunler.add(sali);
        gunler.add(carsamba);
        gunler.add(persembe);
        gunler.add(cuma);
        gunler.add(cumartesi);
        gunler.add(pazar);
        List<String> ortalamaUstuG=new ArrayList<>();

        for (int i = 0; i <gunler.size() ; i++) {
            if (kazancOrtalamasi<gunler.get(i)){
                System.out.println("ortalamanın üstündeki kazanclarınız : "+arrGunler[i]+"=>"+gunler.get(i)+"$");
                ortalamaUstuG.add(""+i);
            }
        }

    }
    protected  void getOrtalamaALtiGunler() {
        String [] arrGunler = {"Pazartesi","Salı","Carsamba","Persembe","Cuma","Cumartesi","Pazar"};
        int kazanclarToplami =pazartesi+sali+carsamba+persembe+cuma+cumartesi+pazar;
        int kazancOrtalamasi= kazanclarToplami /7;
        List<Integer> gunler=new ArrayList<>();
        gunler.add(pazartesi);
        gunler.add(sali);
        gunler.add(carsamba);
        gunler.add(persembe);
        gunler.add(cuma);
        gunler.add(cumartesi);
        gunler.add(pazar);
        List<String> ortalamaAltiG=new ArrayList<>();
        for (int i = 0; i <gunler.size() ; i++) {
            if (kazancOrtalamasi>gunler.get(i)){
                ortalamaAltiG.add(""+i);
                System.out.println("ortalamanın altındanki kazanclarınız : "+arrGunler[i]+"=>"+gunler.get(i)+"$");

            }
        }

    }
}



