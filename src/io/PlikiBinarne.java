package io;

import model.Sklep;

import java.io.*;

public class PlikiBinarne {


        public Sklep odczyt() throws Exception{

        Sklep sklep = null;

            FileInputStream fileInputStream = new FileInputStream("sklep.bin");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            sklep = (Sklep) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();

                return sklep;

}




public void zapis(Sklep sklep){


    try {
        FileOutputStream fileOutputStream = new FileOutputStream("sklep.bin");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(sklep);
        objectOutputStream.close();
        fileOutputStream.close();


    }catch (FileNotFoundException e){
        System.out.println("brak dostepu do pliku zamowienie.bin");
    }catch (IOException e){
        System.out.println("brak dostepu pliku zamowienie.bin");
        e.printStackTrace();
    }


}

// zapis pliku




}
