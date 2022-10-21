public class Inferencia {
    public static void main(String[] args) {
        // O java vai inferir o tipo de variavel pelo dado que você inserir

        double a = 4.5;
        System.out.println(a);

        var b = 4.5;
        System.out.println(b);

        var c = "Texto";
        System.out.println("O tipo de variavel da c é string: " + c);

    }
}
