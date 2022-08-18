package exerciciojava03;

import java.util.Scanner;

public class ExercicioJava03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digitr o nome da primeira pessoa: ");
        String nome01 = entrada.nextLine();
        System.out.print("Digite a idade da primeira pessoa: ");
        int idade01 = entrada.nextInt();
        
        entrada.nextLine();
        
        System.out.print("Digite o nome da segunda pessoa: ");
        String nome02 = entrada.nextLine();
        System.out.print("Digite a idade da segunda pessoa: ");
        int idade02 = entrada.nextInt();
        
        float media = ((idade01 + idade02) / 2);
        
        System.out.format("Nome Pessoa 1: %s\n", nome01);
        System.out.format("Idade %d\n", idade01);
        System.out.format("Nome Pessoa 2: %s\n", nome02);
        System.out.format("Idade: %d\n", idade02);
        System.out.format("A idade media de %s e %s e de %.2f\n", nome01, nome02, media);
    }
    
}
