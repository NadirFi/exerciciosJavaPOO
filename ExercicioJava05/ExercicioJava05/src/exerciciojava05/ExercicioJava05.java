package exerciciojava05;

import java.util.Scanner;

public class ExercicioJava05 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
        System.out.print("Digite o preço do produto: R$");
        float preco = entrada.nextFloat();
        
        System.out.print("Digite a quantidade de produto selecionado: ");
        int qtd = entrada.nextInt();
        
        System.out.print("Digite o valor recebido em dinheiro: R$");
        float valor = entrada.nextFloat();
        
        float qtdTotal = (qtd * preco);
        float troco = (valor - qtdTotal);
        
        System.out.format(" Preço : %.2f\n Quantidade %d\n Valor recebido: %.2f\n Valor a devolver: %.2f\n", preco, qtd, valor, troco);
    }
    
}
