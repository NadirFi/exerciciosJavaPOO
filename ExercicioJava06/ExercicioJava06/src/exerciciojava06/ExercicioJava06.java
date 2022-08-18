package exerciciojava06;

import static java.lang.Math.PI;
import java.util.Scanner;

public class ExercicioJava06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o RAIO do circulo: ");
        float raio = entrada.nextFloat();
        
        float area = (float) (PI*(Math.pow(raio, 2)));
        
        System.out.format("A area do circulo é: %.3f\n", area);
    }
    
}
