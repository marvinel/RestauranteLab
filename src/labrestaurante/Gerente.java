/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labrestaurante;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author marvin
 */
public class Gerente {
    public int Registrandoadmin(String usuario,String contraseña){
            
        
        int sw=0;
        try (FileReader escribir = new FileReader("FilesLab/Gerentes.txt"); BufferedReader br = new BufferedReader(escribir)) {
            String linea="";
                while(linea!=null){
                    linea=br.readLine();
                    if(linea!=null){
                        String usu="",contra="";
                        int i=0;
                        while(!linea.substring(i,i+1).equals(";")){
                            usu=usu + linea.substring(i,i+1);
                                    i++;
                        }
                        
                        i++;
                        contra=linea.substring(i,linea.length());
                        if(usuario.equals(usu)&&contraseña.equals(contra)){
                             sw=1;
                        }
                           
                        
                    }
                }
        } catch (IOException ex) {
            //MOSTRAR MENSAJE QUE ALGO SALIÓ MAL
        }
        
    return sw;
}
}
