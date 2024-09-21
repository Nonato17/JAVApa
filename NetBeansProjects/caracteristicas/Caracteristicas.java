/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package atv.caracteristicas;

/**
 *
 * @author Andre
 */
import java.util.Scanner;
public class Caracteristicas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
       String meuNome = "andrey";
        int minhaIdade = 19;
        double meuPeso = 75;
        double minhaAltura = 1.75;
        String minhaSerieFavorita = "Peaky Blinders";
        String minhaMusicaFavorita = "Highest in the room";
        String meuJogoFavorito = "GTA 5";

        
        int caracteristicasIguais = 0;

        f (nomePessoa.equalsIgnoreCase(meuNome)) {
            System.out.println("Pessoa com nome igual.");
            caracteristicasIguais++;
        } else {
            System.out.println("Pessoa com nome diferente.");
        }
        if (idadePessoa == minhaIdade) {
            System.out.println("Idade igual.");
            caracteristicasIguais++;
        } else {
            System.out.println("Idade diferente.");
        }
        if (pesoPessoa == meuPeso) {
            System.out.println("Peso igual.");
            caracteristicasIguais++;
        } else {
            System.out.println("Peso diferente.");
        }
        if (alturaPessoa == minhaAltura) {
            System.out.println("Altura igual.");
            caracteristicasIguais++;
        } else {
            System.out.println("Altura diferente.");
        }
        if (seriePessoa.equalsIgnoreCase(minhaSerieFavorita)) {
            System.out.println("Série favorita igual.");
            caracteristicasIguais++;
        } else {
            System.out.println("Série favorita diferente.");
        }
        if (musicaPessoa.equalsIgnoreCase(minhaMusicaFavorita)) {
            System.out.println("Música favorita igual.");
            caracteristicasIguais++;
        } else {
            System.out.println("Música favorita diferente.");
        }
        if (jogoPessoa.equalsIgnoreCase(meuJogoFavorito)) {
            System.out.println("Jogo favorito igual.");
            caracteristicasIguais++;
 
        } else {
            System.out.println("Jogo favorito diferente.");
        }
        if (caracteristicasIguais >= 3) {
            System.out.println("Esta pessoa é bem parecida comigo!");
        } else {
            System.out.println("Esta pessoa tem algumas diferenças.");
      }
   }   
}