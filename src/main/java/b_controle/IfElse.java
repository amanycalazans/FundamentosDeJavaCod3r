package b_controle;

import javax.swing.*;

public class IfElse {
    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Informe o nuúmero:");
        int numero = Integer.parseInt(valor);

        if(numero % 2 == 0){
            System.out.println("par");
        }else
            System.out.println("impar");
    }
}
