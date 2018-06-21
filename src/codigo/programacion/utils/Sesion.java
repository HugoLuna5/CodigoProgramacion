/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo.programacion.utils;

import codigo.programacion.login.login;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;

/**
 *
 * @author HugoLuna
 */
public class Sesion {
    
     public void closeSession() {
        try {

            File file = new File("user.txt");
            boolean result = Files.deleteIfExists(file.toPath()); //surround it in try catch block
            goToLogin();

        } catch (FileNotFoundException ex) {
            System.err.println("Error: " + ex.getMessage());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
     
     
     public void goToLogin() {
        login l = new login();
        l.setVisible(true);
    }

    
}
