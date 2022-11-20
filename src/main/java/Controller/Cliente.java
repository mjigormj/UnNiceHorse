package Controller;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
public class Cliente {
    public static void cliente() {
        Socket socket;
        final int PORTA = 1234;
        final String IP = "127.0.0.1";
        PrintStream out;
        Scanner in;
        Scanner teclado;

        try {
            socket = new Socket(IP, PORTA);
            out = new PrintStream(socket.getOutputStream());
            in = new Scanner(socket.getInputStream());
            teclado = new Scanner(System.in);
            // enviando o cavalo que foi feita a aposta
            System.out.println("Corrida de Cavalos");
            Thread.sleep(1 * 1000);
            System.out.println("Cavalos -> 1-Imperatriz, 2-Duque, 3-Princesa (vc sabe quem), 4-Pé de Pano, 5-Pangaré");
            Thread.sleep(1 * 1000);
            System.out.println("");
            System.out.print("Escolha o número do cavalo em que você irá apostar (1 a 5): ");
            int cavaloAposta = teclado.nextInt();
            System.out.println("Quanto deseja apostar: ");
            int valorAposta = teclado.nextInt();

            while (cavaloAposta<1 || cavaloAposta >5 ) {
                System.out.println("Escolha inválida!!!");
                System.out.print("Selecione o número do cavalo que deseja apostar(1 a 5): ");
                cavaloAposta = teclado.nextInt();
            }

            out.println(cavaloAposta-1);
            out.println(valorAposta);

            // recebe o resultado da corrida
            String resultado = in.nextLine();
            System.out.println("");
            System.out.println(resultado);
            
            teclado.close();
            socket.close();
            
        } catch (Exception e) {
            System.out.println("Erro no cliente: " + e.getMessage());
        }
    }
}
