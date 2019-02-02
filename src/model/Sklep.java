package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sklep {

    private String nazwa;
    private List<Alkohol> alkohole;

    // konstruktr tworzy pusty sklep ->
    public Sklep(String nazwa) {
        this.nazwa = nazwa;
        this.alkohole = new ArrayList<>();


    }

    // dodanie alkoholu do sklepu
    public void dodajAlkohol(Alkohol alkohol) {
        alkohole.add(alkohol);  // dodanie do listy

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

    public void wyswietl(Alkohol alkohol) {

        System.out.println(alkohole);  // dodanie do listy

    }


}
