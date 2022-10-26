public class TipoString {
    public static void main(String[] args) {
        // Qual é a lentra no indece 2?
        System.out.println("Olá pessoal".charAt(2));
        // A String é imutavel
        String s = "Boa tarde";
        // Concatenação
        System.out.println(s.concat("!!!"));
        // Concatenação
        System.out.println(s + "!!!");
        // A string inicia com Boa?
        System.out.println(s.startsWith("Boa"));
        // A string inicia com boa?
        System.out.println(s.toLowerCase().startsWith("boa"));
        // A string termina com TARDE?
        System.out.println(s.toUpperCase().endsWith("TARDE"));
        // A string tem quantos caracteres?
        System.out.println(s.length());
        // A string é igual a boa tarde?
        System.out.println(s.toLowerCase().equals("boa tarde"));
        // A string é igual a boa tarde?
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        // Você pode criar uma variavel com var:

        var nome = "Pedro";
        var sobreNome = "Santos";
        var idade = 33;
        var salario = 12345.987;

        System.out.println("Nome " + nome + "\nSobrenome: " + sobreNome + "\nIdade: " + idade + "\nSalario: " + salario
                + salario + "\n\n");

        System.out.printf("O senhor %s %s tem %d anos de idade e ganha R$ %.2f.", nome, sobreNome, idade, salario);

    }

}
