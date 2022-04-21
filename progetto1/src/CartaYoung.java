public class CartaYoung extends Carta {
    private String tutor;

    public CartaYoung(int ID, float creditoResiduo, String titolare, String tutor){
        super(ID, creditoResiduo, titolare);
        this.tutor = tutor;
    }
    public CartaYoung(){
        super();
        this.tutor = "";
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("tutor: " + tutor);
    }

    @Override
    public String toString() {
        return super.toString() + ", tutor='" + tutor+"'";
    }
}