package codigo.programacion.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFileUtil {


    public void write(String nombreArchivoSalida, String info){

        try{

            FileWriter fw = new FileWriter(nombreArchivoSalida);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            salida.print(info);
            salida.close();

        }catch (IOException e){
            System.err.println("Error "+e.getMessage());
        }
    }

}
