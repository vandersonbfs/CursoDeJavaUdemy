import java.util.Scanner;

public class Console {
    public static void main(String[] args) {

        // Aula 28 Console

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o seu nome");
        String nome = ler.nextLine();

        System.out.println("Digite o seu sobrenome");
        String sobreNome = ler.nextLine();

        System.out.printf("Seu nome: %s %S", nome, sobreNome);

    }
}
