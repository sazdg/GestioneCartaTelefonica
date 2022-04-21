public class CartaGold extends Carta {

    private float cashback;

    public CartaGold(int ID, float creditoResiduo, String titolare) {
        super(ID, creditoResiduo, titolare);
        cashback = 0.00f;
    }

    public CartaGold() {
        super();
        cashback = 0.00f;
    }

    @Override
    public void chiamata() {
        super.chiamata();
        float x = 0.90f * 10 / 100;
        cashback += x;
    }


    public float getCashback() {
        System.out.println("Cashback attuale: " + cashback);
        return cashback;
    }

    @Override
    public void reset() {
        super.reset();
        this.cashback = 0;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("cashback: " + cashback);
    }

    @Override
    public String toString() {
                return super.toString() + ", cashback=" + cashback;
    }
}
