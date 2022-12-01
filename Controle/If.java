package Controle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {

        // Aula 62 Condicional IF

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a média: ");
        double media = entrada.nextDouble();

        if (media <= 10 && media >= 7.0) {
            System.out.println("Aprovado, Parabéns!");
            System.out.println("");
        } else {
            System.out.println("Reprovado!");
        }
        entrada.close();

    }
}
