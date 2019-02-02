package model;

import java.math.BigDecimal;

public class Papierosy  extends Produkt {



    private String rodzaj;
    private int ilosc;


    // konstruktor parametryczny -> (nazwa jak klasa)
    public Papierosy(String nazwa, BigDecimal cena, String rodzaj, int ilosc) {

        super(nazwa,cena);
        this.rodzaj = rodzaj;
        this.ilosc = ilosc;

    }

    public String getTyp(){
        return "papierosy";
    }


    public  String toString(){
        return super.toString() + "\t"+this.rodzaj + "\t" + this.ilosc+"\t";

    }
}