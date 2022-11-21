public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {

        double a = 1; // Conversao implicita
        System.out.println(a);

        // Fazendo o casting
        float b = (float) 1.123; // Conversao explicita (CAST)
        System.out.println(a);

        int c = 340;
        byte d = (byte) c; // Conversao explicita (CAST)
        System.out.println(d);

        double e = 1.99999;
        int f = (int) e;
        System.out.println(f);
        System.out.println("");
        System.out.println("ConversaoTipoPrimitivoNumerico");

    }
}
