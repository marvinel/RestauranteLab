/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labrestaurante;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marvin
 */
public class LabRestaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          try (FileWriter escribir = new FileWriter("FilesLab/Comida.txt");
                        BufferedWriter bw = new BufferedWriter(escribir)) {
    }   catch (IOException ex) {
            Logger.getLogger(LabRestaurante.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
          try (FileWriter escribir = new FileWriter("FilesLab/Bebida.txt");
                        BufferedWriter bw = new BufferedWriter(escribir)) {
    }   catch (IOException ex) {
            Logger.getLogger(LabRestaurante.class.getName()).log(Level.SEVERE, null, ex);
        }
          
          
          
            try (FileWriter escribir = new FileWriter("FilesLab/Postre.txt");
                        BufferedWriter bw = new BufferedWriter(escribir)) {
    }   catch (IOException ex) {
            Logger.getLogger(LabRestaurante.class.getName()).log(Level.SEVERE, null, ex);
        }
            new Lobby().setVisible(true);
    }
    
}
