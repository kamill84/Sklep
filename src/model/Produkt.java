package model;

import java.math.BigDecimal;

public abstract class Produkt {


    private static  int generator=1;  // jedna zmienna w klasie dla wszystkich w klasie

    protected int id;  // protected znaczy ze bedzie widzocze w klasach papierosy i alkohole
    protected String nazwa;
    protected BigDecimal cena;


    public Produkt(String nazwa, BigDecimal cena) {
        this.id=generator++;
        this.nazwa = nazwa;
        this.cena = cena;
    }


    public int getId(){
        return id;}

        public abstract String getTyp();

    public String toString(){

        return this.id +"\t"+getTyp()+"\t"+ this.nazwa+"\t"+ this.cena +"  pln" ;


    }


}
