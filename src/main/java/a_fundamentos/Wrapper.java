package a_fundamentos;

import java.time.temporal.ChronoField;

public class Wrapper {
    public static void main(String[] args) {

        Byte b = 100;
        Short s = 1000;
        Integer i = 10000;
        Long l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 3);

        Float f = 123F;
        Double d = 125.4744;

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo.toString().toUpperCase());

        Character c = '#';
        System.out.println(c + "...");

    }
}
