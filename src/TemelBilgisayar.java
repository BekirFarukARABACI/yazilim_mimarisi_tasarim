//temek bileşen sınıfı
public class TemelBilgisayar implements Bilgisayar{


    @Override
    public double fiyat() {
        return 24999.99; // Fiyatı
    }

    @Override
    public String aciklama() {
        return "Temel Bilgisayar \n";
    }
}
