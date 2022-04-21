public class Carta {

    private float creditoResiduo;
    private int Nchiamate = 0;
    private String titolare;
    private int ID;

    public Carta(){
        this.creditoResiduo = 0;
        this.titolare = "";
        this.ID =0;
    }

    public Carta(int ID, float creditoResiduo, String titolare) {
        this.creditoResiduo = creditoResiduo;
        this.titolare = titolare;
        this.ID = ID;
    }

    public void getInfo() {
        System.out.println("\nnumero carta " + ID + " " + this.titolare + "\nnumero chiamate fatte: "
                + this.Nchiamate + "\ncredito residuo: " + this.creditoResiduo);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public float getDisp() {
        return this.creditoResiduo;
    }

    public void setDisp(float var1){
        this.creditoResiduo = var1;
    }

    public void aggiungiDisp(float var1) {
        this.creditoResiduo += var1;
    }

    public String getTitolare() {
        return titolare;
    }

    public void setTitolare(String titolare) {
        this.titolare = titolare;
    }

    public void reset() {
        this.creditoResiduo = 0;
        this.Nchiamate = 0;
    }

    public void chiamata() {
        if (creditoResiduo > 0.90f) {
            System.out.println("CHIAMATA EFFETTUATA");
            this.creditoResiduo -= 0.90f;
            pluschiamata();
            verificaDisp();
        } else {
            System.out.println("RICARICA IL CREDITO");
        }
    }

    private void verificaDisp() {
        if (this.creditoResiduo <= 0) {
            System.out.println("CHIAMATE ESAURITE");
        } else {
            System.out.println("Credito residuo: " + this.creditoResiduo);
        }
    }

    private void pluschiamata() {
        ++this.Nchiamate;
    }

    @Override
    public String toString() {
        return "Carta " + ID +
                " creditoResiduo=" + creditoResiduo +
                ", Nchiamate=" + Nchiamate +
                ", titolare='" + titolare +"'";
    }
}



