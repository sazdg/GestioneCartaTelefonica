public class Main {

    public static void main(String[] args) {
        System.out.println("settare il titolare:");


        Carta carta1 = new Carta(1, 0, "Sara");
        carta1.getInfo();

        System.out.println("\n sapere la disponibilità");
        System.out.println(carta1.getDisp());

        System.out.println("\n caricati soldi sulla carta");
        carta1.aggiungiDisp(3);
        System.out.println("totale: " + carta1.getDisp());

        System.out.println("\n azzerare la disponibilita' e numero chiamate ");
        //carta1.reset();
        //carta1.getInfo();

        System.out.println("\n diminuire la disponibilita' chiamate:");
        carta1.aggiungiDisp(1.5f);
        System.out.println("disponibilita' totale: " + carta1.getDisp());
        carta1.chiamata();
        System.out.println("INFROMAZIONI CARTA");
        carta1.getInfo();

        // CARTA GOLD
        System.out.println("\nES CARTA GOLD");
        CartaGold carta2 = new CartaGold(2, 7, "MichaelScott");
        carta2.chiamata();
        carta2.chiamata();
        //carta2.getCashback();
        carta2.chiamata();
        //carta2.getCashback();
        //carta2.getInfo();
        //carta2.reset();
        //carta2.getInfo();

        //CARTA YOUNG
        System.out.println("\nES CARTA YOUNG");
        CartaYoung carta3 = new CartaYoung(3, 5, "Jim", "Toby");
        //carta3.getInfo();
        //carta3.getInfo();
        carta3.chiamata();
        carta3.chiamata();
        CartaYoung carta4 = new CartaYoung();
        carta4.setTutor("Leslie");
        carta4.setTitolare("April");
        carta4.setID(4);
        carta4.aggiungiDisp(5);
        //carta4.getIDcarta();
        //carta4.getInfo();


        Carta carta5 = new Carta(5, 3, "kevin");
        Carta carta6 = new CartaYoung(6, 3.3f, "kelly", "toby");
        Carta carta7 = new Carta(7, 8.6f, "ANGELA");
        Carta carta8 = new Carta(8, 4.1f, "PAM");
        Carta carta9 = new CartaGold(9, 8, "creeD");
        Carta carta10 = new Carta(10, 1.5f, "oscar");

        //VETTORE TESSERE
        System.out.println("\nVettore tessere");
        VetCarte tes= new VetCarte();
        tes.aggiungi(carta1);
        tes.aggiungi(carta3);
        tes.aggiungi(carta4);
        tes.aggiungi(carta2);
        tes.aggiungi(carta5);
        tes.aggiungi(carta6);
        tes.aggiungi(carta7);
        tes.aggiungi(carta8);
        tes.aggiungi(carta9);
        tes.aggiungi(carta10);
        tes.print();

        //carta2.getInfo();
        //carta1.getInfo();
        System.out.println("SPOSTAMENTO CREDITI");
        tes.spostaCredito(carta8, carta6);


        System.out.println("\nCERCARE LA CARTA DI UN TITOLARE");
        tes.cercaCarta("kelly");

        System.out.println("\nCERCARE LA CARTA CON CREDITO MASSIMO");
        tes.cercaCartaMassimo();

        System.out.println("\nSTAMPARE ID E TITOLARE DI TUTTE LE CARTE CON CREDITO MINORE DI UNA CIFRA X");
        tes.filtroCredito(5);


        tes.print();

        System.out.println("\nSTAMPARE LE CARTE IN ORDINE DECRESCENTE DI CREDITO");
        tes.ordineDecrescente();


        tes.cercaCarta("oscar");
        tes.setDisponibilita(9, 3);
        tes.cercaCarta("oscar");
    }
}