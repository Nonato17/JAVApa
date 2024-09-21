/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package atv.kilos;

import java.util.Scanner;

/**
 *
 * @author Andre
 */
public class Kilos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Quantos kg voce tem? ");
        int kg = scanner.nextInt();
        
        if(kg > 70){
            System.out.print("Voce tem mais que 70kg ");
        }else if (kg == 70){
             System.out.print("Voce tem 70kg ");
        }else{
             System.out.print("Voce tem menos que 70kg ");
        } 
}
}