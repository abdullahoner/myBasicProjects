package ManavProjesi;

import java.util.Scanner;

public class urun1 {

   public static void getSogan(){
           Scanner scan=new Scanner(System.in);
           double toplam=0;
           System.out.println("kac kg sogan almak istersiniz");
           int kg= scan.nextInt();
           toplam+=MData.soganFyt*kg;
       System.out.println(kg+" sogan "+toplam+"$");
           MData.toplamTutar +=toplam;
       Devam.devamEdecekMi();
    }

}




