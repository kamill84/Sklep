package ui;

import model.Alkohol;
import model.Sklep;

import java.math.BigDecimal;
import java.util.Scanner;

public class Menu {

    public void wyswietl(){
        Scanner wejscie = new Scanner(System.in);
        Sklep sklep = new Sklep("Alkohole w akademiku");  // utworzenie sklepu


        System.out.println("1 - dodaj akohol ");
        System.out.println("2 - usun alkohol ");
        System.out.println("3 - wyswietl ");
        System.out.println("q - wyjscie ");
                    // TODO dodac opcje




        String text="";

            // porownanie string przez equals


        while (!text.equals("q")){



            System.out.print("Wybierz : ");
            text = wejscie.nextLine();

            if (text.equals("1") ) {

                System.out.print("Nazwa alkoholu : ");
                String nazwa = wejscie.nextLine();

                System.out.print("Cena Alkoholu : ");
                BigDecimal cena = wejscie.nextBigDecimal();
                wejscie.nextLine();   // enter z bufora !!

                System.out.print("Podaj litraz : ");
                String litraz = wejscie.nextLine();

                System.out.print("Ilosc procent : ");
                String procent = wejscie.nextLine();


                Alkohol Dodajemy = new Alkohol(nazwa,cena,litraz,procent);
                sklep.dodajAlkohol(Dodajemy);

                System.out.println("Dodano produkt");

            }


            if (text.equals("2"))  {
                System.out.println("Usun");
            }


            if ( text.equals("3")) {
              //  System.out.println("Wyswietl");
                sklep.wyswietl();
            }


            if ( text.equals("q")) {
                System.out.println("Koniec programu ");
            }


            if ( !text.equals("1") && !text.equals("2") &&  !text.equals("3") && !text.equals("q")  ) {
                System.out.println("Nieznana komenda ");
            }

        }
    }

}



