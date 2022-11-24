package ManavProjesi;

import java.util.Scanner;

public class urun4 {
    public static void getPatates(){
        Scanner scan=new Scanner(System.in);
        double toplam=0;
        System.out.println("kac kg patates almak istersiniz");
        int kg= scan.nextInt();
        toplam+=MData.patatesFyt*kg;
        System.out.println(kg+" patates "+toplam+"$");
        MData.toplamTutar +=toplam;
        Devam.devamEdecekMi();
    }
}
