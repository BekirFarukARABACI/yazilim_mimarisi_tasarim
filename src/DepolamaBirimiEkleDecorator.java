public class DepolamaBirimiEkleDecorator extends BilgisayarDecorator{

    int depolamaBüyüklügü;
    double fiyat;

    public DepolamaBirimiEkleDecorator(Bilgisayar bilgisayar, int depolamaBüyüklügü) {
        super(bilgisayar);
        this.depolamaBüyüklügü = depolamaBüyüklügü;
    }

    @Override
    public double fiyat() {
        if (depolamaBüyüklügü == 500 ){
            //500 GB SSD eklenirse
            fiyat = super.fiyat() + 3500;
        } else if (depolamaBüyüklügü == 1000) {
            //1000 GB SSD eklenirse
            fiyat = super.fiyat() + 5000;
        }else if (depolamaBüyüklügü == 2000){
            //2000 GB SSD eklenirse
            fiyat = super.fiyat() + 8000;
        }else {
            System.out.println("500 - 1000 - 2000 GB depolama dışında SSD seçilmesi yapılamamaktadır");
        }
        return fiyat;
    }

    @Override
    public String aciklama() {
        return super.aciklama() +" " + depolamaBüyüklügü + " GB SSD disk eklendi... \n";
    }
}
