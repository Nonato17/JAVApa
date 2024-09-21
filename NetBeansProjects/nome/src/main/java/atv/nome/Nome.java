/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package atv.nome;

import java.util.Scanner;

/**
 *
 * @author Andre
 */
public class Nome {

    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);
       
       System.out.print("Qual e o seu nome? ");
       String nome = scanner.nextLine();
       
       if (nome.equals("andrey")){
           System.out.println("pessoa com o nome igual");
       }else {
           System.out.println("pessoa com o nome diferente");
       }
    }
}
