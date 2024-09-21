/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package atv.altura;

/**
 *
 * @author Andre
 */
import javax.swing.*;
public class Altura {

    public static void main(String[] args) {
      
        Double altura = Double.parseDouble(JOptionPane.showInputDialog("Quantos metros de altura voce tem?"));
        
        if(altura > 1.75){
            JOptionPane.showMessageDialog(null,"Voce tem mais que 1.75m de altura");
        }else if (altura == 1.75){
             JOptionPane.showMessageDialog(null,"Voce tem 1.75m de altura");
        }else{
            JOptionPane.showMessageDialog(null,"Voce tem menos que 1.75m de altura");
        }
    }
}
