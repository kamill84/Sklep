package model;

import java.math.BigDecimal;

public class Alkohol {

    private static  int generator=1;  // jedna zmienna w klasie dla wszystkich w klasie

    private int id;
    private String nazwa;
    private BigDecimal cena;
    private String litraz;
    private String procentAlkoholu;


        // konstruktor parametryczny -> (nazwa jak klasa)
    public Alkohol(String nazwa, BigDecimal cena, String litraz, String procentAlkoholu){

        this.id = generator;
        generator++;  // tworzenie pierwszego wolnego ID, inkrementacja o 1
        this.nazwa = nazwa;
        this.cena = cena;
        this.litraz = litraz;
        this.procentAlkoholu = procentAlkoholu;



    }

    public int getId(){


        return id;
}


}
