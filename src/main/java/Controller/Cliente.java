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
    public static List<RankingCavalo> cliente(int cavaloAposta, int valorAposta) {
        Socket socket;
        final int PORTA = 1234;
        final String IP = "127.0.0.1";
        PrintStream out;
        Scanner in;
        String[] resultList = null;

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

            String resultado = in.nextLine();
            resultado = resultado.replace("[", "");
            resultado = resultado.replace("]", "");
            resultList = resultado.split(", ");
            System.out.println(resultado);
            System.out.println(resultList);

            socket.close();
            
        } catch (IOException | InterruptedException e) {
            System.out.println("Erro no cliente: " + e.getMessage());
        }
        
        return mapperRankingCavalos(resultList);
    }
    
    private static List<RankingCavalo> mapperRankingCavalos(String[] resultados){
            List<RankingCavalo> rankingCavalos = new ArrayList<>();
            for(int i = 0; i <= resultados.length ;  i+=2){
                RankingCavalo rankingCavalo = new RankingCavalo(resultados[i]);
                rankingCavalo.setTempoCavalo(Long.parseLong(resultados[i]));
                rankingCavalos.add(rankingCavalo);
            }
            
        
        return rankingCavalos;
    }
}
