package exerciciojava09;

import java.util.Scanner;

public class ExercicioJava09 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite A: ");
        float a = entrada.nextFloat();
        
        System.out.print("Digite B: ");
        float b = entrada.nextFloat();
        
        System.out.print("Digite C: ");
        float c = entrada.nextFloat();
        
        float areaQuadrado = (float) Math.pow(a, 2);
        float areaTriangulo = (float) ((a * b) / 2);
        float areaTrapezio = (float) (((a + b) / 2) * c);
        
        System.out.format("AREA DO QUADRADO: %.4f\n", areaQuadrado);
        System.out.format("AREA DO TRIANGULO: %.4f\n",areaTriangulo);
        System.out.format("AREA DO TRAPÉZIO: %.4f\n",areaTrapezio);
    }
    
}
