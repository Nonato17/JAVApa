/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package atv.idade;

/**
 *
 * @author Andre
 */

import java.util.Scanner;
public class Idade {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
        System.out.print("Quantos anos ele tem? ");
         int idade = scanner.nextInt();
        if (idade > 21){
            System.out.println("Ele tem mais que 21 anos");
        } else if(idade ==21){
            System.out.println("Ele tem 21 anos");
        }
        else{
            System.out.print("Ele nao tem mais que 21 anos");
        }
         
    }       
}
