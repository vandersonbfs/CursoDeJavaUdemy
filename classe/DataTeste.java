package classe;

public class DataTeste {
    public static void main(String[] args) {
        FormatoData d1 = new FormatoData();

        /**
         * 1.dia = 7;
         * d1.mes = 11;
         * d1.ano = 2021;
         **/

        var d2 = new FormatoData(31, 12, 2020);
        /**
         * d2.dia = 31;
         * d2.mes = 12;
         * d2.ano = 2020;
         **/

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

    }

}
