package io;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.Sklep;

import java.io.File;
import java.io.IOException;

public class PlikiJson implements OperacjePlikowe{


    public Sklep odczyt() throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        Sklep sklep = mapper.readValue(new File("przyklad.json"), Sklep.class);

        System.out.println(sklep);
        return sklep;
    }




    public void zapis(Sklep sklep)  {
        ObjectMapper mapper = new ObjectMapper();


        try {
            mapper
                    .writerWithDefaultPrettyPrinter()
                    .writeValue(new File("przyklad.json"), sklep);

        }catch (IOException e){
            e.printStackTrace();
            System.out.println("blad zapisu pliku");

        }


    }


}
