package ManavProjesi;

import java.util.Scanner;

public class urun2 {
    public static void getElma(){
        Scanner scan=new Scanner(System.in);
        double toplam=0;
        System.out.println("kac kg elma almak istersiniz");
        int kg= scan.nextInt();
        toplam+=MData.elmaFyt*kg;
        System.out.println(kg+" elma "+toplam+"$");
        MData.toplamTutar +=toplam;
        Devam.devamEdecekMi();
    }
}
