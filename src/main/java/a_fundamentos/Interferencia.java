package a_fundamentos;

public class Interferencia {
    public static void main(String[] args) {
        double b= 5.6;
        var a = 5.6;
        System.out.println(a);

        var c= "texto";
        System.out.println(c);
        c= "outro texto";
        System.out.println(c);
    }
}
