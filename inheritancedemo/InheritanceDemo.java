package inheritancedemo;

public class InheritanceDemo {

    public static void main(String[] args) {
        //OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        //ogretmenKrediManager.Hesapla();
        KrediUI krediUI=new KrediUI();
        
        krediUI.krediHesapla(new OgretmenKrediManager());
        krediUI.krediHesapla(new TarımKrediManager());
        krediUI.krediHesapla(new AskerKrediManager());
    }

}
