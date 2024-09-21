/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package atividades;

/**
 *
 * @author Andre
 */

import java.util.Scanner;
public class Atividades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       System.out.print("Digite o valor da fatura: ");
       int valordafatura = scanner.nextInt();
       
       System.out.print("Digite o numero de parcelas: ");
       int parcelas = scanner.nextInt();
       double multa = 0.15;       
       double desconto = 10;
       int parcelasreal = valordafatura/parcelas;
       double descontopagamento = valordafatura - (valordafatura/desconto);
       double multaparcelas = parcelasreal + (parcelasreal * multa);
       double valormulta = parcelasreal * multa;
       
     
       System.out.println("O valor da parcelas: "+parcelasreal);
       System.out.println("O valor da fatura com o desconto: "+descontopagamento);
       System.out.println("O valor da parcela com a multa: "+multaparcelas);
       System.out.println("O valor da multa em cada parcela: "+valormulta);
       
       
    }
}
