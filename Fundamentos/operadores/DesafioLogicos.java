package operadores;

public class DesafioLogicos {
    public static void main(String[] args) {
        // Desafio Operadores Lógicos

        boolean trabalho1 = true;
        boolean trabalho2 = true;

        boolean comprouTV50 = trabalho1 && trabalho2;
        boolean comprouTV32 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;

        // Operaedor Unário!
        boolean maisSaudavel = !comprouSorvete;

        System.out.println("Comprou TV de 50\"? .........................: " + comprouTV50);
        System.out.println("Comprou TV de 32\"? .........................: " + comprouTV32);
        System.out.println("Comprou Sorvete? ............................: " + comprouSorvete);
        System.out.println("Mais saudável? ..............................: " + maisSaudavel);

    }
}
