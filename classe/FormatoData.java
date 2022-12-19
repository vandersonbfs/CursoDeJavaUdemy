package classe;

public class FormatoData {

    int dia;
    int mes;
    int ano;

    FormatoData() {
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    FormatoData(int diaInicial, int mesInicial, int anoInicial) {
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;
    }

    String obterDataFormatada() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }
}
