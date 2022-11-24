package MarketProjesi;

public class MarketRunner extends GunlukKazanclar{
    public static void main(String[] args) {
        MarketRunner market=new MarketRunner();
        market.gunclukKazanclariListele();

        market.ortalamaKazancHesapla();


        market.getOrtalamaUstuGunler();
        System.out.println("*************************************");
        market.getOrtalamaALtiGunler();


    }
}
