package br.com.nicestocks.nicestocks;

import View.LoginScreen;
import com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.UIManager;

public class NiceStocks {

//    public static void main(String[] args) throws IOException {
//        try {
//            UIManager.setLookAndFeel(new FlatOneDarkIJTheme());
//        } catch (Exception ex) {
//            System.err.println("Failed to initialize LaF");
//        }
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new LoginScreen().setVisible(true);
//            }
//        });
//    }
    public static List<Integer> valoresRandomicos() {
        Random random = new Random();
        int numero;
        List<Integer> num = new ArrayList<>();
        while (num.size() < 5) {
            numero = random.nextInt(5);
            if (num.isEmpty() || !num.contains(numero)) {
                num.add(numero);
            }
        }
        System.out.println("Valores do vetor: " + num);
        return num;
    }

    public static void main(String[] args) {
        System.out.println(valoresRandomicos());
    }

}
