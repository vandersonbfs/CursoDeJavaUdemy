public class Temperatura {
    public static void main(String[] args) {
        // Aula 21 - Desafio Variaveis e Constantes: Converter fahrenheit para Celcius
        // (ºF - 32) x 5/9 = ºC

        final double FATOR = 5.0 / 9.0;
        final double AJUSTE = 32;

        double fahrenheit = 86;
        double celcius = (fahrenheit - AJUSTE) * FATOR;

        System.out.println(celcius);

    }
}
