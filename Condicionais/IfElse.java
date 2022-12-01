package Condicionais;

import javax.swing.JOptionPane;

public class IfElse {
    public static void main(String[] args) {
        // Aula 65 Condicional IF e Else
        String valor = JOptionPane.showInputDialog(
                "Informe o número:");
        int numero = Integer.parseInt(valor);

        if (numero % 2 == 0) {
            System.out.println("O número é par!");
        } else {
            System.out.println("O número é impar!");
        }

    }
}
