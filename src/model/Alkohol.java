package model;

import java.math.BigDecimal;

public class Alkohol extends Produkt {  // dziedziczenie z klasy Produkt


    private String litraz;
    private String procentAlkoholu;


        // konstruktor parametryczny -> (nazwa jak klasa)
    public Alkohol(String nazwa, BigDecimal cena, String litraz, String procentAlkoholu){

        super(nazwa,cena);  // super - wywołanie metody z klasy bazowej
        this.litraz = litraz;
        this.procentAlkoholu = procentAlkoholu;



    }



}
