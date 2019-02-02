package ui;

import java.util.Scanner;

public class Menu {

    public void wyswietl(){
        Scanner wejscie = new Scanner(System.in);


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
                System.out.println("Dodaj");

            }


            if (text.equals("2"))  {
                System.out.println("Usun");
            }


            if ( text.equals("3")) {
                System.out.println("Wyswietl");
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



