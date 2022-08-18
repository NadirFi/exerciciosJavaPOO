package exerciciojava08;

import java.util.Scanner;

public class ExercicioJava08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a distancia percorrida: ");
        float km = entrada.nextFloat();
        System.out.print("Digite a quantidade gasta de combustivel: ");
        float combustivel = entrada.nextFloat();
        
        float consumo = (km/combustivel);
        
        System.out.format("Consumo medio é: %.3f litros de combustivel.\n", consumo);
           
    }
    
}
