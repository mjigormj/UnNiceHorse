package Controller;

import Model.RankingCavalo;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Cliente {
    public static RankingCavalo cliente(int cavaloAposta, int valorAposta) {
        Socket socket;
        final int PORTA = 1234;
        final String IP = "127.0.0.1";
        PrintStream out;
        Scanner in;

        try {
            socket = new Socket(IP, PORTA);
            out = new PrintStream(socket.getOutputStream());
            in = new Scanner(socket.getInputStream());
            // enviando o cavalo que foi feita a aposta
            System.out.println("Corrida de Cavalos");
            Thread.sleep(1 * 1000);
            System.out.println("Cavalos -> 1-Imperatriz, 2-Duque, 3-Princesa (vc sabe quem), 4-Pé de Pano, 5-Pangaré");
            Thread.sleep(1 * 1000);
            System.out.println("");
            System.out.print("Escolha o número do cavalo em que você irá apostar (1 a 5): ");
            System.out.println(cavaloAposta);
            Thread.sleep(1 * 1000);
            System.out.println("Quanto deseja apostar: ");
            System.out.println(valorAposta);

//            while (cavaloAposta<1 || cavaloAposta >5 ) {
//                System.out.println("Escolha inválida!!!");
//                System.out.print("Selecione o número do cavalo que deseja apostar(1 a 5): ");
//                cavaloAposta = teclado.nextInt();
//            }

            out.println(cavaloAposta-1);
            out.println(valorAposta);

            // recebe o resultado da corrida
            
            // get the input stream from the connected socket
            InputStream inputStream = socket.getInputStream();
            // create a DataInputStream so we can read data from it.
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

            // read the list of messages from the socket
            List<RankingCavalo> rankingCavalos = new ArrayList();
            rankingCavalos.addAll((List<RankingCavalo>) objectInputStream.readObject());
            
            System.out.println("");
            System.out.println("resultado-> "+rankingCavalos);

            socket.close();
            
        } catch (IOException | ClassNotFoundException | InterruptedException e) {
            System.out.println("Erro no cliente: " + e.getMessage());
        }
        
        return new RankingCavalo();
    }
}
