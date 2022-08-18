
package exerciciojava01;

import java.util.Scanner;

public class ExercicioJava01 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a largura do terreno: ");
        float largura = entrada.nextFloat();
        System.out.print("Digite o comprimento do terreno: ");
        float comprimento = entrada.nextFloat();
        System.out.print("Digite o preço do metro quadrado: R$");
        float preco = entrada.nextFloat();
        
        float area = (largura*comprimento);
        float valorTerreno = (area*preco);
        
        System.out.format("A area do terreno é: %.2f\n", area);
        System.out.format("O preço do terredo e de: R$%.2f\n", valorTerreno);
    }
    
}
