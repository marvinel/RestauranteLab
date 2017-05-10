package labrestaurante;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author marvin
 */
public class Camareros {
String direccion = "FilesLab/Comida.txt";
    File archivo = new File(direccion);
    public int camarer0(String answer) {

        int sw = 0;
        if (answer != null) {
            if (!answer.equals("")) {
                sw = 0;
                try (FileReader escribir = new FileReader("FilesLab/Camareros.txt");
                        BufferedReader br = new BufferedReader(escribir)) {
                    String linea = "";
                    while (linea != null) {
                        linea = br.readLine();
                        if (linea != null) {
                            if (answer.equals(linea)) {
                                sw = 1;
                            }
                        }
                    }
                } catch (IOException ex) {
                    //MOSTRAR MENSAJE QUE ALGO SALIÓ MAL
                }

            }

        } else {
            JOptionPane.showMessageDialog(null, "Entrada inválida.", "Atención",
                    JOptionPane.ERROR_MESSAGE);
        }
        return sw;
    }

    public void pedido(JTable tabla1,JTable tabla2, JTable tabla3, JComboBox numerodemesa) {
      
        DefaultTableModel model = (DefaultTableModel) tabla1.getModel();
        try (FileWriter escribir = new FileWriter("FilesLab/Comida.txt",true);
                BufferedWriter bw = new BufferedWriter(escribir)) {

            Object c;
            Object s;
            Object p;
            int t = model.getRowCount();
            
            for (int i = 0; i < t; i++) {
            s = model.getValueAt(i, 1);
            c = model.getValueAt(i, 0);
            p= model.getValueAt(i,2);
            bw.write(c + "," + s + ","+ p+","+numerodemesa.getSelectedItem().toString()+"\r"+"\n");

                //si el archivo esta lleno escribir abajo 

            }

            bw.newLine();
        } catch (IOException ex) {
            //MOSTRAR MENSAJE QUE NO SE PUDO CREAR EL ARCHIVO.
        }
        DefaultTableModel model2 = (DefaultTableModel) tabla2.getModel();
        try (FileWriter escribir = new FileWriter("FilesLab/Bebida.txt",true);
                BufferedWriter bw = new BufferedWriter(escribir)) {

            Object c;
            Object s;
            Object p;
            int t = model2.getRowCount();
            
            for (int i = 0; i < t; i++) {
            s = model2.getValueAt(i, 1);
            c = model2.getValueAt(i, 0);
            p= model2.getValueAt(i,2);
            bw.write(c + "," + s + ","+ p+","+ numerodemesa.getSelectedItem().toString()+"\r"+"\n");

                

            }

            
            bw.newLine();
        } catch (IOException ex) {
            //MOSTRAR MENSAJE QUE NO SE PUDO CREAR EL ARCHIVO.
        }
        
        DefaultTableModel model3 = (DefaultTableModel) tabla3.getModel();
        try (FileWriter escribir = new FileWriter("FilesLab/Postre.txt",true);
                BufferedWriter bw = new BufferedWriter(escribir)) {
            

            Object c;
            Object s;
            Object p;
            int t = model3.getRowCount();
            
            for (int i = 0; i < t; i++) {
            s = model3.getValueAt(i, 1);
            c = model3.getValueAt(i, 0);
            p= model3.getValueAt(i,2);
            bw.write(c + "," + s + ","+ p +","+ numerodemesa.getSelectedItem().toString() +"\r"+"\n");

                

            }

           
            bw.newLine();
        } catch (IOException ex) {
            //MOSTRAR MENSAJE QUE NO SE PUDO CREAR EL ARCHIVO.
        }
    }

    
}
