/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package atv.sobrenome;

import java.util.Scanner;

/**
 *
 * @author Andre
 */
public class Sobrenome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Qual e seu sobrenome? ");
        String sobrenome = scanner.nextLine();
        
        if(sobrenome.equals("nonato")){
            System.out.println("a gente tem o mesmo sobrenome!");
        }else{
            System.out.println("a gente nao tem o mesmo sobrenome!");
        }
        
        
    }
}
