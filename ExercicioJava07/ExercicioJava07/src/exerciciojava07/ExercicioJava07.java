package exerciciojava07;

import java.util.Scanner;

public class ExercicioJava07 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o nome do funcionario: ");
        String nome = entrada.nextLine();
        
        System.out.print("Digite o valor pago por hora: R$");
        float valorH = entrada.nextFloat();
        
        System.out.print("Digite quantas horas o funcionario trabalhou: ");
        float horaT = entrada.nextFloat();
        
        float pagamento = (valorH * horaT);
        
        System.out.format("%s deve receber R$%.2f\n", nome, pagamento);
    }
    
}
