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
    public void dodajAlkohol(Alkohol alkohol) {
        alkohole.add(alkohol);  // dodanie do listy

    }

    public void dodajPapierosy(Papierosy papierosy) {
       papieros.add(papierosy);  // dodanie do listy

    }



    public void usunAlkohol(int id) {
           // usuniecie z listy
            Iterator<Alkohol> iterator = alkohole.iterator();  // iterator zamiast pętli for,while

        while(iterator.hasNext()){   // petla dopoki sa elemnty na liscie
            Alkohol alkohol = iterator.next();
            if (alkohol.getId() == id){
                iterator.remove();
            }
        }
    }


    public void usunPapieros(int id) {
        // usuniecie z listy
        Iterator<Papierosy> iterator = papieros.iterator();  // iterator zamiast pętli for,while

        while(iterator.hasNext()){   // petla dopoki sa elemnty na liscie
            Papierosy papierosy = iterator.next();
            if (papierosy.getId2() == id){
                iterator.remove();
            }
        }
    }



        public String toString() {
            String rezultat = "id\tnazwa\tcena\n";
            for (Alkohol alkohol : alkohole) {
                rezultat += alkohol + "\n"; }  // mozna dodawac stringi

                for (Papierosy papierosy : papieros) {
                    rezultat += papierosy + "\n";   // mozna dodawac stringi

            }
            return rezultat;
        }
}
