package operadores;

public class Ternario {
    public static void main(String[] args) {
        double media = 5.6;
        String resultadoParcial = media >= 5.0 ? "em recuperação" : "reprovado";

        String resultado = media >= 7.0 ? "aprovado." : resultadoParcial;

        System.out.println("O aluno está " + resultado);
    }
}
