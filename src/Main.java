// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Bilgisayar temelBilgisayar = new TemelBilgisayar();
        System.out.println("Temel Bilgisayar Fiyat :" + temelBilgisayar.fiyat() + " TL");
        System.out.println("TEmel Bilgisayar Açıklama : "  + temelBilgisayar.aciklama());

        //8GB Ram eklenmiş

        Bilgisayar ram8Bilgisayar = new RamEkleDecorator(new TemelBilgisayar() , 8);
        System.out.println("8 GB Ram eklenmiş fiyat : " + ram8Bilgisayar.fiyat() + " TL");
        System.out.println("Açıklama : " + ram8Bilgisayar.aciklama());

        //16GB Ram eklenmiş

        Bilgisayar ram16Bilgisayar = new RamEkleDecorator(new TemelBilgisayar() , 16);
        System.out.println("16 GB Ram eklenmiş fiyat : " + ram16Bilgisayar.fiyat() + " TL");
        System.out.println("Açıklama : " + ram16Bilgisayar.aciklama());

        //500GB Depolama birimi eklemiş

        Bilgisayar depolama500Bilgisayar = new DepolamaBirimiEkleDecorator(new TemelBilgisayar() , 500);
        System.out.println("500 GB SSD eklenmiş  fiyat : " + depolama500Bilgisayar.fiyat() + " TL");
        System.out.println("Açıklama : " + depolama500Bilgisayar.aciklama());

        //2000GB Depolama birimi eklemiş

        Bilgisayar depolama2000Bilgisayar = new DepolamaBirimiEkleDecorator(new TemelBilgisayar() , 500);
        System.out.println("2000 GB SSD eklenmiş  fiyat : " + depolama2000Bilgisayar.fiyat() + " TL");
        System.out.println("Açıklama : " + depolama2000Bilgisayar.aciklama());

        //8 GB ram 500 GB depolama birimi

        Bilgisayar ram8SSD500Bilgisayar = new DepolamaBirimiEkleDecorator(new RamEkleDecorator(new TemelBilgisayar(),8) , 500);
        System.out.println("8 GB Ram 500 GB SSD eklenmiş fiyat : " + ram8SSD500Bilgisayar.fiyat() + " TL");
        System.out.println("Açıklama : " + ram8SSD500Bilgisayar.aciklama());

        //16 GB ram 2000 GB depolama birimi

        Bilgisayar ram16SSD2000Bilgisayar = new DepolamaBirimiEkleDecorator(new RamEkleDecorator(new TemelBilgisayar(),8) , 500);
        System.out.println("16 GB Ram 2000 GB SSD eklenmiş fiyat : " + ram16SSD2000Bilgisayar.fiyat() + " TL");
        System.out.println("Açıklama : " + ram16SSD2000Bilgisayar.aciklama());







    }
}