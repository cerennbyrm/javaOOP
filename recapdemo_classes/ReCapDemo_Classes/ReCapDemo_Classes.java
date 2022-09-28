package recapdemo_classes;

public class ReCapDemo_Classes {

    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        int sonucBol = dortIslem.bol(88, 2);
        int sonucCarp = dortIslem.carp(11, 4);
        int sonucCıkar = dortIslem.cıkar(46, 2);
        int sonucTopla = dortIslem.topla(22, 22);

        System.out.println("Toplama işlemi sonucu :" + sonucTopla);
        System.out.println("Çıkarma işlemi sonucu :" + sonucCıkar);
        System.out.println("Çarpma işlemi sonucu :" + sonucCarp);
        System.out.println("Bölme işlemi sonucu :" + sonucBol);

    }

}
