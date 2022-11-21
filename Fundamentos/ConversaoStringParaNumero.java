import javax.swing.JOptionPane;

public class ConversaoStringParaNumero {

    public static void main(String[] args) {
        // Aula 36 Conversão de String para Número

        String valor1 = JOptionPane.showInputDialog("Digite o primeiro npumero");

        String valor2 = JOptionPane.showInputDialog("Digite o segundo npumero");

        System.out.println("Concatenando os números: " + valor1 + valor2);

        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);

        double soma = numero1 + numero2;
        System.out.println("A soma é " + soma);
        System.out.println("A média é " + soma / 2);

    }
}
