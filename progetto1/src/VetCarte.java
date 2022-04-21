import java.util.Arrays;

public class VetCarte {
    private Carta[] card;

    public VetCarte() {
        this.card = new Carta[10];
    }

    public void print() {
        for (Carta carta : card) {
            if (carta != null) {
                System.out.println(carta.toString());
            }
        }
    }

    public void getCard(int x){
        System.out.println(card[x]);
    }

    public void setDisponibilita(int x,int y){
        card[x].setDisp(y);
    }
    //AGGIUNGI CARTA CLIENTE AL VETTORE
    public void aggiungi(Carta c) {

        for (int i = 0; i < card.length; i++) {
            if (card[i] == null) {
                card[i] = c;
                System.out.println("aggiunto con successo, indice: " + i);
                break;
            }
        }
    }

    //SPOSTARE CREDITO DA CARTA I A CARTA J
    public void spostaCredito(Carta c1, Carta c2) {
        float tmp = c1.getDisp();
        float tmp2 = c2.getDisp();
        c2.setDisp(tmp);
        c1.setDisp(tmp2);
        System.out.println("carta i: " + c1);
        System.out.println("carta j: " + c2);
    }

    //CERCARE LA CARTA DATO UN TITOLARE
    public void cercaCarta(String titolare) {
        int i = 0;
        while (i < card.length && card[i] != null) {
            if (card[i].getTitolare().toLowerCase().contains(titolare.toLowerCase())) {
                System.out.println("Ecco la carta dell'utente che hai cercato => " + card[i].toString());
                break;
            }
            i++;
        }
        if(card[i] == null)
            System.out.println(titolare + " non trovato");
    }

    //CERCARE LA CARTA CON MAGGIOR CREDITO
    public void cercaCartaMassimo() {
        float tmp = 0.00f;
        int i = 0;
        int trovato = 0;
        while (i < card.length&& card[i] != null) {

            if (card[i].getDisp() >=  tmp) {
                tmp = card[i].getDisp();
                trovato = i;
            }
            i++;
        }
        System.out.println(card[trovato].getTitolare() + " è il titolare della carta con maggiore credito " +
                "\ncredito: " + card[trovato].getDisp());
    }


    //RESTITUISCE CARTE SOTTO UNA SOGLIA X DI CREDITO
    public void filtroCredito(float f) {
        int conteggio = 0;
        int i = 0;

        while (i < card.length && card[i] != null) {
            if (card[i].getDisp() <= f) {
                System.out.println(card[i].getID() + " " + card[i].getTitolare() + ", credito: " + card[i].getDisp());
                conteggio++;
            }
            i++;
        }
        if (conteggio == 0) {
            System.out.println("non ci sono carte sotto questa soglia di credito");
        }
        System.out.println("totale: " + conteggio);
    }

    //STAMPARE IL VETTORE IN ORDINE DECRESCENTE
    public void ordineDecrescente(){

        for(int i = 0; i < card.length; i++) {
            for (int j = i + 1; j < card.length; j++) {
                if (card[i] != null && card[j] != null) {
                    if (card[j].getDisp() >= card[i].getDisp()) {
                        Carta temp = card[j];
                        card[j] = card[i];
                        card[i] = temp;
                    }
                }
            }
        }
        int x = 0;
        while(x < card.length && card[x] != null ){
            System.out.println(card[x].getID() + " ID e credito: " + card[x].getDisp());
            x++;
        }
    }
    @Override
    public String toString() {
        return "VetCarte " +
                "card=" + Arrays.toString(card);
    }
}