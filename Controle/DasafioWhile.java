package Controle;

import java.util.Scanner;

public class DasafioWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quantidadeDeNotas = 0;
        double nota = 0;
        double total = 0;

        while (nota != -1) {
            System.out.println("Informe a nota:");
            nota = entrada.nextDouble();

            if (nota <= 10 && nota >= 0) {
                total += nota;
                quantidadeDeNotas++;
            }
        }
        double media = total / quantidadeDeNotas;
        System.out.println("Mèdia = " + media);
        entrada.close();
    }
}
