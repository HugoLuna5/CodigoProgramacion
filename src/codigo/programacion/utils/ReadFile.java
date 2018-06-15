package codigo.programacion.utils;

import codigo.programacion.model.User;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {


    public void read(String nombreArchivo){

        try{

            FileReader fr = new FileReader(nombreArchivo);
            BufferedReader br = new BufferedReader(fr);

            String linea = br.readLine();

            int numLinea = 0;

            while (linea != null){
                numLinea++;
                System.out.println("Linea "+numLinea+" "+linea);
                linea = br.readLine();
            }
        }catch (FileNotFoundException e){
            System.err.println("Archivo no encontrado");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public String readSave(String nombreArchivo){
        String save= "";
        try{



            FileReader fr = new FileReader(nombreArchivo);
            BufferedReader br = new BufferedReader(fr);

            String linea = br.readLine();

            int numLinea = 0;

            while (linea != null){
                numLinea++;

                if (numLinea == 1  ){
                    save = save + linea;
                }else{
                    save = save +"\n"+ linea;
                }
                linea = br.readLine();
            }
        }catch (FileNotFoundException e){
            System.err.println("Archivo no encontrado");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return save;

    }


    public User readSaveUser(String nombreArchivo){

        User user = new User();
        try{



            FileReader fr = new FileReader(nombreArchivo);
            BufferedReader br = new BufferedReader(fr);

            String linea = br.readLine();

            int numLinea = 0;



            while (linea != null){
                numLinea++;

                if (numLinea == 1  ){
                    user.setId(Integer.parseInt(linea));
                }

                if (numLinea == 2  ){
                    user.setNombre(linea);
                }
                if (numLinea == 3  ){
                    user.setApellidos(linea);
                }
                if (numLinea == 4  ){
                    user.setUsuario(linea);
                }
                if (numLinea == 5  ){
                    user.setCorreo(linea);
                }

                if (numLinea == 6  ){
                    user.setPhoto(linea);
                }

                if (numLinea == 7  ){
                    user.setPhotoPortada(linea);
                }

                if (numLinea == 8  ){
                    user.setRol(linea);
                }
                
                if (numLinea == 9  ){
                    user.setCreated_at(linea);
                }
                linea = br.readLine();
            }
        }catch (FileNotFoundException e){
            System.err.println("Archivo no encontrado");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return user;

    }
}
