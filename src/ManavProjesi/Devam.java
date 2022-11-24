package ManavProjesi;

import java.util.Scanner;

public class Devam {
    public static void devamEdecekMi(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Başka bir ürün almak ister misiniz ?");
        String secim= scan.next();
        if (secim.equalsIgnoreCase("evet")){
            ManavMenu.menu();
        }else {
            Cikis.getBitir();
        }
    }
}
