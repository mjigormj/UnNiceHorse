package Model;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class RunnableCavalo extends Thread {

    public JLabel button;
    public String nome;
    public long sleepTime;
    public String temporario = String.valueOf(sleepTime);
    public int velocidade = Integer.parseInt(temporario)/10;

    public RunnableCavalo(JLabel v1, String v2, long sleepTime) {
        button = v1;
        nome = v2;
        sleepTime = sleepTime;
        velocidade = Integer.parseInt(String.valueOf(sleepTime))/10;
    }

    @Override
    public void run() {

        while(button.getLocation().x < 470){
                try {
                    sleep(velocidade+10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(RunnableCavalo.class.getName()).log(Level.SEVERE, null, ex);
                }
                button.setBounds(button.getLocation().x + 1, button.getLocation().y, button.getWidth(), button.getHeight());
                System.out.println(velocidade);
            }
    }
}


