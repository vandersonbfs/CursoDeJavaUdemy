public class NotacaoPonto {
    public static void main(String[] args) {
        // Aula 26 Notação ponto

        String s = "Bom dia X";
        // Passar para maiuscula
        s = s.toUpperCase();
        // Substituir
        s = s.replace("X", "Senhora");
        // Concatenar
        s = s.concat("!!!");

        System.out.println(s);
        System.out.println("Vanderson Batista".toUpperCase());

        String y = "Bom dia X"
                .replace("X", "Gui")
                .toUpperCase()
                .concat("!!!");

        System.out.println(y);
    }
}
