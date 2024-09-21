/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package atv.salario;

/**
 *
 * @author Andre
 */

import java.util.Scanner;
public class Salario {

    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);
       
       System.out.print("Quanto voce ganha? ");
       int salario = scanner.nextInt();
       int salariominimo = 1412;
       int maissalariominimo = salariominimo * 5;
       if (salario >= maissalariominimo){
           System.out.println("voce ganha 5 vezes mais que um salario minimo");
       }else if (salario == salariominimo) {
           System.out.println("voc ganha um salario minimo");
       }else{  
        System.out.println("voce ganha menos que um salario minimo");
       }
    }
}
