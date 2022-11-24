package ManavProjesi;

import java.util.Scanner;

public class urun3 {
    public static void getArmut(){
        Scanner scan=new Scanner(System.in);
        double toplam=0;
        System.out.println("kac kg armut almak istersiniz");
        int kg= scan.nextInt();
        toplam+=MData.armutFyt*kg;
        System.out.println(kg+" armut "+toplam+"$");
        MData.toplamTutar +=toplam;
        Devam.devamEdecekMi();
    }
}
