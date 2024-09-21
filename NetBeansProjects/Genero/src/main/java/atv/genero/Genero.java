/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package atv.genero;

import java.util.Scanner;

/**
 *
 * @author Andre
 */
public class Genero {

    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);
       
       System.out.print("Qual e seu genero? F ou M ");
       String genero = scanner.nextLine();
       
       if (genero.equals("f")){
           System.out.println("Seu genero e igual");
       }else {
           System.out.println("Seu genero nao e igual");
       }
    }
}
