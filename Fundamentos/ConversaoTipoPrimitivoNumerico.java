public class ConversaoTipoPrimitivoNumerico {
    /**
     * @param args
     */
    public static void main(String[] args) {

        double a = 1; // Conversant implicita
        System.out.println(a);

        // Fazendo o casting
        // Conversao explicita (CAST)
        float b = (float) 1.123;
        System.out.println(a);

        final int c = 340;
        // Conversao explicita (CAST)
        byte d = (byte) c;
        System.out.println(d);

        double e = 1.99999;
        int f = (int) e;
        System.out.println(f);
        System.out.println("");
        System.out.println("ConversaoTipoPrimitivoNumerico");

    }
}
