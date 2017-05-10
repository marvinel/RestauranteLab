package labrestaurante;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cagudeloa
 */
public class RegistrandoCamarero {
    
    
    public String RegistrandoCamarero(String answer, int cont){
            
        
        int sw=0;
        try (FileReader escribir = new FileReader("FilesLab/Camareros.txt"); BufferedReader br = new BufferedReader(escribir)) {
            String linea="";
                while(linea!=null){
                    linea=br.readLine();
                    if(linea!=null){
                        if(answer.equals(linea))
                            sw=1;
                        cont++;
                    }
                }
        } catch (IOException ex) {
            //MOSTRAR MENSAJE QUE ALGO SALIÓ MAL
        }
        if(cont==4){
            JOptionPane.showMessageDialog(null, "No pudo ser registrado.\n"
                    + "Límite de camareros alcanzado.", "Atención", 
                        JOptionPane.ERROR_MESSAGE);
        }else{
            if(sw==0){
                try (FileWriter escribir = new FileWriter("FilesLab/Camareros.txt", true); 
                        BufferedWriter bw = new BufferedWriter(escribir)) {
                   
                        bw.write(answer);
                        bw.newLine();
                        JOptionPane.showMessageDialog(null, "Registrado correctamente..", "Atención", 
                        JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException ex) {
                    //MOSTRAR MENSAJE QUE NO SE PUDO CREAR EL ARCHIVO.
                }
            }else{
                JOptionPane.showMessageDialog(null, "Debe seleccionar otro nombre.", "Atención", 
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        return null;
    }
    
}
