package methods2;

public class Methods2 {

    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(5, 7);
        System.out.println(sayi);
        int topla=topla2(5,4,7,44,89,44);//variable arguments örneği
        System.out.println(topla);
    }

    public static void ekle() {
        System.out.println("Ekendi");
    }

    public static void sil() {
        System.out.println("Silindi");
    }

    public static void güncelle() {
        System.out.println("Güncellendi");
    }

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static int topla2(int... sayilar) {//variable arguments denir istediğin kadar sayı paremetre alır,int array gibi çalışır
        int top = 0;
        for (int sayi : sayilar) {
            top += sayi;

        }
        return top;
    }

    public static String sehirVer() {
        return "ANKARA";
    }
}
