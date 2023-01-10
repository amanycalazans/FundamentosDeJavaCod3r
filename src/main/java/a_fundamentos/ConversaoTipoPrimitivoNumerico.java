package a_fundamentos;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {

        double a  = 1; //implícita
        System.out.println(a);

        float b = (float) 1.85858525855652; //explícita (CAST)
        System.out.println(b);

        int c = 127;  //explícita (CAST)
        byte d = (byte) c;
        System.out.println(d);

        double e = 1;
        int f = (int) e;
        System.out.println(f);




    }
}
