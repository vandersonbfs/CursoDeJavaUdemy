import java.util.Scanner;

public class Console {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o seu nome");
        String nome = ler.nextLine();

        System.out.println("Digite o seu sobrenome");
        String sobreNome = ler.nextLine();

        System.out.printf("Seu nome: %s %s", nome, sobreNome);

        ler.close();

    }
}
