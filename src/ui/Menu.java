package ui;

import model.Alkohol;
import model.Papierosy;
import model.Sklep;

import java.math.BigDecimal;
import java.util.Scanner;

public class Menu {

    public void wyswietl(){
        Scanner wejscie = new Scanner(System.in);
        Sklep sklep = new Sklep("Alkohole w akademiku");  // utworzenie sklepu


        System.out.println("1 - dodaj alkohol ");
        System.out.println("2 - usun Produkt ");
        System.out.println("3 - wyswietl ");
        System.out.println("4 - dodaj papierosy ");
    //    System.out.println("5 - usun papierosy ");
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
                sklep.dodajProdukt(Dodajemy);

                System.out.println("Dodano produkt alkoholowy");

            }


            if (text.equals("2"))  {

                System.out.println(sklep);
                int usun = wejscie.nextInt();
                sklep.usunProdukt(usun);
                System.out.println(" usunieto ");
                         }


            if ( text.equals("3")) {
              //  System.out.println("Wyswietl");
                System.out.println(sklep);
            }

            if (text.equals("4") ) {

                System.out.print("Nazwa papierosow : ");
                String nazwa = wejscie.nextLine();

                System.out.print("Cena papierosow : ");
                BigDecimal cena = wejscie.nextBigDecimal();
                wejscie.nextLine();   // enter z bufora !!

                System.out.print("Podaj rodzaj : ");
                String litraz = wejscie.nextLine();

                System.out.print("Podaj ilosc : ");
                int procent = wejscie.nextInt();


                Papierosy Dodajemy = new Papierosy(nazwa,cena,litraz,procent);
                sklep.dodajProdukt(Dodajemy);

                System.out.println("Dodano produkt papierosy");
                wejscie.nextLine();
            }


         //   if (text.equals("5"))  {

           //     System.out.println(sklep);
           //     int usun = wejscie.nextInt();
           //     sklep.usunProdukt(usun);
           //     System.out.println(" usunieto papierosy");
          //  }



            if ( text.equals("q")) {
                System.out.println(" Koniec programu ");
            }


          //  if ( !text.equals("1") && !text.equals("2") &&  !text.equals("3") && !text.equals("q")  ) {
          //      System.out.println("Nieznana komenda ");
          //  }

        }
    }

}



