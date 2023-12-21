public class RamEkleDecorator extends BilgisayarDecorator{
    int ramKapsitesi;
    double fiyat;


    public RamEkleDecorator(Bilgisayar bilgisayar, int ramKapasitesi) {
        super(bilgisayar);
        this.ramKapsitesi = ramKapasitesi;
    }

    @Override
    public double fiyat() {
        if (ramKapsitesi == 8 ){
            //8 GB ram eklenirse
            fiyat = super.fiyat() + 2500;
        } else if (ramKapsitesi == 16) {
            //16 GB ram eklenirse
            fiyat = super.fiyat() + 4000;
        }else if (ramKapsitesi == 32){
            //32 GB ram eklenirse
            fiyat = super.fiyat() + 7000;
        }else {
            System.out.println("8 - 16 - 32 GB ram dışında RAM seçilmesi yapılamamaktadır");
        }
        return fiyat;
    }

    @Override
    public String aciklama() {
        return super.aciklama() +" "+ ramKapsitesi + " GB RAM eklendi... \n ";
    }
}
