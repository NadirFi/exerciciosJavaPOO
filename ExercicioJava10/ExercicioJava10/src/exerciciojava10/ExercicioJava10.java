package exerciciojava10;

import java.util.Scanner;

public class ExercicioJava10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a duração em segundos: ");
        int sec = entrada.nextInt();
        
        int hora = sec / 3600;
        int rest = sec % 3600;
        int min = rest / 60;
        int seg = rest % 60;
        
        System.out.format("%d : %d : %d\n", hora, min, seg);
    }
    
}
