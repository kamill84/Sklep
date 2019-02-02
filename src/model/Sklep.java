package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sklep {

    private String nazwa;
    private List<Produkt> produkty;


    // konstruktr tworzy pusty sklep ->
    public Sklep(String nazwa) {
        this.nazwa = nazwa;
        this.produkty = new ArrayList<>();

    }

    // dodanie alkoholu do sklepu
    public void dodajProdukt(Produkt produkt) {
        produkty.add(produkt);  // dodanie do listy

    }


    public void usunProdukt(int id) {
           // usuniecie z listy
            Iterator<Produkt> iterator = produkty.iterator();  // iterator zamiast pętli for,while

        while(iterator.hasNext()){   // petla dopoki sa elemnty na liscie
            Produkt produkt = iterator.next();
            if (produkt.getId() == id){
                iterator.remove();
            }
        }
    }






        public String toString() {
            String rezultat = "id\ttyp\tnazwa\tcena\n";
            for (Produkt produkt : produkty) {
                rezultat += produkt + "\n"; }  // mozna dodawac stringi
                           return rezultat;
        }
}
