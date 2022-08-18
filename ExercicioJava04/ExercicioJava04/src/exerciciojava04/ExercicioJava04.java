package exerciciojava04;

import java.util.Scanner;


public class ExercicioJava04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o valor 1: ");
        int x = entrada.nextInt();
        System.out.print("Digite o valor 2: ");
        int y = entrada.nextInt();
        
        int soma = x + y;
        
        System.out.format("A soma entre %d e %d é : %d\n", x, y, soma);
    }
    
}
