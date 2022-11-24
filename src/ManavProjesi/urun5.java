package ManavProjesi;

import java.util.Scanner;

public class urun5 {
    public static void getPatlican(){
        Scanner scan=new Scanner(System.in);
        double toplam=0;
        System.out.println("kac kg patlican almak istersiniz");
        int kg= scan.nextInt();
        toplam+=MData.patlicanFyt*kg;
        System.out.println(kg+" patlican "+toplam+"$");
        MData.toplamTutar +=toplam;
        Devam.devamEdecekMi();
    }
}
